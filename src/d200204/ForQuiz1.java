package d200204;

import java.util.Scanner;

public class ForQuiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, n, s = 0;
		do {
			System.out.print("수 ? ");
			num = sc.nextInt();
		} while (num < 1 || num > 1000);
		for (int i = 1; i <= num; i++) {
			s += i;
		}
		System.out.println("1~20까지의 합: " + s);
		sc.close();

	}
}
