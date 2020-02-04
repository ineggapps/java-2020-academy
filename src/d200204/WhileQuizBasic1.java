package d200204;

import java.util.Scanner;

public class WhileQuizBasic1 {
	/*
	 * 정수를 입력 받아 1부터 입력 받은 수까지의 합, 짝수의 합, 홀수의 합을 구하는 프로그램 작성하기
	 * While문을 이용하여 작성.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int n = 0, odd = 0, even = 0, sum = 0;
		System.out.print("수 ? ");
		num = sc.nextInt();
		while (n < num) {
			n++;
			sum += n;
//			if (n % 2 == 0) {
			if ((n & 1) == 0) {
				//짝수 덧셈
				even += n;
			} else {
				// 홀수 덧셈
				odd += n;
			}
		}
		System.out.printf("1~%d까지의 합 = %d\n", num, sum);
		System.out.printf("1~%d까지 짝수의 합 = %d\n", num, even);
		System.out.printf("1~%d까지 홀수의 합 = %d\n", num, odd);
		sc.close();
	}
}
