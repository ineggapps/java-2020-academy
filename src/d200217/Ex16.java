package d200217;

import java.util.Random;

public class Ex16 {
	public static void main(String[] args) {
		String s;
		s = "!@#$%^&*ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890-+abcdefghijklmnopqrstuvwxyz";
		int n;
		StringBuilder b = new StringBuilder();
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			n = r.nextInt(s.length());
			b.append(s.substring(n, n + 1));
		}
		System.out.printf("길이: %d\n", b.toString().length());
		System.out.printf("암호: %s\n", b.toString());
	}
}
