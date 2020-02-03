package r200203;

import java.util.Scanner;

public class FlowEx25 {
	public static void main(String[] args) {
		int num=0,sum=0;
		System.out.print("숫자를 입력하세요. (예:12345)> ");
		
		Scanner sc = new Scanner(System.in);
		num= sc.nextInt();
		
		while(num!=0) {
			//num을 10으로 나눈 나머지를 sum에 더한다
			sum+=num%10;
			System.out.printf("sum=%3d num=%d%n",sum,num);
			num/=10;
		}
		System.out.println("각 자릿수의 합: "+sum);
		sc.close();
	}
}
