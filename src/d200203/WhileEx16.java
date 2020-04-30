package d200203;

import java.util.Scanner;

public class WhileEx16 {
	public static void main(String[] args) {
		//정수를 입력 받아 1부터 입력 받은 수까지의 홀수의 합 구하기
		//선언
		Scanner sc = new Scanner(System.in);
		int num;
		int n=1,s=0;
		
		//입력
		System.out.print("정수 입력: ");
		num = sc.nextInt();
		
		//연산
		while(n<=num) {//★ 부등호 <= // 입력 받은 값이 홀수이면 홀수까지 더해야 하는데?
			System.out.printf("%d+%d=%d%n",s,n,s+n);
			s+=n;
			n+=2;
		}
		
		//결과
		System.out.print("결과: "+s);
		sc.close();
	}
}
