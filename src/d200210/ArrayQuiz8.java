package d200210;

public class ArrayQuiz8 {
	public static void main(String[] args) {
		// 1~25까지의 수 마방진 그리기
		int[][] a = new int[5][5];
		int cnt = 1;
		int size = 5; // 한 라인(가로, 세로)당 몇 번의 숫자를 채워넣는지

		int row = 0;// 세로 좌표
		int col = a.length / 2;// 가로 좌표
		// 연산
		for (int i = 0; i < a.length * a[0].length; i++) {
			//조절된 좌표에 값이 있는지 판단하기 (값이 있으면 세로 한 칸 내리기)
			System.out.printf("cnt=%d, i=%d\n\trow=%d, col=%d\n",cnt, i, row, col);
			System.out.printf("\ti=%d, a[%d][%d]=%d 마킹합니다.\n",i,row,col,a[row][col]);
			if(a[row][col]>0) {
				System.out.printf("\ti=%d, a[%d][%d]=%d 값 존재!\n",i,row,col,a[row][col]);
				//값이 있다면 보정하기
				System.out.printf("\t\trow(row+2), col(col-1)값 보정");
				System.out.printf("\n\t(전) row=%d, col=%d\n", row, col);
				row+=2;
//				col--;
				
				//아래에서 위치보정이 또 실행될 것을 감안함
				row++;
//				col--;
				
				if(col-2<0) {
					col=3;
				}else {
					col-=2;
				}
				
				System.out.printf("\t(후) row=%d, col=%d\n", row, col);
			}else {
				//값이 없으면 삽입하기
				a[row][col] = cnt++;				
			}
			System.out.println(col + 1 >= a.length);
			//들어갈 위치를 보정하기 (세로는 계속 위로, 가로는 계속 오른쪽으로)
			if (row - 1 < 0) {// 세로 무한
				row = a.length - 1;
			} else {
				row--;
			}
			
			col=(col+1)%a.length;
			System.out.printf("\t다음 커서: row=%d, col=%d\n", row, col);
//			if (col + 1 >= a.length) {// 가로 무한
//				col = 0;
//			} else {
//				col++;
//			}
			
			// 출력
			System.out.println();
			for (int ii = 0; ii < a.length; ii++) {
				for (int jj = 0; jj < a[0].length; jj++) {
					System.out.printf("%3d\t", a[ii][jj]);
				}
				System.out.println();
			}
		}

		// 출력
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.printf("%3d\t", a[i][j]);
			}
			System.out.println();
		}
	}
}
