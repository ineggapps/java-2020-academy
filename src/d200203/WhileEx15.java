package d200203;

import java.util.Scanner;

public class WhileEx15 {
	public static void main(String[] args) {
		//정수를 입력 받아 1부터 입력 받은 수까지 합 구하기
		//선언
		Scanner sc = new Scanner(System.in);
		int num;
		int n=0,s=0;
		
		//입력
		System.out.print("정수 입력: ");
		num = sc.nextInt();
		
		//연산
		while(n<num) {
			n++;
			System.out.printf("%d+%d=%d%n",s,n,s+n);
			s+=n;
		}
		
		//결과
		System.out.printf("1에서 %d까지의 합은 %d입니다.",num,s);
		sc.close();
	}
}
