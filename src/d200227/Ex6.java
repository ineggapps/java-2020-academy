package d200227;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int a, b, c;
			System.out.print("�� �� ? ");
			a = sc.nextInt();// �⺻ �ܶ� ���ڴ� ����(���� ����)
			b = sc.nextInt();
			c = sc.nextInt();
			System.out.printf("%d:%d:%d%n", a, b, c);
		} finally {
			sc.close();
		}
	}
}
