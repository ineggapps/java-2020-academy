package d200206;

import java.util.Scanner;

public class ForQuizHard1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int com, user;

		while (true) {
			do {
				System.out.print("1.가위 2.바위 3.보 4.게임 종료 > ");
				user = sc.nextInt();
			} while (user < 1 || user > 4);
			if (user == 4) {
				break;
			}
			com = (int) (Math.random() * 3) + 1;
			//user와 com의 답안 작성하기
			System.out.print("당신: " );
			if(user==1) {
				System.out.println("가위");
			} else if(user==2) {
				System.out.println("바위");
			}else {
				System.out.println("보");
			}
			System.out.print("컴퓨터: " );
			if(com==1) {
				System.out.println("가위");
			} else if(com==2) {
				System.out.println("바위");
			}else {
				System.out.println("보");
			}
			
			
			
			// user와 com이랑 비교하여 누가 이겼는지 출력하기
			if(user==com) {
				System.out.println("비겼습니다.");
			}else if(user-com==1 || user-com==-2) {
				System.out.println("당신이 이겼습니다.");
			}else {//user-com==2 혹은 -1
				System.out.println("당신이 졌습니다.");
			}
		}

		sc.close();
	}
}
