import java.util.Scanner;

public class Quiz103_LastDay {
	public static void main(String[] args) {
/*
		입력한 년, 월에 대한 마지막 날짜를 구하는 프로그램
*/
		Scanner sc = new Scanner(System.in);

		int y, m, d;
		System.out.print("년도 ? ");
		y=sc.nextInt();
		System.out.print("월 ? ");
		m=sc.nextInt();
		
		switch (m) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12: d=31; break;
		case 4:case 6:case 9:case 11: d=30; break;
		case 2:
			if(y%4==0&&y%100!=0||y%400==0)
				d=29;
			else
				d=28;
			break;
		default:d=0; break;
		}
		
		if(d!=0) {
			System.out.println(y+"년 "+m+"월은 " + d+"일까지 있습니다.");
		} else {
			System.out.println("입력 오류...");
		}
		
		sc.close();
	}
}
