package d200210;

public class ArrayEx1 {
	public static void main(String[] args) {
		/*
		 ������ ������ JAVA������ 2�����迭�̶�� ��Ī���ٴ� �迭�� �迭�̶�� ��Ī�� �´�. 
		 */
		int[][] a = new int[3][4];// 3�� 4�� 2���� �迭�� ����
		/*
		 0	0	0	0
		 0	0	0	0
		 0	0	0	0
		 */
		System.out.println("�� ��: " + a.length);
		System.out.println("0���� �� ��: " + a[0].length);

		System.out.println("�迭�� ���� ��ġ: " + a);
		System.out.println("0���� ���� ��ġ: " + a[0]);
		System.out.println("1�� 2���� ��: " + a[1][2]);
	}
}
