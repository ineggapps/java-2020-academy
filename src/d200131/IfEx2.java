package d200131;

import java.util.Scanner;

public class IfEx2 {
	public static void main(String[] args) {
		// ������ �Է� �޾� �Է� ���� ���� Ȧ������ �Ǻ�
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.print("���� �Է�: ");
		n = sc.nextInt();

//		if (n % 2 == 1) {
		if ((int)(n & 1) == 1) {
			System.out.println(n + "�� Ȧ���Դϴ�.");
		}

		sc.close();
	}
}
