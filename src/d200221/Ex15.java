package d200221;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User15 user = new User15();

		try {
			System.out.print("�̸� ? ");
			user.setName(sc.next());
			System.out.print("���� ? ");
			user.setAge(sc.nextInt());
			System.out.println(user.getName() + ":" + user.getAge());
		} catch (Exception e) {
			System.out.println("�Է� ����");
		} finally {
			sc.close();
		}

		System.out.println("���α׷� ����");
	}
}

class User15 {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		if (age < 0) {
			throw new Exception("���̴� 0���� ũ�ų� ���ƾ��մϴ�.");
		}
		this.age = age;

	}
}