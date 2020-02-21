package d200221;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		User8 u = new User8();
		u.input();
	}
}

class User8 {
	private Scanner sc = new Scanner(System.in);

	private int inputScore() {
		int result = 0;
		// �ƹ������� try{}catch{}����� ���� ������ �� �̻��ϰ� ������ �� ���� �ִ�.
		// ���� �Է¿��� ������ �߻��ϸ� ��ȭ��ȣ�� �������� �ùٸ��� �Էµ��� ���� ���ڰ� �ԷµǾ� ���α׷��� ����ȴ�.
		// inputScore�� �θ� �޼����� input�޼��忡�� ������ �߻��ߴٰ� �˷����� �ʰ� ��ü������ ������ ���ȴ�.
		// �׷��� ����� ������������ ��� ���ڿ����� ������ �õ��Ϸ��ٰ� ������ ���޾� �߻��ϰ� ����ó���� ����ȴ�.
		// input�޼���� ������ �� ����� ���� ���� ä ���ڿ��� �Է��� tel = sc.next()�������� ���������� �����Ѵ�.
		// ��������� String�� ���� �޴� tel = sc.next();�������� ���ڿ��� �Էµ� �ڿ� ���α׷��� ����ȴ�.
		try {
			result = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("���ڸ� �Է� �����մϴ�.");
			sc.nextLine();//������ �ִ� �����͸� �о ����
			//���ܸ� ��������� �߻���Ų��.
//			throw new Exception("���ڸ� �Է� �����մϴ�");
		}
		return result;
	}

	public void input() {
		String name, tel;
		int kor, eng;

		System.out.print("�̸� ? ");
		name = sc.next();

		System.out.print("���� ? ");
		kor = inputScore();

		System.out.print("���� ? ");
		eng = inputScore();

		System.out.print("��ȭ��ȣ ? ");
		tel = sc.next();

		System.out.println(name + ":" + kor + ":" + eng + ":" + tel);

	}
}