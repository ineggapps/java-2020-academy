package d200207;

import java.util.Scanner;

public class CustomQuiz3 {
	public static void main(String[] args) {
		// 홀짝 게임
		Scanner sc = new Scanner(System.in);
		int com;
		int user;
		// 1. 홀 2. 짝 3. 종료
		while (true) {
			System.out.println("지금 컴퓨터가 생각하는 숫자는 홀수일까요, 짝수일까요?");
			System.out.print("1.홀, 2.짝, 3.종료 > ");
			user = sc.nextInt();

			// 입력값 검증
			if (user < 1 && user > 3) {
				continue;
			} else if (user == 3) {
				break;
			}

			// 출력
			com = (int) (Math.random() * 100) + 1;
			System.out.println("컴퓨터: " + com);
			System.out.println("사용자: " + (user == 1 ? "홀수" : "짝수"));
			if (com % 2 == user % 2) {
				System.out.println("맞혔습니다.");
			} else {
				System.out.println("틀렸습니다.");
				break;
			}
		}

		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}
}
