package d200210;

public class ArrayEx6 {
	public static void main(String[] args) {
		/*
		 * ex3) 5X4 행렬에 1~100까지의 난수를 발생하여 대입한 후 출력하고, 5X4 행렬을 4X5행렬로 변환하여 출력하는 프로그램 작성하기
		 */
		// 변수 선언
		int[][] a = new int[5][4];
		int[][] b = new int[4][5];

		// a변수 초기화
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 100) + 1;
			}
		}

		// b변수는 a변수의 모양을 변환하여 담는다.
		for (int i = 0; i < b.length; i++) {// 0~3 (4)
			for (int j = 0; j < b[i].length; j++) {// 0~4 (5)
				// b는 4X5행렬, a는 5X4행렬이니까
				// b[4행][5열] = a[5행][4열]
				b[i][j] = a[j][i];
			}
		}

		// a변수 출력
		System.out.println("a변수: 5X4 행렬");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d\t", a[i][j]);
			}
			System.out.println();
		}
		
		// b변수 출력
		System.out.println("b변수: 4X5 행렬");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.printf("%3d\t", b[i][j]);
			}
			System.out.println();
		}
	}
}
