package d200131;

import java.util.Scanner;

public class IfEx6 {
	public static void main(String[] args) {
		// �� ���ڸ� �Է¹޾Ƽ� �빮��, �ҹ���, ��Ÿ�������� �Ǻ��ϱ�
		// else ���� �ۼ�
		Scanner sc = new Scanner(System.in);
		char c;

		System.out.print("�� ���� �Է�: ");
		c = sc.next().charAt(0);

		if (c >= 'A' && c <= 'Z') {
			System.out.println("�Է� ���ڴ� �빮��");
		}
		
		if (c >= 'a' && c <= 'z') {
			System.out.println("�Է� ���ڴ� �ҹ���");
		}
		
		if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')) {
			System.out.println("�Է� ���ڴ� ��Ÿ ����");
		}

		sc.close();
	}
}
