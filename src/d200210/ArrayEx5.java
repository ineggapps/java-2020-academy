package d200210;

public class ArrayEx5 {
	public static void main(String[] args) {
		/*
		 ex3) 1~20������ ���� �迭(���켱 �迭 ä���)�� ������ó�� ä���� ����ϴ� ���α׷� 
		 1		6		11		16
		 2		7		12		17
		 3		8		13		18
		 4		9		14		19
		 5 		10		15		20
		 */
		int[][] a = new int[5][4];
		int n = 0;
		for (int i = 0; i < a[i].length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[j][i]= ++n;
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d\t", a[i][j]);
			}
			System.out.println();
		}
	}
}
