package d200204;

import java.util.Scanner;

public class WhileQuizBasic6 {
	//두 정수를 입력 받아 입력 받은 수 중 작은 수에서 큰 수까지의 합을 구하는 프로그램 작성하기.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,num1,num2,tmp,sum=0;
		
		System.out.print("두 수? ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		//num1과 num2의 대소 판별
		//num1이 num2보다 작은 수가 되도록 정렬
		if(num1>num2) {
			tmp=num1;
			num1=num2;
			num2=tmp;
		}
		
		n=num1;
		while(n<=num2) {//(부등호 조심하기!)
			sum+= n++;
		}
		
		System.out.printf("%d~%d까지의 합 = %d",num1,num2,sum);
		
		sc.close();
	}
}
