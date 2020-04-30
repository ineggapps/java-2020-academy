import java.util.Scanner;

public class Quiz104_Grade {
	public static void main(String[] args) {
/*
		점수를 입력 받아 평점을 구하는 프로그램
*/
		Scanner sc=new Scanner(System.in);

		int input;
		System.out.print("점수 ? ");
		input=sc.nextInt();
		if(input>=95 && input<=100)
			System.out.println("점수 : " + input + ", 평점 : 4.5");
		else if(input>=90)
			System.out.println("점수 : " + input + ", 평점 : 4.0");
		else if(input>=85)
			System.out.println("점수 : " + input + ", 평점 : 3.5");
		else if(input>=80)
			System.out.println("점수 : " + input + ", 평점 : 3.0");
		else if(input>=75)
			System.out.println("점수 : " + input + ", 평점 : 2.5");
		else if(input>=70)
			System.out.println("점수 : " + input + ", 평점 : 2.0");
		else if(input>=65)
			System.out.println("점수 : " + input + ", 평점 : 1.5");
		else if(input>=60)
			System.out.println("점수 : " + input + ", 평점 : 1.0");
		else if(input>=0)
			System.out.println("점수 : " + input + ", 평점 : 0.0");
		else
			System.out.println("점수 입력 오류 입니다.");
		
/*		
		int input;
		double result;
		
		System.out.print("점수 ? ");
		input=sc.nextInt();
		if(input>=0 && input<=100) {
			if(input>=95)
				result = 4.5;
			else if(input>=90)
				result = 4.0;
			else if(input>=85)
				result = 3.5;
			else if(input>=80)
				result = 3.0;
			else if(input>=75)
				result = 2.5;
			else if(input>=70)
				result = 2.0;
			else if(input>=65)
				result = 1.5;
			else if(input>=60)
				result = 1.0;
			else
				result = 0;
				
			System.out.println("점수 : " + input + ", 평점 : " + result);
		} else {
			System.out.println("점수 입력 오류 입니다.");
		}
*/

		sc.close();
	}
}
