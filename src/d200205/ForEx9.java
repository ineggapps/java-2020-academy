package d200205;

public class ForEx9 {
	public static void main(String[] args) {
		// ���̾Ƹ�� �����
		// (for�� 6��)
		/*
		 * aaaa* aaa*** aa***** a*******
		 *********
		 * a******* aa***** aaa*** aaaa*
		 */

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print("a");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// * ���� ����
		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print("a");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("================");
		// for�� 2���� �̿��Ͽ� ���� ��� �����
		int s = 5;
		int n = s / 2;// n������ �̿��Ͽ� ����ϴ� ������ ������ �����Ѵ�.
		for (int i = 0; i < s; i++) {
			for (int j = 0; j < s - n; j++) {
				System.out.print(j >= n ? "*" : "a");// j>=n�� ���������� *�� �׸��� �׷��� ������ ����
			}
			n = i < (s / 2) ? n - 1 : n + 1;// ���� ��� �� ���� ������ ��ġ�� ���ϸ� n-1�� �ϰ�, �������ʹ� n+1�� �ǽ��Ѵ�
			//j<s-n <<< ���� --n�� +n�� �Ǵ� ������ �����ϸ� �ȴ�.
			System.out.println();
		}

	}
}
