package d200207;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz3 {
	public static void main(String[] args) {
		//로또의 구매 개수를 입력 받아 구매 개수만큼의 로또를 출력하는 프로그램 만들기
		Scanner sc = new Scanner(System.in);
		int num[] = new int[6];
		int amount;

		// 입력
		do {
			System.out.print("구매 개수[1~5] ? ");
			amount = sc.nextInt();
		} while (amount < 1 || amount > 5);

		for (int i = 0; i < amount; i++) {

			// 랜덤하게 섞기
			for (int j = 0; j < num.length; j++) {
				num[j] = (int) (Math.random() * 45) + 1;
				for(int k=0;k<j;k++) {
					if(num[j]==num[k]) {
						j--;//횟수 차감하고 다시 추출을 실행함
						break;
					}
				}
			}
			// 정렬하기
			Arrays.sort(num);

			// 출력하기
			System.out.printf("%d번째: ", i + 1);
			for (int j = 0; j < num.length; j++) {
				System.out.printf("%d\t\t", num[j]);
			}
			System.out.println();
		}

		sc.close();

	}
}

