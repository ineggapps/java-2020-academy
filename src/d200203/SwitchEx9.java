package d200203;

import java.util.Scanner;

public class SwitchEx9 {
	/*
	 * 두 연산자를 입력 받아 사칙연산
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		String oper;

		System.out.print("두 수 입력: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();

		System.out.print("연산자 입력[+-*/]: ");
		oper = sc.next();

		switch (oper) {
		case "+":
			System.out.printf("%d %s %d = %d\n", n1, oper, n2, n1 + n2);
			break;
		case "-":
			System.out.printf("%d %s %d = %d\n", n1, oper, n2, n1 - n2);
			break;
		case "*":
			System.out.printf("%d %s %d = %d\n", n1, oper, n2, n1 * n2);
			break;
		case "/":
			System.out.printf("%d %s %d = %.2f\n", n1, oper, n2, (double)n1 / n2);
			break;
		default:
			System.out.println("계산 실패: 올바르지 않은 연산자");
			break;
		}

		sc.close();
	}
}
