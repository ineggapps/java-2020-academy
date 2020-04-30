package d200210;

import java.util.Scanner;

public class ScoreEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt;
		String[] name;
		int[] score;
		int[] rank;

		do {
			System.out.print("인원 수[1~50]?");
			cnt = sc.nextInt();
		} while (cnt < 1 || cnt > 50);

		// 인원수만큼 배열 메모리를 할당한다.
		name = new String[cnt];
		score = new int[cnt];
		rank = new int[cnt];

		// 인원수만큼 이름과 점수를 입력받는다.
		for (int i = 0; i < cnt; i++) {
			System.out.print((i + 1) + "번째 이름 ? ");
			name[i] = sc.next();
			System.out.print("점수? ");
			score[i] = sc.nextInt();
		}

//		입력 대신 디버깅 데이터
//		cnt = 5;
//		name = new String[] { "a", "b", "c", "d", "e" };
//		score = new int[] { 90, 80, 90, 100, 70 };
//		rank = new int[cnt];
		
		// 순위 초기화하기
		for (int i = 0; i < cnt; i++) {
			rank[i] = 1;
		}

		// 석차 계산하기
		for (int i = 0; i < cnt - 1; i++) {
			for (int j = i + 1; j < cnt; j++) {
				/*
				 1. 크다
				 2. 작다
				 3. 같다
				 */
				if (score[i] > score[j]) {
					rank[j]++;
				} else if (score[i] < score[j]) {
					rank[i]++;
				}
			}
		}

		// 출력
		System.out.println("이름\t점수\t석차");
		for (int i = 0; i < cnt; i++) {
			System.out.println(name[i] + "\t" + score[i] + "\t" + rank[i]);
		}

		sc.close();
	}
}
