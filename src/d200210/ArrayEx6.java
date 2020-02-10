package d200210;

public class ArrayEx6 {
	public static void main(String[] args) {
		/*
		 * ex3) 5X4 ��Ŀ� 1~100������ ������ �߻��Ͽ� ������ �� ����ϰ�, 5X4 ����� 4X5��ķ� ��ȯ�Ͽ� ����ϴ� ���α׷� �ۼ��ϱ�
		 */
		// ���� ����
		int[][] a = new int[5][4];
		int[][] b = new int[4][5];

		// a���� �ʱ�ȭ
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 100) + 1;
			}
		}

		// a���� ���
		System.out.println("a����: 5X4 ���");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d\t", a[i][j]);
			}
			System.out.println();
		}

		// b������ a������ ����� ��ȯ�Ͽ� ��´�.
		for (int i = 0; i < a[i].length; i++) {//0~3 (4)
			for (int j = 0; j < a.length; j++) {//0~4 (5)
				// b�� 4X5��� 4�� 5��, a�� 5X4 5��4�� ����̴ϱ�
				b[i][j] = a[j][i];
			}
		}

		// b���� ���
		System.out.println("b����: 4X5 ���");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.printf("%3d\t", b[i][j]);
			}
			System.out.println();
		}
	}
}
