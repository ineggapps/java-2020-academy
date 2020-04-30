package d200217;

import java.util.Random;

public class Ex15 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int n;
		for (int i = 0; i < 100; i++) {
			n = rnd.nextInt(100) + 1;// 1~100
			System.out.print(n + "\t");
			if(i%10==0) {
				System.out.println();
			}
		}
	}
}
