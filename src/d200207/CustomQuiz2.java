package d200207;

import java.util.Scanner;

public class CustomQuiz2 {
	public static void main(String[] args) {
		//난수를 이용하여 컴퓨터와 디비디비딥 게임을 진행하는 프로그램을 작성하시오.
		/*
		 컴퓨터는 1~5사이 난수
		 1. 위, 2. 아래, 3. 정면 4. 오른쪽 5.왼쪽
		 유저 1~6 사이의 수 입력 
		 1. 위, 2. 아래, 3. 정면 4. 오른쪽 5.왼쪽 6. 종료
		질 때까지 한다.
		(이기는 경우의 수는 고려하지 않음)
		 */
		Scanner sc = new Scanner(System.in);
		int com;
		int user;
		String[] g = new String[] {"위","아래","정면","오른쪽","왼쪽"};
		while(true) {
			com = (int)(Math.random()*5)+1;
			System.out.print("1.위, 2.아래, 3.정면 4.오른쪽 5.왼쪽 6.종료 > ");
			user = sc.nextInt();
			
			//입력 값 검증
			if(user==6) {
				break;
			}else if(user<1 || user>6) {
				continue;
			}
			
			//출력
			System.out.printf("컴퓨터: %s",g[com-1]);
			System.out.println();
			System.out.printf("유저: %s",g[user-1]);	
			System.out.println();
			
			if(com==user) {
				System.out.println("당신이 졌습니다.");
				break;
			}
		}
		sc.close();
	}
	
	
}
