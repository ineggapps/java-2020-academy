package d200210;

public class ArrayEx3 {
	public static void main(String[] args) {
		// ���� �迭�� �ʱ�ȭ�� ������ ���� ����ϸ� �ȴ�.
		// ���� �ٱ��� {}�� ���̰� ������ {}�� ���� �ǹ��Ѵ�.
//		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };//new int[][]�� �����Ͽ��� �ʱ�ȭ�� �����ϴ�.
//		int[][] a = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7 }, { 8, 9, 10, 11, 12 } };// new int[][]�� �����Ͽ��� �ʱ�ȭ�� �����ϴ�.

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d\t", a[i][j]);
			}
			System.out.println();
		}
	}
}
