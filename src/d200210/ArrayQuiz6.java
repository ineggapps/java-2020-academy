package d200210;

public class ArrayQuiz6 {
	public static void main(String[] args) {
		char[][] a = new char[4][4];
		char c[] = new char[a.length * a[0].length];// 2�����迭�� ���� �����Ѵ�.
		char n;
		/*
		 A~Z���� ���ڸ� ������ �̿��Ͽ� �߻��Ͽ� �߻��� ���ڸ� 4X4�迭�� 0�� 0������ ��켱���� �����Ͽ� ����ϴ� ���α׷�
		 ���� ���#1(����). 1�����迭�� 4X4=16�̶�� ũ���� �迭�� ����� �ߺ� ���� ���ڿ��� �����Ѵ�.
		*/
		// ����
		for (int i = 0; i < c.length; i++) {
//			c[i] = (char)((int)(Math.random()*26)+65);
			c[i] = (char) ((Math.random() * 26) + 'A');
			// �ߺ� �˻�
			for (int j = 0; j < i; j++) {
				if (c[i] == c[j]) {
					i--;
					break;
				}
			}
		}
		// ����
		int idx=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = c[idx++];
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
