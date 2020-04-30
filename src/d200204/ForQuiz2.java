package d200204;

import java.util.Scanner;

public class ForQuiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan, n;
		for (;;) {
			System.out.print("단 ? ");
			dan = sc.nextInt();
			if(dan>=1 && dan<=9) {
				break;
			}
		}
		for(n=1;n<=9;n++) {
			System.out.format("%d * %d = %d%n", dan,n,dan*n);
		}
		sc.close();
	}
}
