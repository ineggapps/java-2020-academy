package d200204;

public class ForQuiz4 {
	public static void main(String[] args) {
		// ���� for���� �̿��Ͽ� 2�ܿ��� 9�ܱ����� �������� �Ʒ��� ���� ���ó�� ��µǴ� ���α׷� �ۼ��ϱ�
		int dan, n;
		for (n = 1; n <= 9; n++) {
			for (dan = 2; dan <= 9; dan++) {
				System.out.printf("%3d * %3d=%3d\t",dan,n,dan*n);
			}
			System.out.println();
		}
	}
}
