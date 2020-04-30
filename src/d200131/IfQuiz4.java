package d200131;

import java.util.Scanner;

public class IfQuiz4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;

		System.out.print("점수? ");
		a = sc.nextInt();

		//범위를 이중으로 지정하지 않으면 100을 초과하는 숫잣값을 입력할 때 4.0 결괏값이 나온다.
		//현재의 조건식은 너무 복잡하고 지저분해서 보기가 힘들다. Advanced클래스처럼 중첩하여 if문을 작성하면 명시적으로 보기에도 낫다.
		if (a >= 95 && a <= 100) {
			System.out.println(a + ": 4.5");
		} else if (a >= 90 && a < 95) {
			System.out.println(a + ": 4.0");
		} else if (a >= 85 && a < 90) {
			System.out.println(a + ": 3.5");
		} else if (a >= 80 && a < 85) {
			System.out.println(a + ": 3.0");
		} else if (a >= 75 && a < 80) {
			System.out.println(a + ": 2.5");
		} else if (a >= 70 && a < 75) {
			System.out.println(a + ": 2.0");
		} else if (a >= 65 && a < 70) {
			System.out.println(a + ": 1.5");
		} else if (a >= 60 && a < 65) {
			System.out.println(a + ": 1.0");
		} else if (a < 60 && a >= 0) {
			System.out.println(a + ": 0.0");
		} else {
			System.out.println("입력 오류");
		}

		sc.close();
	}
}
