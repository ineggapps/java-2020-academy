package d200205;

public class ForQuizHard7 {
	public static void main(String[] args) {
		//�������� �� �ٿ� 4�ܾ� ����ϴ� ���α׷�
		int unit = 4;
		// 2~9�ܱ����� �������� �� �ٿ� 4�ܾ� ����ϴ� ���α׷��� �ۼ��Ѵ�.
		for (int i = 2; i < 10; i += unit) {
			// i�� �������� 2�� �����Ͽ� ��½�Ű�� ���� ����
			for (int n = 1; n <= 9; n++) {// X1~ X9 9�� ����ϱ�
				for (int dan = i; dan < i + 4; dan++) {
					System.out.printf("%d * %d = %3d\t",dan,n, n * dan);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
