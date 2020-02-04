package d200204;

import java.util.Scanner;

public class ForQuiz5Advanced {
	public static void main(String[] args) {
		// 10개의 정수를 입력 받은 정수 중 가장 큰 값을 출력하는 프로그램 작성하기
		Scanner sc = new Scanner(System.in);
		int max = Integer.MIN_VALUE, n;
		System.out.println("(최댓값 구하기) 10개의 정수 입력");
		for (int i = 1; i <= 10; i++) {
			n = sc.nextInt();
			// 첫 번째 번지의 값을 최댓값을 세팅해놓고 비교하기
			if (max < n) {
				max = n;
			}
		}
		System.out.println("최댓값: " + max);
		sc.close();
	}
}
