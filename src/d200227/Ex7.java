package d200227;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a, b, c;

		System.out.println("���ڿ� 3�� �Է�...");

		a = sc.next();//�⺻ ������ ����(���� ����)
		b = sc.next();
		c = sc.next();

		System.out.println(a + ":" + b + ":" + c);

		sc.close();
	}
}
