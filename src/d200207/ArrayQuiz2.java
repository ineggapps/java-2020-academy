package d200207;

import java.util.Scanner;

public class ArrayQuiz2 {
	public static void main(String[] args) {
		// 5개의 점수(0~10)를 입력 받아 최대 점수와 최소 점수를 뺀 합을 구하는 프로그램 작성하기
		Scanner sc = new Scanner(System.in);
		int scores[] = new int[5];
		int sum = 0;
		int max = 0, min = 0;

		for (int i = 0; i < scores.length; i++) {
			do {
				System.out.printf("%d번째 점수: ", i + 1);
				scores[i] = sc.nextInt();
			} while (scores[i] < 0 || scores[i] > 10);
			sum+=scores[i];
			if (i == 0) {
				max = scores[i];
				min = scores[i];
			} else {
				if (max < scores[i]) {
					max = scores[i];
				} else if (min > scores[i]) {
					min = scores[i];
				}
			}
		}

		System.out.print("점수 리스트: ");
		for( int s: scores) {
			System.out.printf("%d\t",s);
		}
		System.out.println();
		System.out.printf("취득 점수: %d",sum-max-min
				);
		sc.close();
	}
}
