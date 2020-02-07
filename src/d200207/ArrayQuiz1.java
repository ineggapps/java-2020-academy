package d200207;

import java.util.Scanner;

public class ArrayQuiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y;
		String band[] = { "원숭이", "닭", "개", "돼지", "쥐", "소", "범", "토끼", "용", "뱀", "말", "양" };

		/*
		 * 연도를 입력받아 입력 받은 연도의 띠를 구하는 프로그램을 작성한다.
		 * 띠는 쥐, 소, 범, 토끼, 용, 뱀, 말, 양, 원숭이, 닭, 개, 돼지 순으로 진행된다. 
		 * 2016년은 원숭이띠이다. (2016%12==0)
		 * 시작하는 띠의 순서와는 조금 다르게
		 * 나누어 떨어지는 것이 0일 때의 띠부터 시작하면 된다.
		 * 따라서 배열의 초깃값은 "원숭이"부터 시작하면 된다.
		 */

		// 입력
		do {
			System.out.print("연도 ? ");
			y = sc.nextInt();
		} while (y < 1900);

		System.out.printf("%d년도는 %s띠의 해입니다.", y, band[y % band.length]);

		sc.close();
	}
}
