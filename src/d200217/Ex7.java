package d200217;

import java.util.Calendar;
import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int y, m, w, ends;
		
		do {
			System.out.print("���� ? ");
			y=sc.nextInt();
		}while(y<1900);

		do {
			System.out.print("�� ? ");
			m=sc.nextInt();
		}while(m<1||m>12);
				
		Calendar cal = Calendar.getInstance();
		cal.set(y,m-1,1);
		w=cal.get(Calendar.DAY_OF_WEEK);//1�� �Ͽ��� 7�� �����
		
		ends= cal.getActualMaximum(Calendar.DATE);
		System.out.printf("\t%d�� %d��%n", y,m);
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
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
