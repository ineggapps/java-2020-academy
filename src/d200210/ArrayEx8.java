package d200210;

public class ArrayEx8 {
	public static void main(String[] args) {
		// 정방행렬의 합과 곱 (정방행렬이므로 사이즈가 변하지는 않음)
		int a[][] = new int[][] { { 1, 5, 6 }, { 2, 4, 7 }, { 2, 5, 8 } };
		int b[][] = new int[][] { { 7, 1, 6 }, { 3, 4, 7 }, { 4, 6, 3 } };
//		int a[][] = new int[][] { { 1, 5 }, { 2, 4 } };
//		int b[][] = new int[][] { { 7, 1 }, { 3, 4 } };
		int hap[][] = new int[b.length][b[0].length];
		int gop[][] = new int[b.length][b[0].length];

		// 합
		for (int i = 0; i < hap.length; i++) {
			for (int j = 0; j < hap[i].length; j++) {
				hap[i][j] = a[i][j] + b[i][j];
			}
		}

		System.out.println("합...");
		for (int i = 0; i < hap.length; i++) {
			for (int j = 0; j < hap[i].length; j++) {
				System.out.printf("%3d\t", hap[i][j]);
			}
			System.out.println();
		}

		// 곱
		for (int i = 0; i < gop.length; i++) {
			for (int j = 0; j < gop[i].length; j++) {
				for(int k=0;k<gop[i].length;k++) {					
//					gop[0][0] = a[0][0] * b[0][0] + a[0][1] * b[1][0]을 함축시켜 놓은 것
					gop[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		System.out.println("곱...");
		for (int i = 0; i < gop.length; i++) {
			for (int j = 0; j < gop[i].length; j++) {
				System.out.printf("%3d\t", gop[i][j]);
			}
			System.out.println();
		}

	}
}
