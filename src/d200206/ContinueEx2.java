package d200206;

import java.util.Scanner;

public class ContinueEx2 {
	public static void main(String[] args) {
		// 5개의 홀수를 입력 받아 입력 받은 홀수의 합 구하기.
		// 단, 입력 받은 수가 0보다 작거나 짝수이면 다시 입력 받기
		Scanner sc = new Scanner(System.in);
		int n, s = 0;
		int i=0;
		System.out.print("홀수만 입력: ");
		while(i<5) {
			n=sc.nextInt();
			if(n<0 || n%2==0) {
				continue;
			}
			s+=n;
			i++;
		}
		System.out.println("결과: "+s);
		sc.close();
	}
}
