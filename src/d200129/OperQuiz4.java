package d200129;

import java.util.Scanner;
/*
 * 섭씨온도를 입력 받아 화씨 온도로 변환하는 프로그램을 작성하시오
 * [처리조건]
 * - 섭씨 온도의 입력은 Scanner 클래스의 nextInt() 메서드를 이용한다
 * - 화씨 온도는 double 형으로 처리한다.
 * - 화씨 온도는 소수점 둘 째 자리에서 반올림하여 첫 째 자리까지 출력한다.
 * [문제설명]
 * - 섭씨 온도 및 화씨 온도로 변환
 * - 화씨 온도 = 섭씨 온도 * 1.8 + 32
 * - 섭씨 온도 = (화씨 온도 - 32) / 1.8
 * */
public class OperQuiz4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double celsius, fahrenheit;
		System.out.printf("섭씨 온도 ? ");
		celsius = sc.nextInt();
		
		fahrenheit = celsius * 1.8 + 32;
		System.out.printf("화씨 온도 %.1f",fahrenheit);
		sc.close();
	}
}
