package d200205;

public class ForQuizHard5 {
	public static void main(String[] args) {
		int cnt = 0;
		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j <= i; j++) {
				// j�� i�� �Ҽ����� �Ǻ��ϱ� ���� 2���� �ڱ��ڽű��� �����ϸ� ���������� ������ ���� ����.
				if (i % j == 0 && i != j) {// i�� j�� ������ ��������, �ڱ� �ڽ��� �ƴϸ�?
					// ������ �����ϸ� ������ �Ҽ��� �ƴϹǷ� ������ �ߴ��Ѵ�
					break;
				} else if (i == j) {
					// �ڱ� �ڽű��� ������Ҵٸ�?
					cnt++;// �Ҽ��� �и���
					System.out.printf("%d\t", i);
					if (cnt % 10 == 0) {
						System.out.println();
					}
				}
			}
		}
	}
}
