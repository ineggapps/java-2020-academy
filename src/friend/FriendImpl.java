package friend;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FriendImpl implements Friend {
	public static final String KEY_NAME = "name";
	public static final String KEY_TEL = "tel";

	List<FriendVO> list = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public FriendImpl() {
		// 더미 데이터
		list.add(new FriendVO("사영서", "01000000001", "경기도 의정부시", "19991008"));
		list.add(new FriendVO("소상용", "01000000002", "경기도 포천시", "19891008"));
		list.add(new FriendVO("한명윤", "01000000003", "경기도 양주시", "19791008"));
		list.add(new FriendVO("채성미", "01000000004", "서울특별시 마포구", "19691008"));
		list.add(new FriendVO("최원철", "01000000005", "서울특별시 강남구", "19591008"));
		list.add(new FriendVO("정승제", "01000000006", "서울특별시 강동구", "19790708"));
		list.add(new FriendVO("최원철", "01000000007", "서울특별시 강북구", "19591008"));
		list.add(new FriendVO("임정혁", "01000000008", "경기도 양평군", "19591008"));
		list.add(new FriendVO("이중민", "01000000009", "강원도 영월군", "19591008"));
		list.add(new FriendVO("이필승", "01000000010", "강원도 춘천시", "19591008"));
		list.add(new FriendVO("김초아", "01000000011", "경기도 수원시", "19591008"));
	}

	@Override
	public void input() {
		System.out.println("\n친구 등록");

		// 동일한 이름과 동일한 전화번호가 있으면 등록 불가능
		FriendVO vo = inputProcess();
		list.add(vo);
	}

	public FriendVO inputProcess() {
		FriendVO vo = new FriendVO();
		System.out.print("이름 ? ");
		vo.setName(sc.nextLine());
		return inputProcess(vo, false);
	}

	public FriendVO inputProcess(FriendVO vo, boolean isUpdate) {
		// 이미 해당 전화번호가 등록이 되어있나?
		boolean valid = false;
		String tel;
		if (isUpdate) {
			System.out.print("이름 ? ");
			vo.setName(sc.nextLine());
		}
		do {
			System.out.print("전화번호 ? ");
			tel = sc.nextLine().replaceAll("-", "");
			valid = isCheckDuplicate(vo.getName(), tel);
			if (valid) {
				vo.setTel(tel);
			} else {
				System.out.println("이미 등록된 전화번호입니다. 다시 입력하세요.");
			}
		} while (!valid);// 유효하지 않으면 계속 다시 입력 받음
		System.out.print("주소 ? ");
		vo.setCity(sc.nextLine());
		System.out.print("생년월일 ? ");
		vo.setBirth(sc.nextLine().replaceAll("(\\-|\\.|/)", ""));
		return vo;
	}

	@Override
	public void print() {
		System.out.println("\n친구 목록...");
		// 이름, 전화번호, 주소, 생년월일, 나이(메서드 만들어서)
		int limit = 10;
		int maxPage = (list.size() / limit) + 1;
		for (int i = 0; i < list.size(); i++) {
			FriendVO vo = list.get(i);
			System.out.print((i + 1) + ": ");
			System.out.print(vo);
			System.out.print(", 만 " + toAge(vo.getBirth()) + "세");
			System.out.println();
			if ((i + 1) % limit == 0) {
				System.out.printf("Next(%d/%d) > ", (i / limit) + 2, maxPage);
				sc.nextLine();
			}
		}
		// 한 화면에 10개씩
	}

	public void print(List<FriendVO> list) {
		for (FriendVO vo : list) {
			System.out.println(vo);
		}
	}

	@Override
	public void findByName() {
		System.out.println("\n이름 검색...");
		// 앞부분과 일치해도 검색 (홍길동의 '홍'자만 입력해도 검색이 되도록)
		String name;
		System.out.print("이름 ? ");
		name = sc.nextLine();
		List<FriendVO> target = new ArrayList<>();
		for (FriendVO vo : list) {
			if (vo.getName().startsWith(name)) {
				target.add(vo);
			}
		}
		if (target.size() == 0) {
			System.out.println(name + ": 검색 결과 없음...");
			return;
		}
		print(target);
	}

	@Override
	public void update() {
		System.out.println("\n정보 수정...");
		// 수정 작업
		// 이름, 전화번호, 주소, 생년월일 모두 수정
		// 이름과 전화번호가 자신이 아닌 다른 사람과 일치하면 수정 불가능
		Map<String, String> map = getNameAndTel();
		// 수정 작업
		FriendVO vo = readFriend(map.get(KEY_NAME), map.get(KEY_TEL));
		// 등록된 자료가 있는지?
		if (vo == null) {
			System.out.println("조건에 만족하는 값이 없습니다.");
			return;
		}
		System.out.println("정보 수정에 필요한 값을 입력해 주세요.");
		inputProcess(vo,true);
	}

	@Override
	public void delete() {
		System.out.println("\n친구 삭제...");
		// 이름과 전화번호가 동일한 데이터 삭제
		Map<String, String> map = getNameAndTel();
		FriendVO vo = readFriend(map.get(KEY_NAME), map.get(KEY_TEL));
		if (vo == null) {
			System.out.println("삭제 실패: 일치하는 정보가 없습니다.");
			return;
		}
		System.out.println("삭제를 완료하였습니다.");
		System.out.println("삭제한 칼럼: " + vo);
		list.remove(vo);
	}

	public Map<String, String> getNameAndTel() {
		String name;
		String tel;
		System.out.print("이름 ? ");
		name = sc.nextLine();
		System.out.print("전화번호 ?");
		tel = sc.nextLine();

		Map<String, String> map = new HashMap<String, String>();
		map.put(KEY_NAME, name);
		map.put(KEY_TEL, tel);
		return map;
	}

	private FriendVO readFriend(String name, String tel) {
		// 이름과 전화번호가 동일한 친구를 검색
		for (FriendVO vo : list) {
			if (vo.getName().startsWith(name) && vo.getTel().equals(tel)) {
				return vo;
			}
		}
		return null;
	}

	public boolean isCheckDuplicate(String name, String tel) {
		for (FriendVO vo : list) {
			if (vo.getName().equals(name) && vo.getTel().equals(tel)) {
				return false;
			}
		}
		return true;/// 중복되지 않으면 true를 반환한다.
	}

	public boolean isCheckDate(String birth) {
		birth = birth.replaceAll("(\\-|\\.|/)", "");
		if (birth.length() != 8) {
			return false;
		}

		try {
			int y = Integer.parseInt(birth.substring(0, 4));
			int m = Integer.parseInt(birth.substring(4, 6));
			int d = Integer.parseInt(birth.substring(6));

			if (m < 1 || m > 12) {
				return false;
			}

			Calendar cal = Calendar.getInstance();
			cal.set(y, m - 1, 1);
			int days = cal.getActualMaximum(Calendar.DATE);
			if (d < 1 || d > days) {
				return false;
			}

		} catch (Exception e) {
			return false;
		}

		return true;
	}

	public int toAge(String birth) {
		int age = 0;

		if (!isCheckDate(birth)) {
			throw new RuntimeException("날짜 형식 오류...");
		}

		birth = birth.replaceAll("(\\-|\\.|/)", "");

		try {
			int y = Integer.parseInt(birth.substring(0, 4));
			int m = Integer.parseInt(birth.substring(4, 6));
			int d = Integer.parseInt(birth.substring(6));

			Calendar now = Calendar.getInstance();

			age = now.get(Calendar.YEAR) - y;
			if (m > now.get(Calendar.MONTH) + 1
					|| m == now.get(Calendar.MONTH) + 1 && d > now.get(Calendar.DAY_OF_MONTH)) {
				age--;
			}
		} catch (Exception e) {
			throw new RuntimeException("날짜 형식 오류...");
		}

		return age;
	}

}
