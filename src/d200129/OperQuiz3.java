package d200129;

import java.util.Scanner;
/* 금액을 입력 받아, 입력 받은 금액을 50000원 권에서 1원권 까지의 화폐매수로 계산하는 프로그램을 연산자를 이용하여 작성하시오.
 * [처리조건]
 * 금액의 입력은 Scanner 클래스의 nextInt() 메서드를 이용한다.
 * 금액이 70000원인 경우 화폐의 매수는 50000원 권 1매, 10000원 권 2매처럼 큰 단위 금액부터 계산하고 나머지를 다음 단위 화폐에서 계산한다.
 * */
public class OperQuiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money, b50000, b10000, b5000, b1000, b500, b100, b50, b10, b5, b1;
		System.out.print("금액 ? ");
		money = sc.nextInt();

		// 오만원권
		b50000 = money / 50000;
		money = money - (b50000 * 50000);

		// 만원권
		b10000 = money / 10000;
		money = money - (b10000 * 10000);

		// 오천원권
		b5000 = money / 5000;
		money = money - (b5000 * 5000);

		// 천원권
		b1000 = money / 1000;
		money = money - (b1000 * 1000);

		// 오백원권
		b500 = money / 500;
		money = money - (b500 * 500);

		// 백원권
		b100 = money / 100;
		money = money - (b100 * 100);

		// 오십원권
		b50 = money / 50;
		money = money - (b50 * 50);

		// 십원권
		b10 = money / 10;
		money = money - (b10 * 10);

		// 오원권
		b5 = money / 5;
		money = money - (b5 * 5);

		// 일원권
		b1 = money;

		System.out.printf("오만원권: %d\n", b50000);
		System.out.printf("만원권: %d\n", b10000);
		System.out.printf("오천원권: %d\n", b5000);
		System.out.printf("천원권: %d\n", b1000);
		System.out.printf("오백원권: %d\n", b500);
		System.out.printf("백원권: %d\n", b100);
		System.out.printf("오십원권: %d\n", b50);
		System.out.printf("십원권: %d\n", b10);
		System.out.printf("오원권: %d\n", b5);
		System.out.printf("일원권: %d\n", b1);
		
		sc.close();
	}
}
