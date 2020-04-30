package d200206;

import java.util.Scanner;

public class BreakEx1 {
	public static void main(String[] args) {
		//정수를 입력 받아 입력 받은 수의 합 구하기
		//단, 입력 받은 수가 0이면 프로그램 종료
		Scanner sc = new Scanner(System.in);
		int n,s=0;
		
		System.out.print("정수 입력[종료: 0] ? ");
		while(true) {
			n = sc.nextInt();
			if(n==0) {
				break;
			}
			s+=n;
		}
		System.out.println("결과: "+ s);
		sc.close();
	}
}
