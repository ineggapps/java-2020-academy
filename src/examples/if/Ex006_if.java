import java.util.Scanner;

public class Ex006_if {
	public static void main(String[] args) {
/*
		정수를 입력 받아 2 또는 3의 배수인지 판별하는 프로그램
*/
		Scanner sc=new Scanner(System.in);
		
		int input;
		System.out.print("수 ? ");
		input = sc.nextInt();

		if(input%2==0 && input%3==0) {
			System.out.println(input + " : 2와 3의 배수");
		} else if(input%2==0){
			System.out.println(input + " : 2의 배수");
		} else if(input%3==0){
			System.out.println(input + " : 3의 배수");
		} else {
			System.out.println(input + " : 2 또는 3의 배수가 아니다.");
		}		
		sc.close();
	}
}
