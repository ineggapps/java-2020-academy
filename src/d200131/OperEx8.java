package d200131;

import java.util.Scanner;

public class OperEx8 {
	/*
	 * 연도를 입력받아 윤년인지 평년인지를 판별하기 ex: 2020? 윤년
	 * 
	 * 2월 29일(366일)이면 윤년이고 그렇지 않으면 평균(365일) 
	 * 연도가 4의 배수이고 100의 배수가 아니거나 400의 배수이면 윤년이고
	 * 그렇지 않으면 평년이다.
	 * 
	 * cf) 서기 1년 1월 1일은 월요일이다.
	 * 음력은 규칙이 없고 한국과 중국이 다르다
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		String result;
		System.out.print("연도 입력: ");
		year = sc.nextInt();
		
		//연도가 4의 배수이고 100의 배수가 아니거나 400의 배수이면 윤년
		result = year%4==0 && year%100!=0 || year % 400==0 ? "윤년":"평년";
		System.out.printf("%d년은 %s입니다.",year,result);
		
		sc.close();
	}
}
