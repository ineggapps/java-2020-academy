package d200131;

import java.util.Scanner;

public class OperEx6 {
	public static void main(String[] args) {
		// ������ �Է� �޾� ¦������ Ȧ�������� �Ǻ�
		Scanner sc = new Scanner(System.in);
		int a;
		String s;

		System.out.print("���� �Է�: ");
		a = sc.nextInt();

		s = a % 2 == 0 ? "¦��" : "Ȧ��";
		s = (a & 1) == 0 ? "¦��" : "Ȧ��";
		System.out.println(a + "�� " + s + "�Դϴ�.");

		sc.close();
	}
}
