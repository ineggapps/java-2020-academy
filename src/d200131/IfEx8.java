package d200131;

import java.util.Scanner;

public class IfEx8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("정수 입력: ");
		n = sc.nextInt();
		
		if(n%2==0 && n%3==0) { // ==>  if(n%6==0)과 같은 의미이다.
			System.out.println(n+": 2의 배수와 3의 배수");
		}else if(n%2==0) {
			System.out.println(n+": 2의 배수");
		}else if(n%3==0) {
			System.out.println(n+ ": 3의 배수");			
		}else {
			System.out.println(n+": 2 또는 3의 배수가 아님");
		}
		
		sc.close();
	}
}
