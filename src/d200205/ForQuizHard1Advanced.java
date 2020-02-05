package d200205;

import java.util.Scanner;

public class ForQuizHard1Advanced {
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

			if (i == 0) {
			}
		}
		System.out.println("7에 가장 가까운 수: " + best);
		sc.close();
	}
}
