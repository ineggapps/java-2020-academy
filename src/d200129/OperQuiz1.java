package d200129;

import java.util.Scanner;
/*
 * 두 정수를 입력 받아 사칙 연산을 수행하는 프로그램을 작성하시오
 * [처리 조건]
 * - 정수의 입력은 Scanner 클래스의 nextInt() 메서드를 이용한다.
 * - 나눗셈의 결과는 정수로 처리한다.
 * - 출력은 System.out.printf() 메서드를 이용한다.
 * */
public class OperQuiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		System.out.print("두 정수 ? ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.printf("%d + %d = %d\t",a,b,a+b);
		System.out.printf("%d - %d = %d\n",a,b,a-b);
		System.out.printf("%d * %d = %d\t",a,b,a*b);
		System.out.printf("%d / %d = %d\n",a,b,a/b);
		
		sc.close();
	}
}
