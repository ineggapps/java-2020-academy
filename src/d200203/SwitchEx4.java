package d200203;

import java.util.Scanner;

public class SwitchEx4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.print("����� ����(mon, tue, wed, thu, fri, sat, sun) �Է�: ");
		s = sc.next();
		// s�� 7.0���� �����մϴ�.
		switch (s) {
		case "mon":
			System.out.println("������");
			break;
		case "tue":
			System.out.println("ȭ����");
			break;
		case "wed":
			System.out.println("������");
			break;
		case "thu":
			System.out.println("�����");
			break;
		case "fri":
			System.out.println("�ݿ���");
			break;
		case "sat":
			System.out.println("�����");
			break;
		case "sun":
			System.out.println("�Ͽ���");
			break;
		}
		sc.close();
	}
}
