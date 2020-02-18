package d200218;

import java.util.Arrays;

public class Ex10 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int[] b = { 1, 2, 3 };
		int[] c = { 1, 2, 3, 4, 5, 6 };

		// �ּ� ��
		System.out.println(a == b);// ��false
		System.out.println(a == c);// false
		System.out.println(a.equals(b));// false

		System.out.println();

		// �� ��
		System.out.println(Arrays.equals(a, b));// true
		System.out.println(Arrays.equals(a, c));// false

		System.out.println();

		int[][] aa = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] bb = { { 1, 2, 3 }, { 4, 5, 6 } };
		// 2���� �迭������ 1������ ���� �ּҸ� ���ϹǷ� false�� ���´�.
		// ���� �񱳸� �����Ѵ�.
		System.out.println(Arrays.equals(aa, bb));// false
		// ���� �񱳸� �����ϸ� 1������ ���� �ּҰ� ���� ������ ���Ѵ�.
		System.out.println(Arrays.deepEquals(aa, bb));// true

	}
}
