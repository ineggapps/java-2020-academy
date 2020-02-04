package d200204;

import java.util.Scanner;

public class WhileQuizHard5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//금액을 입력 받아 입력 받은 금액이 50000원 권에서 1원 권까지 화폐 매수가 몇 매인지를 출력하는 프로그램
		//while을 이용하여 화폐의 매수 계산하기
		//금액이 70,000원인 경우 화폐의 매수는 50,000원 권 1매, 10,000원 권 2매처럼 큰 단위 금액부터 계싼하고 나머지를 다음 단위 화폐에서 계산하기.
		int unit=50000;		
		int cnt=0;
		int share;
		int money;
		
		System.out.print("금액 ? ");
		money = sc.nextInt();
		
		//어차피 중간중간 출력하면 되니까 굳이 화페별로 변수를 저장할 필요는 없다.
		
		//연산
		while(unit!=0) {
			share=money/unit;
			money%=unit;
			System.out.printf("%d원 권 개수: %d장%n",unit,share);
			if(++cnt%2==1) {
				//홀수 번째는 5로 나눈다
				unit/=5;
			}
			else {
				//짝수 번째는 2로 나눈다
				unit/=2;
			}
			
		}
		
		sc.close();
	}
}
