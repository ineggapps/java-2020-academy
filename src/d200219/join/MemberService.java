package d200219.join;

import java.util.Scanner;

public class MemberService extends Member {
	private Scanner sc = new Scanner(System.in);
	private MemberResult mr = new MemberResult(this);

	public void input() {
		System.out.println("\n������ �Է�... ");

		System.out.print("���̵�: ");
		MemberVO vo = new MemberVO();
		vo.setId(sc.next());

		System.out.print("��й�ȣ: ");
		vo.setPwd(sc.next());

		System.out.print("�̸�: ");
		vo.setName(sc.next());

		System.out.print("�������: ");
		vo.setBirth(sc.next());

		int result = append(vo);
		if (result == -1) {
			System.out.println("���� �ʰ�");
		} else {
			System.out.println("��� �Ϸ�");
		}

	}

	public void print() {
		System.out.println("\n������ ���...");
		mr.write();
	}

	public void findById() {
		System.out.println("\n���̵� �˻�...");

		String id;
		System.out.print("�˻��� ���̵�: ");
		id = sc.next();

		MemberVO vo = get(id);
		if (vo == null) {
			System.out.println("��ϵ� ���̵� �ƴմϴ�.");
		} else {
			System.out.println(vo);
		}
		System.out.println();
	}
}
