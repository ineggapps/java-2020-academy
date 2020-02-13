package d200213;

public class Ex4 {
	public static void main(String[] args) {
		System.out.println(Test4.pow(2, 10));
		System.out.println(Test4.pow(2, -2));
		System.out.println(Math.pow(2, -3));

		System.out.println(Test4.gcd(120, 68));
		System.out.println(Test4.binary(14));

		for (int i = 0; i < 10; i++) {
			System.out.print(Test4.fibo(i) + "\t");
		}
		System.out.println();
	}
}

class Test4 {
	public static double pow(int x, int y) {
		if (y >= 0) {
			// 0�̻��̸鼭 ����� ���
			return y == 0 ? 1 : x * pow(x, y - 1);
		} else {
			// ������ ���
			// 2^-1= 1/2�� ǥ���� �� �ִ�.
			// but ����ȯ�� �����Ͽ� ���� �ۼ��ϱ�
			return (1.0 / x) * pow(x, y + 1);
		}
	}

	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	// �� ����� �����ϴ�
	// TODO: �յ����
	public static String binary(int n) {
//		return n < 2 ? ""+n : binary(n / 2) + (n % 2);
		return n < 2 ? Integer.toString(n) : binary(n / 2) + (n % 2);
	}

	// �Ǻ���ġ����
	public static int fibo(int n) {
		return n < 2 ? n : fibo(n - 1) + fibo(n - 2);
	}

}