package d200210;

public class ArrayEx7 {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d\t", a[i][j]);
			}
			System.out.println();
		}
		System.out.println("==============");
		//향상된 for문을 사용한 방식, 하지만 잘 쓰이지는 않는다.
		for (int[] rows : a) {
			for (int n : rows) {
				System.out.printf("%3d\t", n);
			}
			System.out.println();
		}
	}
}
