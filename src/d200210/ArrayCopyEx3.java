package d200210;

import java.util.Arrays;

public class ArrayCopyEx3 {
	public static void main(String[] args) {
		int[][] a = { { 10, 20, 30 }, { 40, 50, 60 } };
		int[][] b = new int[2][3];

		System.arraycopy(a, 0, b, 0, b.length);
		System.out.println(a[1][1] + " vs " + b[1][1]);

		/*
		 * 2차원 배열에서는 행을 복제할 시에 값이 아닌 주솟값이 복제되므로 유의한다.
		 * 2차원 배열의 경우 3번(열)씩 2번(행) 복사작업을 일일이 수행해줘야 한다.
		 */
		b[1][1] = 500;
		System.out.println(a[1][1] + " vs " + b[1][1]);

	}
}
