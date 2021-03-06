﻿package d200207;

import java.util.Scanner;

public class CustomQuiz1 {
	public static void main(String[] args) {
		/*
		 참조: https://m.blog.naver.com/guri4you/220897391294
		 # 직접 문제 만들어 보기
		 연도를 입력하면 육십갑자(십간, 십이지)를 계산하여 출력하시오.
		 조건: 연도에 음수가 입력되면 프로그램을 종료합니다.
		 
		ex) 1592: 임진년, 2020: 경자년
		
		원리: "임진"에서 앞자리는 십간을 계산한 결괏값이고 뒷자리는 십이지를 계산한 결괏값이다.
		
		#1. 십간(천지) 계산하기 
		십간은 연도를 10으로 나누었을 때의 나머짓값에 따라 다음의 명칭을 붙인다.
		예) 2020%10=0 ▶ 경 
														▼
		갑		을		병		정		무		기		경		신		임		계
		4		5		6		7		8		9		0		1		2		3
		
		배열의 첨자는 4로 시작하지 않고 0부터 시작하므로 순서를 바꾸면 다음과 같다.
		▼
		경		신		임		계		갑		을		병		정		무		기
		0		1		2		3		4		5		6		7		8		9
		
		#2. 십이지(지지) 계산하기
		십이지는 연도를 12로 나누었을 때의 나머짓값에 따라 다음의 명칭을 붙인다.
		예) 2020%12=4 ▶ 자
																		▼
		자		축		인		묘		진		사		오		미		신		유		술		해
		4		5		6		7		8		9		10		11		0		1		2		3
		
		마찬가지로 배열에 초깃값을 지정할 때 순서를 바꾸면 다음과 같다.
		▼
		신		유		술		해		자		축		인		묘		진		사		오		미
		0		1		2		3		4		5		6		7		8		9		10		11
		 */
		
		Scanner sc = new Scanner(System.in);
		String ten[] = new String[] { "경", "신", "임", "계", "갑", "을", "병", "정", "무", "기" };
		String twelve[] = new String[] { "신", "유", "술", "해", "자", "축", "인", "묘", "진", "사", "오", "미" };

		int y;
		// 음수를 입력받으면 종료한다.
		while (true) {
			System.out.print("연도 입력 > ");
			y = sc.nextInt();
			if (y < 0) {
				break;
			}
			System.out.printf("%d년은 %s%s년입니다.\n", y, ten[y % 10], twelve[y % 12]);
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}
}
