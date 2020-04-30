package d200227;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a, b, c;

		System.out.println("문자열 3개 입력...");

		a = sc.next();//기본 구분자 공백(엔터 포함)
		b = sc.next();
		c = sc.next();

		System.out.println(a + ":" + b + ":" + c);

		sc.close();
	}
}
