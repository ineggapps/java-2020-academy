package d200204;

import java.util.Scanner;

public class WhileQuizHard6 {
	public static void main(String[] args) {
		// 1~100까지의 난수를 발생시켜 몇 번에 맞추는지 출력하는 프로그램 작성하기
		Scanner sc = new Scanner(System.in);
		int number = (int) (Math.random() * 100) + 1;
		int input, cnt = 0;

		while (true) {
			cnt++;
			System.out.print("수? ");
			input = sc.nextInt();
			if (number == input) {
				break;
			} else if (number > input) {
				System.out.println("입력한 수보다는 큰 수 입니다.");
			} else {
				System.out.println("입력한 수보다는 작은 수입니다.");
			}
		}

		System.out.printf("%d번 만에 성공했습니다.", cnt);
		sc.close();
	}
}
