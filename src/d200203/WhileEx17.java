package d200203;

import java.util.Scanner;

public class WhileEx17 {
	public static void main(String[] args) {
		//정수를 입력 받아 1부터 입력 받은 수까지의 홀수를 출력하고 홀수의 합을 구하기
		//단, 한 줄에 홀수를 5개씩 찍는다.
		//선언
		Scanner sc = new Scanner(System.in);
		int num;
		int n=1,s=0,cnt=0;
		
		//입력
		System.out.print("정수 입력: ");
		num = sc.nextInt();
		
		while(n<=num) {
			System.out.printf("%d\t",n);
			//연산
			s+=n;
			n+=2;
			//중간 출력을 위한 줄바꿈
			//한 줄에 5개씩 입력받고 줄바꿈해주는 코드
			cnt++;
			if(cnt%5==0) {
				System.out.println();
			}
//			if(cnt==5) {
//				System.out.println();
//				cnt=0;
//			}
		}
		//결과
		if(cnt%5!=0) {
			System.out.println();
		}
		System.out.print("홀수의 합: "+s);
		sc.close();
	}
}
