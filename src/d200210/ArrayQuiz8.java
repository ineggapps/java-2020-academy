package d200210;

public class ArrayQuiz8 {
	public static void main(String[] args) {
		// 1~25������ �� ������ �׸���
		int[][] a = new int[5][5];
		int cnt = 1;
		int size = 5; // �� ����(����, ����)�� �� ���� ���ڸ� ä���ִ���

		int row = 0;// ���� ��ǥ
		int col = a.length / 2;// ���� ��ǥ
		// ����
		for (int i = 0; i < a.length * a[0].length; i++) {
			//������ ��ǥ�� ���� �ִ��� �Ǵ��ϱ� (���� ������ ���� �� ĭ ������)
			System.out.printf("cnt=%d, i=%d\n\trow=%d, col=%d\n",cnt, i, row, col);
			System.out.printf("\ti=%d, a[%d][%d]=%d ��ŷ�մϴ�.\n",i,row,col,a[row][col]);
			if(a[row][col]>0) {
				System.out.printf("\ti=%d, a[%d][%d]=%d �� ����!\n",i,row,col,a[row][col]);
				//���� �ִٸ� �����ϱ�
				System.out.printf("\t\trow(row+2), col(col-1)�� ����");
				System.out.printf("\n\t(��) row=%d, col=%d\n", row, col);
				row+=2;
//				col--;
				
				//�Ʒ����� ��ġ������ �� ����� ���� ������
				row++;
//				col--;
				
				if(col-2<0) {
					col=3;
				}else {
					col-=2;
				}
				
				System.out.printf("\t(��) row=%d, col=%d\n", row, col);
			}else {
				//���� ������ �����ϱ�
				a[row][col] = cnt++;				
			}
			System.out.println(col + 1 >= a.length);
			//�� ��ġ�� �����ϱ� (���δ� ��� ����, ���δ� ��� ����������)
			if (row - 1 < 0) {// ���� ����
				row = a.length - 1;
			} else {
				row--;
			}
			
			col=(col+1)%a.length;
			System.out.printf("\t���� Ŀ��: row=%d, col=%d\n", row, col);
//			if (col + 1 >= a.length) {// ���� ����
//				col = 0;
//			} else {
//				col++;
//			}
			
			// ���
			System.out.println();
			for (int ii = 0; ii < a.length; ii++) {
				for (int jj = 0; jj < a[0].length; jj++) {
					System.out.printf("%3d\t", a[ii][jj]);
				}
				System.out.println();
			}
		}

		// ���
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.printf("%3d\t", a[i][j]);
			}
			System.out.println();
		}
	}
}
