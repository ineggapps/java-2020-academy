package d200210;

public class ArrayEx2 {
	public static void main(String[] args) {
		/*
		 �ະ�� ���� ũ�⸦ �ٸ��� �Ҵ��� �� �ִ�. => �迭�� �迭�̶�� ��
		 */
		int[][] a = new int[3][];//���� ũ�⸦ �������� �ʰ� ���Ŀ� ������ ũ�⺰�� ������ �����ϴ�.
		a[0] = new int[4];
		a[1] = new int[3];
		a[2] = new int[5];
		System.out.println("�迭 �� ��: "+a.length);
		System.out.println("0�� �� ��: " + a[0].length);
		System.out.println("1�� �� ��: " + a[1].length);
		System.out.println("2�� �� ��: " + a[2].length);
	}
}
