package d200210;

import java.util.Scanner;

public class ArrayQuiz8WithComment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;// �� ����(����, ����)�� �� ���� ���ڸ� ä���ִ���
		do {
			System.out.print("Ȧ�� ? ");
			size = sc.nextInt();
		} while ((size & 1) == 0);
		// 1~25������ �� ������ �׸���
		int[][] a = new int[size][size];
		int cnt = 1;

		int row = 0;// ���� ��ǥ
		int col = a.length / 2;// ���� ��ǥ
		// ����
		for (int i = 0; i < size * size; i++) {
			System.out.printf("���� cnt=%d, i=%d %nrow=%d, col=%d�׸���!%n", cnt, i, row, col);
			// ���
			a[row][col] = cnt++;

			// ��ǥ �̵�
			if (row - 1 < 0) {
				row = a.length - 1;
			} else {
				row--;
			}
			if (col + 1 >= a.length) {
				col = 0;
			} else {
				col++;
			}

			// ������ ��ǥ�� ���� �ִ��� �Ǵ��ϱ� (���� ������ ���� �� ĭ ������)
			if (a[row][col] > 0) {
//				System.out.printf("���� ���� a[%d][%d]=%d%n",row,col,a[row][col]);
				// �� �����ϱ�
				row += 2;
				col--;
//				System.out.printf("����: row=%d, col=%d%n",row,col);
			}

			// ��ġ�� ��ȿ���� ���� ������ �����̶�� �����ϱ�
			if (row >= a.length) {
				row = row - a.length;
			}
			if (col < 0) {
				col = size + col;
			}

			//�߰� ���
//			System.out.println();
//			for (int ii = 0; ii < a.length; ii++) {
//				for (int jj = 0; jj < a[0].length; jj++) {
//					System.out.printf("%3d\t", a[ii][jj]);
//				}
//				System.out.println();
//			}
		}

		System.out.println();
		// ���
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.printf("%3d\t", a[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}
}
