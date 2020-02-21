package d200221;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] names = new String[3];
		int idx = 0;

		try {

			System.out.println("�̸� �Է�[����:������ �Է����� �ʰ� ���͸� ��������]...");
			String s;
			while ((s = sc.nextLine()).length() != 0) {
				names[idx++] = s;
				System.out.print("�̸� �Է�: ");// ���ܰ� �߻��ϸ� �������� ����
			}
			System.out.println("------------------------");//���ܰ� �߻��ϸ� ������ �������� �ʰ� ����ģ��.
		} catch (ArrayIndexOutOfBoundsException e) {
			// ArrayIndexOutOfBoundsException : unchecked ����
			// �迭�� ÷�ڰ� ������ ����� �߻��ϴ� ����
			System.out.println("�Է��� �ʰ��߽��ϴ�.");
		} finally {
			// try{} finally{}ó�� catch�� ��� �����ϴ�.
			System.out.println("���ܿ� ������� ����˴ϴ�.");
			sc.close();
		}

		for (String str : names) {
			System.out.print(str + " ");
		}

		System.out.println("End...");

		try {
			System.out.println("try����");
		} finally {
			System.out.println("finally���� (catch����)");
		}
	}
}
