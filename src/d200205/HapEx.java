package d200205;

import java.util.Scanner;

public class HapEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, s;
		int ch;
		int start, offset;
		while (true) {
			do {
				System.out.print("1. 합, 2.홀수의 합, 3.짝수의 합, 4.종료 => ");
				ch = sc.nextInt();
			} while (ch < 1 || ch > 4);
			if (ch == 4)
				break;

			System.out.print("원하는 수: ");
			num = sc.nextInt();

			// 변수 초기화
			switch (ch) {
			case 1:// 자연수의 합
				start = 1;offset = 1;break;
			case 2:// 홀수의 합
				start = 1;offset = 2;break;
			default:// 짝수의 합
				start = 2;offset = 2;break;
			}

			s = 0;
			for (int i = start; i <= num; i += offset) {
				s += i;
			}

			System.out.println("결과: " + s);
		}
		sc.close();
	}
}
