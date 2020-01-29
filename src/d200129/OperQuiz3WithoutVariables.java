package d200129;

import java.util.Scanner;
/* 금액을 입력 받아, 입력 받은 금액을 50000원 권에서 1원권 까지의 화폐매수로 계산하는 프로그램을 연산자를 이용하여 작성하시오.
 * [처리조건]
 * 금액의 입력은 Scanner 클래스의 nextInt() 메서드를 이용한다.
 * 금액이 70000원인 경우 화폐의 매수는 50000원 권 1매, 10000원 권 2매처럼 큰 단위 금액부터 계산하고 나머지를 다음 단위 화폐에서 계산한다.
 * */
public class OperQuiz3WithoutVariables {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money;
		System.out.print("금액 ? ");
		money = sc.nextInt();

		System.out.printf("오만원권: %d\n", (money/50000));
		System.out.printf("만원권: %d\n",  (money%50000)/10000);
		System.out.printf("오천원권: %d\n", (money%10000)/5000 );
		System.out.printf("천원권: %d\n", (money%5000)/1000);
		System.out.printf("오백원권: %d\n", (money%1000)/500);
		System.out.printf("백원권: %d\n", (money%500)/100);
		System.out.printf("오십원권: %d\n", (money%100)/50);
		System.out.printf("십원권: %d\n", (money%50)/10);
		System.out.printf("오원권: %d\n", (money%10)/5);
		System.out.printf("일원권: %d\n", money%5);
		
		sc.close();
	}
}
