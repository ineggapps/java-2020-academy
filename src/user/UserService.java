package user;

import java.util.Scanner;

public class UserService {
	private Scanner sc = new Scanner(System.in);
	private User user = new User();
	//�����ڸ� ���� ���� ���踦 �����Ѵ�.
	private UserResult ur = new UserResult(user);

	public void input() {
		System.out.println("\n�ڷ� ���...");

		UserVO vo = new UserVO();

		//�̸� �Է�
		System.out.print("�̸� ? ");
		vo.setName(sc.next());
	
		//���� �Է�
		System.out.print("���� ? ");
		vo.setAge(sc.nextInt());

		user.append(vo);
		System.out.println(vo.getName() + "�� �ڷ� ��� �Ϸ�...");
	}

	public void print() {
		ur.write();
	}

}
