package d200210;

public class ArrayQuiz6Advanced {
	public static void main(String[] args) {
		char[][] a = new char[4][4];
		char n;
		/*
		 A~Z���� ���ڸ� ������ �̿��Ͽ� �߻��Ͽ� �߻��� ���ڸ� 4X4�迭�� 0�� 0������ ��켱���� �����Ͽ� ����ϴ� ���α׷�
		 #2[��ȭ]. 1�����迭�� ������� �ʰ� 2�����迭 �ȿ����� �ذ��Ѵ�.
		 => label�� �Բ� �ݺ����� 2���� �Ἥ �����ϴ� �۾��� �ʿ��ϴ�.
		*/
		// ����
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				n = (char) ((Math.random() * 26) + 65);
				a[i][j] = n;
				
				gogo:
				for(int x=0;x<=i;x++) {
					for(int y=0;y<a[x].length;y++) {
						if(x==i && y>=j) break gogo;
						if(a[i][j]==a[x][y]) {
							j--;
							break gogo;
						}
					}
				}
			}
		}
		// ���
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.printf("%4c\t", a[i][j]);
			}
			System.out.println();
		}
	}
}
