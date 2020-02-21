package d200221;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User16 user = new User16();

		try {
			System.out.print("�̸� ? ");
			user.setName(sc.next());
			System.out.print("���� ? ");
			user.setAge(sc.nextInt());
			System.out.println(user.getName() + ":" + user.getAge());
		} catch (InputMismatchException e) {
			System.out.println("���ڸ� �Է��ϼ���.");
		} catch (AgeValidException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {// InputMismatchException�� AgeValidException �̿��� ���ܰ� �߻��� ���
			System.out.println("�Է� ����");
		} finally {
			sc.close();
		}

		System.out.println("���α׷� ����");
	}
}

//����� ���� ���� Ŭ���� �ۼ�
class AgeValidException extends Exception {
	private static final long serialVersionUID = 1L;

	// serialVersionUID: Exception�� �ſ��� ���� (�������� ������ �����Ϸ��� �ڵ����� �ٿ� ��)
	// �л�ȯ�� ���� ��Ʈ��ũ ȯ�濡���� ���̴� �����̹Ƿ� ������ ����.
	public AgeValidException() {
		this("AgeValidException");
	}

	public AgeValidException(String message) {
		super(message);
	}
}

class User16 {
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

	public void setAge(int age) throws AgeValidException {
		if (age < 0) {
			throw new AgeValidException("���̴� 0���� ũ�ų� ���ƾ��մϴ�.");
		}
		this.age = age;

	}
}