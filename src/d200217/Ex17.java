package d200217;

import java.util.Random;

public class Ex17 {
	public static void main(String[] args) {
		System.out.printf("%d\n", toComputer());
	}

	public static int toComputer() {
		// 1~9 수 중에서 서로 다른 세 자리 수를 구하고자 한다면?
		// 123~987
		// 힌트1: 1~9까지 정수 하나를 발생시키기
		Random r = new Random();
		int n1, n2, n3;

		n1 = random(r);

		do {
			n2 = random(r);
		} while (n2 == n1);

		do {
			n3 = random(r);
		} while (n3 == n1 || n3 == n2);
		return n1 * 100 + n2 * 10 + n3;
	}

	public static int random(Random r) {
		return r.nextInt(9) + 1;
	}
}
