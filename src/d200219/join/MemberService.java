package d200219.join;

import java.util.Scanner;

public class MemberService extends Member {
	private Scanner sc = new Scanner(System.in);
	private MemberResult mr = new MemberResult(this);

	public void input() {
		System.out.println("\n데이터 입력... ");

		System.out.print("아이디: ");
		MemberVO vo = new MemberVO();
		vo.setId(sc.next());

		System.out.print("비밀번호: ");
		vo.setPwd(sc.next());

		System.out.print("이름: ");
		vo.setName(sc.next());

		System.out.print("생년월일: ");
		vo.setBirth(sc.next());

		int result = append(vo);
		if (result == -1) {
			System.out.println("정원 초과");
		} else {
			System.out.println("등록 완료");
		}

	}

	public void print() {
		System.out.println("\n데이터 출력...");
		mr.write();
	}

	public void findById() {
		System.out.println("\n아이디 검색...");

		String id;
		System.out.print("검색할 아이디: ");
		id = sc.next();

		MemberVO vo = get(id);
		if (vo == null) {
			System.out.println("등록된 아이디가 아닙니다.");
		} else {
			System.out.println(vo);
		}
		System.out.println();
	}
}
