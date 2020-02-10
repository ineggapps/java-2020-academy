package d200210;

import java.util.Arrays;

public class ArrayCopyEx3 {
	public static void main(String[] args) {
		int[][] a = { { 10, 20, 30 }, { 40, 50, 60 } };
		int[][] b = new int[2][3];

		System.arraycopy(a, 0, b, 0, b.length);
		System.out.println(a[1][1] + " vs " + b[1][1]);

		/*
		 * 2���� �迭������ ���� ������ �ÿ� ���� �ƴ� �ּڰ��� �����ǹǷ� �����Ѵ�.
		 * 2���� �迭�� ��� 3��(��)�� 2��(��) �����۾��� ������ ��������� �Ѵ�.
		 */
		b[1][1] = 500;
		System.out.println(a[1][1] + " vs " + b[1][1]);

	}
}
