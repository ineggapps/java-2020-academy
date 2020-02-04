package d200204;

import java.util.Scanner;

public class WhileQuizHard2 {
	//정수를 입력 받아 입력 받은 정수가 몇 자리 정수인지를 출력하는 프로그램
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,r, cnt=1;
		//n: 입력 받을 정수
		//r: n을 연산한 중간 저장값
		//cnt: 정수의 자릿수를 세어 저장
		System.out.print("정수 입력? ");
		n = sc.nextInt();
		
		r = n;//100 입력
		while(r!=0) {
			r /= 10;
			if(r!=0) {				
				cnt++;
			}
		}
		System.out.printf("%d은 %d자리 정수",n,cnt);
		sc.close();
	}
}
