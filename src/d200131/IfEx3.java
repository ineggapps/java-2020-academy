package d200131;

import java.util.Scanner;

public class IfEx3 {
	public static void main(String[] args) {
		// ������ �Է� �޾� �Է� ���� ���� Ȧ������ �ƴ��� �Ǻ�
		Scanner sc = new Scanner(System.in);
		int n;
		String s;

		System.out.print("���� �Է�: ");
		n = sc.nextInt();

		 s= "Ȧ���� �ƴ�";
		if (n % 2 == 1) {
			s = "Ȧ��";
		}
		System.out.println(n + ": " + s);

		sc.close();
	}
}
