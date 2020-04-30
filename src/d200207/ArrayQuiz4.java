package d200207;

import java.util.Scanner;

public class ArrayQuiz4 {
	public static void main(String[] args) {
		// 달력 만들기
		Scanner sc = new Scanner(System.in);
		int y, m, d;
		int month[] = new int[] { 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String week[] = new String[] { "일", "월", "화", "수", "목", "금", "토" };
		int tot;//구하고자 하는 월의 전월까지의 경과일을 구하기
		int startDay;
		
		do {
			System.out.print("연도 > ");
			y = sc.nextInt();
		} while (y < 1);

		do {
			System.out.print("월 > ");
			m = sc.nextInt();
		} while (m < 1 || m > 12);

		// 보고자 하는 연도가 윤년인지 구하기 (2월)
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
			month[1]=29;//윤년이면 2월에 1일을 더 추가한다.
		}else {
			month[1]=28;
		}
		
//		달력은 월까지만 구하면 된다.
//		do {
//			System.out.print("일 > ");
//			d = sc.nextInt();
//		} while (d < 1 || d > month[d - 1]);

		//달력 그리기
		//달력을 그리기 위해서는 월 시작일의 요일을 계산해야 한다.
		//구하고자 하는 전년도의 말월 말일까지의 날짜 수 카운트
		//전년도*365일 + (1*전년도까지 윤년이었던 연도의 개수)
		tot = (y-1)*365 + ((y-1)/4 - (y-1)/100 + (y-1)/400);
		//구하고자 하는 연도의 월의 전월까지의 날짜 수 카운트하기
		for(int i=0;i<m-1;i++) {
			tot+=month[i];
		}
		tot++; //현재 월의 1일을 카운트
		startDay = tot%7;//시작하는 날의 값
		System.out.println(month[m-1]+"(말일)까지 있음");
		System.out.println(tot+"시작일은 " + tot%7 +" " + week[tot%7]);
		System.out.printf("%d년 %d월\n",y,m);
		for(String i: week) {
			System.out.printf("%s\t\t",i);
		}
		System.out.println("\n==========================================");
		//달력은 7일 단위로 줄바꿈을 하니까 7은 literal값으로 사용할게!
		int day=1;
		/*
		#1. 제1안  
		int cursor=0;
		while(day<=month[m-1]) {
			cursor++;
			if(cursor<7 && cursor%7<=startDay) {
				System.out.print("*\t\t");
			}else {
				System.out.printf("%d\t\t",day);
				day++;
			}
			if(cursor%7==0) {
				System.out.println();
			}
		}*/
		
		//제일 첫 줄은 공백이 필요하므로 다음과 같이 출력한다
//		System.out.println("시작일:"+startDay);
		//#2. 제2안
		//2020년 2월을 예로 들면 2월 1일은 토요일이다.
		//일월화수목금요일에는 공백을 찍어야 한다.
		for(int i=0;i<startDay;i++) {
			System.out.print("*\t\t");
		}
		//2020년 2월을 예로 들면 2월은 29일까지 있다.
		//공백을 띄운 곳에서부터 말일을 순차적으로 찍으면 된다.
		//단, 말일이 토요일인 경우에는 줄바꿈을 하지 않도록 처리한다.
		for (int i=1;i<=month[m-1];i++) {
			System.out.printf("%d\t\t",day++);
			if((startDay+i)%7==0 && i<month[m-1]) {
				//7개 찍을 때마다 다음줄로, 마지막에는 찍지 않음.
				System.out.println();
			}
		}
		
		System.out.println("\n==========================================");
		sc.close();
	}
}
