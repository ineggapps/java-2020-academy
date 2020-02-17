package d200217;

import java.util.Calendar;
import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int y, m, w, ends;
		
		do {
			System.out.print("연도 ? ");
			y=sc.nextInt();
		}while(y<1900);

		do {
			System.out.print("월 ? ");
			m=sc.nextInt();
		}while(m<1||m>12);
				
		Calendar cal = Calendar.getInstance();
		cal.set(y,m-1,1);//날짜는 1일이 무슨요일인지를 구해야 하니까 월-1, 1일로 설정하였다.
		w=cal.get(Calendar.DAY_OF_WEEK);//1은 일요일 7은 토요일
		
		ends= cal.getActualMaximum(Calendar.DATE);
		System.out.printf("\t%d년 %d월%n", y,m);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("=====================");
		
		//달력을 그리기 위해서는
		//1) 1일이 무슨요일인지?
		//2) 말일이 며칠인지?
		//위의 두 가지만 필요하다.
		
		//1일이 일요일부터 시작하라는 법은 없다. 그러므로 시작하는 요일 전까지는 공백으로 띄워줘야 한다.
		for(int i=1;i<w;i++) {
			System.out.print(" *\t");
		}
		
		//1일에서 말일까지 순차적으로 공백을 띄워주기.
		//지금이 무슨 요일인지를 카운트하기 위해서는 w변수(요일)를 이용한다.
		//2020년 2월은 토요일이므로 w변수는 7이 될 것이다.
		//순차적으로 말일까지 카운트하면서 7을 나눈 나머지가 1이 될 때마다 줄바꿈을 한다.
		//단 여기서는 w++를 먼저 수행하였으므로 나머지가 0이 아닌 1이 될 때가 토요일을 의미한다.
		for(int i=1;i<=ends;i++) {
			System.out.printf("%2d\t",i);
			w++;
			if(w%7==1) {
				System.out.println();
			}
		}
		System.out.println("=====================");
		sc.close();
	}
}
