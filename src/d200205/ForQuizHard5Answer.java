package d200205;

public class ForQuizHard5Answer {
	public static void main(String[] args) {
		// 1~100������ �� �� �Ҽ��� �� �ٿ� 10��������ϰ� �������� �Ҽ��� ������ ����ϴ� ���α׷�
		int cnt = 0;
		boolean b = true;
		long m = System.currentTimeMillis();
		for (int i = 2; i <= 100000; i++) {
			b = false;
			// ��, ���п��� 1�� �Ҽ��� �ƴϹǷ� 2���� �ݺ��� �����Ѵ�.
			for (int j = 2; j < i; j++) {
				// j�� i�� �Ҽ����� �Ǻ��ϱ� ���� 2���� �ڱ��ڽű��� �����ϸ� ���������� ������ ���� ����.
				if (i % j == 0) {// i�� j�� ������ ��������, �ڱ� �ڽ��� �ƴϸ�?
					// ������ �����ϸ� ������ �Ҽ��� �ƴϹǷ� ������ �ߴ��Ѵ�
					b = true;
					break;//break�� ���� �� ���� ���α׷��� �ӵ� ���̰� ũ��.
					//break���: 1���� 10�������� �Ҽ��� ���� ���� 935ms
					//break �̻��: 1���� 10�������� �Ҽ��� ���� �� 9104ms
				}
			}
			if (!b) {
				System.out.printf("%d\t", i);
				cnt++;
				if (cnt % 10 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println("\n�Ҽ��� ����: " + cnt);
		System.out.println(System.currentTimeMillis()-m);
		/*
		 * ��ȭ: 123�� ����� ���� �� 2~12������ ����Ͽ��� �Ҽ����� ������ �� �ִ�. �� 12^2=144 �̴�.
		 */
	}
}
