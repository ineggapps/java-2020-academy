package d200130;

import java.util.Scanner;

public class OperQuiz2 {
	public static void main(String[] args) {
		//반지름을 입력 받아 원 넓이와 둘레를 계산하시오.
		Scanner sc = new Scanner(System.in);
		int r;
		System.out.print("원의 반지름은 ? ");
		r = sc.nextInt();
		System.out.printf("원의 넓이는 %.2f이고 둘레는 %.2f입니다.", r*r*3.14, r*2*3.14);
	}
}
