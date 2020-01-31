package d200131;

import java.util.Scanner;

public class IfEx4 {
	public static void main(String[] args) {
		// 정수를 입력 받아 입력 받은 수가 홀수인지 아닌지 판별
		Scanner sc = new Scanner(System.in);
		int n;
		String s;

		System.out.print("정수 입력: ");
		n = sc.nextInt();

		/*
		 * s=n%2==1?"홀수":"짝수"; //if문을 이용하지 않아도 삼항연산으로 한 줄만으로도 표현할 수 있다.
		 */
		s = "짝수";
		if (n % 2 == 1) {
			s = "홀수";
		}

		System.out.println(n + ": " + s);
		sc.close();
	}
}
