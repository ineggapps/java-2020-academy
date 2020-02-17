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
		cal.set(y,m-1,1);
		w=cal.get(Calendar.DAY_OF_WEEK);//1은 일요일 7은 토요일
		
		ends= cal.getActualMaximum(Calendar.DATE);
		System.out.printf("\t%d년 %d월%n", y,m);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("=====================");
		for(int i=1;i<w;i++) {
			System.out.print(" *\t");
		}
		
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
