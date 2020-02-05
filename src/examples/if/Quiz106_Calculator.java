import java.util.Scanner;

public class Quiz106_Calculator {
	public static void main(String[] args) {
/*
		두수 및 연산자를 입력 받아 사칙 연산을 하는 프로그램
*/
		Scanner sc = new Scanner(System.in);

		int a, b;
		char c;
		
		System.out.print("두수 ? ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.print("연산자[+, -, *, /] ? ");
		c=sc.next().charAt(0);

		if(c=='+') {
			System.out.printf("%d + %d = %d\n", a, b, a+b);
		}else if(c=='-') {
			System.out.printf("%d - %d = %d\n", a, b, a-b);
		}else if(c=='*') {
			System.out.printf("%d * %d = %d\n", a, b, a*b);
		}else if(c=='/') {
			System.out.printf("%d / %d = %d\n", a, b, a/b);
		}else {
			System.out.println("연산자 입력 오류 입니다.");
		}
		
		sc.close();
	}
}
