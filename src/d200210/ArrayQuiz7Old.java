package d200210;

public class ArrayQuiz7Old {
	public static void main(String[] args) {
		// 1~25������ �� ������ó�� ������ ������� ä�� �ֱ�
		int[][] a = new int[5][5];
		int n = 1;
		int size = a.length; // �� ����(����, ����)�� �� ���� ���ڸ� ä���ִ���

		int start= 0;
		int increment = 1;
		int rowCount = 0;
		// ����
		for (int i = 0; i < a.length * 2 - 1; i++) {
			for (int j = 0; j < size; j += increment) {
				System.out.println();
				System.out.printf("i=%d, j=%d, size=%d, start=%d�� �� ���� ����\n", i, j,size,start);
				if(rowCount%4<2) {
					System.out.printf("a[%d][%d]=%d%n",start,j,n);
					a[start][j] = n++;
				}else {
					System.out.printf("a[%d][%d]=%d%n",j,start,n);
					a[j][start] = n++;
				}
				if (j == size - 1) {
					start = j;
				}
			}
			rowCount++;
			System.out.printf("���� ��ġ�� rowCount=%d��%n",rowCount);
			if (i > 0 && rowCount % 2 == 1) {
				System.out.printf("size ���� %d=>%d\n", size, size - 1);
				size--;
			}
			if (i > 0 && rowCount % 2 == 0) {
				System.out.printf("offset ���� %d=>%d\n", increment, -increment);
				increment = -increment;// *-1
			}

			// �߰� ���
			System.out.println();
			for (int ii = 0; ii < a.length; ii++) {
				for (int jj = 0; jj < a[0].length; jj++) {
					System.out.printf("%3d\t", a[ii][jj]);
				}
				System.out.println();
			}
		}
		System.out.println();
		// ���
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.printf("%3d\t", a[i][j]);
			}
			System.out.println();
		}
	}
}
