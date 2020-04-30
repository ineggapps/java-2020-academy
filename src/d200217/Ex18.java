package d200217;

import java.util.Random;
import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int input;
		int cnt = 0;

		int com = rnd.nextInt(100) + 1;
		do {
			System.out.print("input ? ");
			input = sc.nextInt();

			if (com > input) {
				System.out.println("크다.");
			} else if (com < input) {
				System.out.println("작다.");
			}
			cnt++;
		} while (input != com && cnt < 20);//조건문에 input!=com을 걸었으니...
		if(input==com) {
			System.out.println(cnt+"번 만에 맞혔습니다.");
		}else {
			System.out.println("게임 오버 ~ 답: "+cnt);
		}

		sc.close();
	}
}
