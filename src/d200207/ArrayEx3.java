package d200207;

public class ArrayEx3 {
	public static void main(String[] args) {
		int[] a = new int[3];// ���̰� 3�� ���� �迭
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		System.out.println("==�迭 ����==");
		for (int n : a) {
			System.out.println(n + " ");// 10 20 30
		}
		/*
		 * �迭�� ����
			�迭�� ũ�⸦ �����ϸ� ���� �迭�� ��ġ�� ������ �� ���� ������
			Garbage Collector�� ����� �Ǹ�,
			���ο� �迭�� ����.
		 * */
		a = new int[5];
		a[3]=40;a[4]=50;
		System.out.println("==�迭�� ũ�� ���� ��==");
		for (int n : a) {
			System.out.println(n + " ");//0 0 0 40 50
		}
		System.out.println();
	}
}
