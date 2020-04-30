package d200204;

import java.util.Scanner;

public class WhileQuizHard3A {
	// 두 정수를 입력 받아 입력 받은 정수의 최대공약수 및 최소공배수를 구하는 프로그램
	// while문을 이용하여 작성
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2,tmp;
		int r1, r2=1; //나머지 검사
 		int gcd=0,lcm=0;

		// 입력
		System.out.print("두 수 ? ");
		num1 = sc.nextInt();//32
		num2 = sc.nextInt();//72
		
		//대소 판별 (num1<num2)로 정렬
		if(num1>num2) {
			tmp = num1;
			num1=num2;
			num2=tmp;
		}
		
		//최대공약수 연산
//		r1=num1%num2;
//		r2=num2%r1;
//		while(r2!=0) {
//			tmp=r1;
//			r1=r2;
//			r2=tmp%r1;
//		}
//		gcd=r1;
//		lcm=num1*num2/gcd;
		
		//출력
		System.out.printf("GCD(최대공약수): %d%n", gcd);
		System.out.printf("LCM(최소공배수): %d%n", lcm);

		sc.close();

	}
}
