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
				//TODO: 중복된 값이 나올 수 있다. 중복을 어떻게 해결하느냐?
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

