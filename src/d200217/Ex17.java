package d200217;

import java.util.Random;

public class Ex17 {
	public static void main(String[] args) {
		System.out.printf("%d\n", toComputer());
	}

	public static int toComputer() {
		// 1~9 �� �߿��� ���� �ٸ� �� �ڸ� ���� ���ϰ��� �Ѵٸ�?
		// 123~987
		// ��Ʈ1: 1~9���� ���� �ϳ��� �߻���Ű��
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
