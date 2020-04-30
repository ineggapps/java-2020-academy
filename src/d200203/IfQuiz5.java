package d200203;

import java.util.Scanner;

public class IfQuiz5 {
	//입력받은 근무시간에 따른 급여를 계산하는 프로그램
	//단, 일하는 시간이 8시간을 초과하면 8시간은 원래 급여를 지급하고 초과 시간은 1.5배의 급여를 지급한다.
	//ex: 9시간 일하면 8*10000 + 1*(10000*1.5) = 95,000원이다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour,pay;
		int per=10000;
		
		System.out.print("근무 시간 입력: ");
		hour = sc.nextInt();
		
		if(hour>8) {
			pay = (int)((hour-8)*(per*1.5f))+(8*per);
		}else {
			pay = hour*per;
		}
		
		System.out.format("급여: %,d원\n",pay);
	
		sc.close();
	}
}
