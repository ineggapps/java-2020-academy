package d200131;

import java.util.Scanner;

public class OperEx6 {
	public static void main(String[] args) {
		// 정수를 입력 받아 짝수인지 홀수인지를 판별
		Scanner sc = new Scanner(System.in);
		int a;
		String s;

		System.out.print("정수 입력: ");
		a = sc.nextInt();

		s = a % 2 == 0 ? "짝수" : "홀수";
		s = (a & 1) == 0 ? "짝수" : "홀수";
		System.out.println(a + "은 " + s + "입니다.");

		sc.close();
	}
}
