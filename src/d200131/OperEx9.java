package d200131;

import java.util.Scanner;

public class OperEx9 {
	/*
	 * 정수를 입력 받아 양수인지 음수인지 영인지를 판별 정수?10 10: 양수
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		String result;
		System.out.print("정수 입력: ");
		num = sc.nextInt();

		/*
		 * 경우의 수 1. 0일 때 2. 양수일 때 3. 음수일 때
		 */
//		result = num==0? "0": num>0?"양수":"음수";
		result = num > 0 ? "양수" : num < 0 ? "음수" : "0";
		System.out.printf("%d는 %s입니다.", num, result);
		sc.close();
	}
}
