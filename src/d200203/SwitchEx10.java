package d200203;

import java.util.Scanner;

public class SwitchEx10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y,m,d=0;
		
		System.out.print("연도 입력: ");
		y = sc.nextInt();
		
		System.out.print("월 입력: ");
		m = sc.nextInt();
		
		switch(m) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			d=31;
			break;
		case 4: case 6: case 9: case 11:
			d=30;
			break;
		case 2:
			d=28;
			if(y%4==0 && y%100!=0 || y%400==0) {
				//윤년 계산
				//연도가 4의 배수이고 100의 배수가 아니거나 400의 배수여야 함.
				d++;
			}
			break;
//		default:
//			//변수 선언 시 d를 초기화하지 않은 경우
//			d=0;
//			break;
		}
		if(d!=0) {
			System.out.printf("%d년 %d월은 %d일까지 있습니다.\n",y,m,d);
		}else {			
			System.out.println("입력 오류...");
		}
		sc.close();
	}
}
