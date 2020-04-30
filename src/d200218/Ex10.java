package d200218;

import java.util.Arrays;

public class Ex10 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int[] b = { 1, 2, 3 };
		int[] c = { 1, 2, 3, 4, 5, 6 };

		// 주소 비교
		System.out.println(a == b);// ★false
		System.out.println(a == c);// false
		System.out.println(a.equals(b));// false

		System.out.println();

		// 값 비교
		System.out.println(Arrays.equals(a, b));// true
		System.out.println(Arrays.equals(a, c));// false

		System.out.println();

		int[][] aa = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] bb = { { 1, 2, 3 }, { 4, 5, 6 } };
		// 2차원 배열에서는 1차원이 가진 주소를 비교하므로 false가 나온다.
		// 얕은 비교를 수행한다.
		System.out.println(Arrays.equals(aa, bb));// false
		// 깊은 비교를 수행하면 1차원이 가진 주소가 가진 값까지 비교한다.
		System.out.println(Arrays.deepEquals(aa, bb));// true

	}
}
