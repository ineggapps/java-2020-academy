package d200204;

import java.util.Scanner;

public class WhileQuizHard9 {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("정수 ? ");
		num=sc.nextInt();
		for(int i=2;i<=num;i++) {
			if(num%i==0 && i!=num) {
				System.out.println(num+": 소수가 아님");
				break;
			}else if(i==num) {
				System.out.println(num+": 소수");
			}
		}
		sc.close();
	}
}
