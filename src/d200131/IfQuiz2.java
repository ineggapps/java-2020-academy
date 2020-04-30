package d200131;

import java.util.Scanner;

public class IfQuiz2 {
	//if문을 이용하여 윤년을 구하는 프로그램
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year;
		System.out.print("연도 입력: ");
		year = sc.nextInt();
		
		if(year%4==0 && year%10!=0 || year%400==0) {
			System.out.println(year+"년도는 윤년입니다.");
		}else {
			System.out.println(year+"년도는 평년입니다.");			
		}
		
		sc.close();
	}
}
