package d200210;

public class ArrayQuiz7 {
	public static void main(String[] args) {
		// 1~25������ �� ������ó�� ������ ������� ä�� �ֱ�
		int size = 5; // �� ����(����, ����)�� �� ���� ���ڸ� ä���ִ���
		int[][] a = new int[size][size];
		int n=0, r=0, c=-1;
		// ����
		for (int i = 0; i < size* 2 - 1; i++) {
			for(int j=0;j< size-(i/2);j++) {//��
				n++;
				if(i%4==1) // ��->��
					a[r][++c]=n;
				else if(i%4==2) // ��->�Ʒ�
					a[++r][c]=n;
				else if(i%4==3) // ��->��
					a[r][--c]=n;
				else // �Ʒ�->��
					a[--r][c]=n;
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
