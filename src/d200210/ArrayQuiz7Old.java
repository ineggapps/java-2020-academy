package d200210;

public class ArrayQuiz7Old {
	public static void main(String[] args) {
		// 1~25까지의 수 실행결과처럼 달팽이 모양으로 채워 넣기
		int[][] a = new int[5][5];
		int n = 1;
		int size = a.length; // 한 라인(가로, 세로)당 몇 번의 숫자를 채워넣는지

		int start= 0;
		int increment = 1;
		int rowCount = 0;
		// 연산
		for (int i = 0; i < a.length * 2 - 1; i++) {
			for (int j = 0; j < size; j += increment) {
				System.out.println();
				System.out.printf("i=%d, j=%d, size=%d, start=%d일 때 구문 시작\n", i, j,size,start);
				if(rowCount%4<2) {
					System.out.printf("a[%d][%d]=%d%n",start,j,n);
					a[start][j] = n++;
				}else {
					System.out.printf("a[%d][%d]=%d%n",j,start,n);
					a[j][start] = n++;
				}
				if (j == size - 1) {
					start = j;
				}
			}
			rowCount++;
			System.out.printf("연산 마치고 rowCount=%d됨%n",rowCount);
			if (i > 0 && rowCount % 2 == 1) {
				System.out.printf("size 감소 %d=>%d\n", size, size - 1);
				size--;
			}
			if (i > 0 && rowCount % 2 == 0) {
				System.out.printf("offset 반전 %d=>%d\n", increment, -increment);
				increment = -increment;// *-1
			}

			// 중간 출력
			System.out.println();
			for (int ii = 0; ii < a.length; ii++) {
				for (int jj = 0; jj < a[0].length; jj++) {
					System.out.printf("%3d\t", a[ii][jj]);
				}
				System.out.println();
			}
		}
		System.out.println();
		// 출력
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.printf("%3d\t", a[i][j]);
			}
			System.out.println();
		}
	}
}
