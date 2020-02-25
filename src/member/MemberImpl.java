package member;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MemberImpl implements Member {

	private Scanner sc = new Scanner(System.in);
	// 키: 이메일, 값: memberVO 객체
	private Map<String, MemberVO> map = new HashMap<>();

	public MemberImpl() {
		map.put("jsj@gmail.com", new MemberVO("정승제", "1234", "01012341234", "19921002"));
		map.put("lsj@gmail.com", new MemberVO("이선재", "4321", "01012341235", "19771112"));
		map.put("jhg@gmail.com", new MemberVO("전한길", "1111", "01012341236", "19701002"));
		map.put("mdg@gmail.com", new MemberVO("문동균", "2222", "01012341237", "19820208"));
	}

	@Override
	public void input() {
		System.out.println("\n회원가입");
		// 이메일(키), 패스워드, 이름, 전화번호, 생년월일
		// 이메일 중복체크
		String email;
		System.out.print("이메일 ? ");
		email = sc.next();

		if (map.containsKey(email)) {
			System.out.println("등록된 이메일입니다.");
			return;
		}

		try {
			MemberVO vo = new MemberVO();
			System.out.print("비밀번호 ? ");
			vo.setPwd(sc.next());
			System.out.print("이름 ? ");
			vo.setName(sc.next());
			System.out.print("전화번호? ");
			vo.setTel(sc.next());
			System.out.print("생년월일 ? ");
			vo.setBirth(sc.next());

			map.put(email, vo);
		} catch (Exception e) {
			e.printStackTrace();
			sc.nextLine();
		}
	}

	@Override
	public void print() {
		System.out.println("\n회원 리스트");
		System.out.println("회원 수: " + map.size());
		// 이메일, 이름, 전화번호, 생년월일(+나이*)
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String email = it.next();
			MemberVO vo = map.get(email);
			System.out.println(vo);
		}
		System.out.println();
	}

	class MemberInfo {
		private String email;
		private MemberVO vo;

		public String getEmail() {
			return email;
		}

		public MemberVO getVo() {
			return vo;
		}

		public MemberInfo(String email, MemberVO vo) {
			this.email = email;
			this.vo = vo;
		}
	}

	public MemberInfo authenticate() throws InvalidPasswordException, NotFoundException {
		MemberVO vo;
		String email;
		String pwd;
		
		System.out.print("이메일 입력 ? ");
		email = sc.next();
		vo = map.get(email);

		if (vo == null) {
			// 존재하지 않는 경우
//				System.out.println("가입되지 않은 이메일입니다.");
			throw new NotFoundException();
		}

		System.out.print("암호 입력 ? ");
		pwd = sc.next();

		if (!vo.getPwd().equals(pwd)) {
			// 비밀번호가 일치하지 않으면 예외 던지기
			throw new InvalidPasswordException();
		}

		return new MemberInfo(email, vo);

	}

	@Override
	public void update() {
		System.out.println("\n수정");
		// 이메일 입력
		// 데이터 검색=>존재하면 pwd입력 => 일치하면 수정 가능
		// 데이터가 없거나 패스워드가 일치하지 않으면 오류 메시지 후 메인 메뉴로
		MemberVO vo;
		String email;

		try {
			MemberInfo info = authenticate();
			if (info == null) {
				return;
			}
			email = info.getEmail();
			vo = info.getVo();

			// 수정 작업
			System.out.println("===수정 작업을 시작합니다===");
			System.out.print("비밀번호 ? ");
			vo.setPwd(sc.next());
			System.out.print("이름 ? ");
			vo.setName(sc.next());
			System.out.print("전화번호? ");
			vo.setTel(sc.next());
			System.out.print("생년월일 ? ");
			vo.setBirth(sc.next());

			System.out.println(vo.getName() + "님의 정보 수정이 완료되었습니다.");
		} catch (NotFoundException e) {
			System.out.println(e.getMessage());
		} catch (InvalidPasswordException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void delete() {
		System.out.println("\n회원 탈퇴");
		// 이메일 입력
		// 데이터 검색 > 존재하면 패스워드 입력 > 일치하면 삭제
		// 데이터가 없거나 패스워드가 일치하지 않으면 오류 메시지 후 메인 메뉴로
		String email;
		MemberVO vo;
		try {
			MemberInfo info = authenticate();
			if (info == null) {
				return;
			}
			email = info.getEmail();
			vo = info.getVo();

			char confirm;
			System.out.print("정말 삭제하시겠습니까? (y/n)");
			confirm = sc.next().charAt(0);
			if (confirm == 'y' || confirm == 'Y') {
				map.remove(email);
				System.out.println(email + "의 정보가 삭제되었습니다.");
			} else {
				System.out.println("취소되었습니다.");
			}

		} catch (NotFoundException e) {
			System.out.println(e.getMessage());
		} catch (InvalidPasswordException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void findByEmail() {
		System.out.println("\n이메일로 검색");
		String email;
		System.out.print("검색할 이메일 ? ");
		email = sc.next();

		MemberVO vo = map.get(email);
		if (vo == null) {
			System.out.println("등록되지 않은 회원입니다.");
			return;
		}

		System.out.println(email + " 정보 조회 결과...");
		System.out.println(vo.toStringExceptPwd());
		System.out.println();
	}

	@Override
	public void findByName() {
		System.out.println("\n이름으로 검색");

		String name;
		System.out.print("검색할 이름?");
		name = sc.next();

		boolean exist = false;
		// 동명이인도 있음을 감안하여 이름을 검색한다.
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String email = it.next();
			MemberVO vo = map.get(email);
			if (vo.getName().indexOf(name) >= 0) {
				System.out.println(vo.toStringExceptPwd());
				exist = true;
			}
		}

		if (!exist) {
			System.out.println(name + "님 검색 결과가 없습니다...");
		}
		System.out.println();
	}

}
