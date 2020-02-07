package d200207;

import java.util.Scanner;

public class ArrayQuiz2Answer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		int max, min, tot;

		tot = max = min = 0;
		// 입력 및 전체 점수의 합
		for (int i = 0; i < 5; i++) {
			do {
				System.out.print((i + 1) + "번째 점수: ");
				score[i] = sc.nextInt();
			} while (score[i] < 0 || score[i] > 10);
			tot += score[i];
		}

		// 최댓값, 최솟값, 취득점수 구하기
		max = min = score[0];
		for (int i = 1; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
			} else if (min > score[i]) {
				min = score[i];
			}
		}
		
		System.out.print("점수 리스트: ");
		for(int s:score) {
			System.out.print(s+"\t");
		}
		System.out.printf("\n취득점수: %d",tot-max-min);
		sc.close();
	}
}
