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

	// throws Exception: �޼��带 ȣ���� ������ Exception checked ���ܸ� catch�Ͽ��� �Ѵٰ� ����� ��.
	// cf) RuntimeException class�� unchecked exception�̴�.
	//throws ���� ���� ���� ������, ��������δ� �޼��� �ȿ��� throw new ������ ���� �����Ѵ�.
	//throws: Ư�� ������ ��Ȳ�� �߻��� �� �ִٴ� ���� ��� 
	//throw: Ư�� ������ ��Ȳ�� �߻��ؾ� �� �� throw new ~�� �޼��� ���ο��� ������ ����� �� ȣ���� �޼��������� ������ ��Ȳ�� ���޵�.
	//Exception�� Ŭ�����̹Ƿ� ���ο� ������ ��ü�� ����(new)�Ͽ� ȣ���� �޼��������� �Ѱ��־�� �Ѵ�.
	private int inputScore() throws Exception {
		int result = 0;
		// �ƹ������� try{}catch{}����� ���� ������ �� �̻��ϰ� ������ �� ���� �ִ�.
		// ���� �Է¿��� ������ �߻��ϸ� ��ȭ��ȣ�� �������� �ùٸ��� �Էµ��� ���� ���ڰ� �ԷµǾ� ���α׷��� ����ȴ�.
		// inputScore�� �θ� �޼����� input�޼��忡�� ������ �߻��ߴٰ� �˷����� �ʰ� ��ü������ ������ ���ȴ�.
		// �׷��� ����� ������������ ��� ���ڿ����� ������ �õ��Ϸ��ٰ� ������ ���޾� �߻��ϰ� ����ó���� ����ȴ�.
		// input�޼���� ������ �� ����� ���� ���� ä ���ڿ��� �Է��� tel = sc.next()�������� ���������� �����Ѵ�.
		// ��������� String�� ���� �޴� tel = sc.next();�������� ���ڿ��� �Էµ� �ڿ� ���α׷��� ����ȴ�.
		try {
			result = sc.nextInt();
			if (result < 0 || result > 100) {
				//���� ����. ������ �����ϰ� ȣ�� �Լ� �ʿ��� ���ܸ� �߻���Ŵ.
				throw new Exception("������ 0~100 ���̸� �����մϴ�.");
			}
		} catch (InputMismatchException e) {
//			System.out.println("���ڸ� �Է� �����մϴ�.");
			sc.nextLine();// ������ �ִ� �����͸� �о ����
			// ���ܸ� ��������� �߻���Ų��.
			throw new Exception("���ڸ� �Է� �����մϴ�");
		}
		return result;
	}

	public void input() {
		String name, tel;
		int kor, eng;

		try {
			System.out.print("�̸� ? ");
			name = sc.next();

			System.out.print("���� ? ");
			kor = inputScore();

			System.out.print("���� ? ");
			eng = inputScore();

			System.out.print("��ȭ��ȣ ? ");
			tel = sc.next();

			System.out.println(name + ":" + kor + ":" + eng + ":" + tel);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("-----------------------------------");
	}
}