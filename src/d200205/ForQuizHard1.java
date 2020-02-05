package d200205;

import java.util.Scanner;

public class ForQuizHard1 {
	//5개의 정수를 입력 받아 입력 받은 정수 중 7에 가장 가까운 수를 출력하는 프로그램을 작성
	/*
	 * 1. 5개의 정수는 for문을 이용하여 입력 받는다
	 * 만약 6과 8처럼 차이가 같은 수인 경우 먼저 입력한 수를 출력한다
	 * 정수의 입력은 Scanner 클래스의 nextInt()메서드를 이용한다.
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, num7 = 0;// 입력 수, 입력 수에서 7 빼기
		int best = 0, best7 = 0;// 가장 가까운 수, 가장 가까운 수에서 7 뺌
		System.out.println("5개의 숫자를 입력하세요... ");
		for (int i = 0; i < 5; i++) {
			num = sc.nextInt();
			num7 = num - 7;
			num7 = num7 > 0 ? num7 : -num7; // 절댓값으로 변경
			if (best7 > num7 || i==0) {
				best = num;
				best7 = num - 7;
				best7 = best7 > 0 ? best7 : -best7;
			}
		}
		System.out.println("7에 가장 가까운 수: " + best);
		sc.close();
	}
}
