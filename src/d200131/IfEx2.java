package d200131;

import java.util.Scanner;

public class IfEx2 {
	public static void main(String[] args) {
		// 정수를 입력 받아 입력 받은 수가 홀수인지 판별
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.print("정수 입력: ");
		n = sc.nextInt();

//		if (n % 2 == 1) {
		if ((int)(n & 1) == 1) {
			System.out.println(n + "은 홀수입니다.");
		}

		sc.close();
	}
}
