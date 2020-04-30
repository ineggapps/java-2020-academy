package d200131;

import java.util.Scanner;

public class IfQuiz4Advanced {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;

		System.out.print("점수? ");
		a = sc.nextInt();

		// 가장 바깥 if문에서 0~100점이 아닌 경우 입력 오류라는 메시지를 출력하도록 하였다.
		// 따라서 안쪽에서 점수별로 차등하여 학점을 출력하는 구문에서는 복잡한 조건식을 작성하지 않아도 된다.
		if (a > 0 && a <= 100) {
			if (a >= 95) {
				System.out.println(a + ": 4.5");
			} else if (a >= 90) {
				System.out.println(a + ": 4.0");
			} else if (a >= 85) {
				System.out.println(a + ": 3.5");
			} else if (a >= 80) {
				System.out.println(a + ": 3.0");
			} else if (a >= 75) {
				System.out.println(a + ": 2.5");
			} else if (a >= 70) {
				System.out.println(a + ": 2.0");
			} else if (a >= 65) {
				System.out.println(a + ": 1.5");
			} else if (a >= 60) {
				System.out.println(a + ": 1.0");
			} else {
				System.out.println(a + ": 0.0");
			}
		} else {
			System.out.println("입력 오류");
		}

		sc.close();
	}
}
