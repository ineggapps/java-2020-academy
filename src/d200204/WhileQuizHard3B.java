package d200204;

import java.util.Scanner;

public class WhileQuizHard3B {
	// 두 정수를 입력 받아 입력 받은 정수의 최대공약수 및 최소공배수를 구하는 프로그램
	// while문을 이용하여 작성
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2,tmp;
		int a,b; //연산에 필요한 임시변수
 		int gcd=0,lcm=0;

		// 입력
		System.out.print("두 수 ? ");
		num1 = sc.nextInt();//32
		num2 = sc.nextInt();//72
//		num1=1071;
//		num2=1029;
		
		//연산 편의를 위해 오름차순 정렬
		//대소 판별 (num1<num2)로 정렬
		if(num1>num2) {
			tmp = num1;
			num1=num2;
			num2=tmp;
		}
		
		//최대공약수 연산
		/*
			방법2: 두 정수 a,b에 대해서 a>b일 경우 a=a-b를, a<b의 경우 b=b-a를 a==b가 될 때까지 반복하면 그 수가 최대공약수가 된다.
		*/
		a=num2;//1071
		b=num1;//1029
		while(b!=0) {
			a-=b;
			if(a<0) {
				a+=b;
				tmp=a;
				a=b;
				b=tmp;
			}
		}
		gcd=a;
		lcm=(num1*num2)/gcd;
		//출력
		System.out.printf("GCD(최대공약수): %d%n", gcd);
		System.out.printf("LCM(최소공배수): %d%n", lcm);

		sc.close();

	}
}
