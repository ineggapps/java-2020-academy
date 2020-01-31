package d200131;

import java.util.Scanner;

public class OperEx5 {
	public static void main(String[] args) {
//		int a = 10, b = 5;
//		int c;
//		c = a > b ? a : b;
//		System.out.println("큰 값: " + c);
		
		//정수를 입력 받아 절댓값 구하기
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		System.out.print("정수? ");
		a=sc.nextInt();
		
		//절댓값 구하기
		b=a>0?a:-a;
		System.out.println(a+"의 절댓값은 " +b);
		
		sc.close();
	}
}
