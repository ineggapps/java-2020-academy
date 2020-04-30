package d200227;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int a, b, c;
			System.out.print("세 수 ? ");
			a = sc.nextInt();// 기본 단락 문자는 공백(엔터 포함)
			b = sc.nextInt();
			c = sc.nextInt();
			System.out.printf("%d:%d:%d%n", a, b, c);
		} finally {
			sc.close();
		}
	}
}
