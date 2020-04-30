package d200210;

public class ArrayEx3 {
	public static void main(String[] args) {
		// 가변 배열의 초기화는 다음과 같이 기술하면 된다.
		// 가장 바깥의 {}는 행이고 안쪽의 {}는 열을 의미한다.
//		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };//new int[][]를 생략하여도 초기화가 가능하다.
//		int[][] a = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7 }, { 8, 9, 10, 11, 12 } };// new int[][]를 생략하여도 초기화가 가능하다.

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d\t", a[i][j]);
			}
			System.out.println();
		}
	}
}
