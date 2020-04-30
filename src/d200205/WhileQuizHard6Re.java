package d200205;

import java.util.Scanner;

public class WhileQuizHard6Re {
	public static void main(String[] args) {
		// 선생님 답안
		Scanner sc = new Scanner(System.in);
		int com, user, cnt;
		
		//1~100 사이 난수를 발생시키기
		com = (int)(Math.random()*100)+1;

		//카운트 변수 초기화
		cnt=0;
		while(true) {//무한 루프
			System.out.print("수? ");
			user = sc.nextInt();
			cnt++;
			if(com>user) {
				System.out.println("입력한 수보다 더 큽니다.");
			}else if(com<user) {
				System.out.println("입력한 수보다 더 작습니다.");
			}else {
				System.out.printf("%d번 만에 성공하였습니다.\n",cnt);
				break;
			}
		}
		sc.close();
	}
}
