package d200210;

import java.util.Scanner;

public class ArrayQuiz8WithComment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;// 한 라인(가로, 세로)당 몇 번의 숫자를 채워넣는지
		do {
			System.out.print("홀수 ? ");
			size = sc.nextInt();
		} while ((size & 1) == 0);
		// 1~25까지의 수 마방진 그리기
		int[][] a = new int[size][size];
		int cnt = 1;

		int row = 0;// 세로 좌표
		int col = a.length / 2;// 가로 좌표
		// 연산
		for (int i = 0; i < size * size; i++) {
			System.out.printf("현재 cnt=%d, i=%d %nrow=%d, col=%d그리기!%n", cnt, i, row, col);
			// 출력
			a[row][col] = cnt++;

			// 좌표 이동
			if (row - 1 < 0) {
				row = a.length - 1;
			} else {
				row--;
			}
			if (col + 1 >= a.length) {
				col = 0;
			} else {
				col++;
			}

			// 조절된 좌표에 값이 있는지 판단하기 (값이 있으면 세로 한 칸 내리기)
			if (a[row][col] > 0) {
//				System.out.printf("값이 존재 a[%d][%d]=%d%n",row,col,a[row][col]);
				// 값 보정하기
				row += 2;
				col--;
//				System.out.printf("보정: row=%d, col=%d%n",row,col);
			}

			// 위치가 유효하지 않은 범위의 영역이라면 보정하기
			if (row >= a.length) {
				row = row - a.length;
			}
			if (col < 0) {
				col = size + col;
			}

			//중간 출력
//			System.out.println();
//			for (int ii = 0; ii < a.length; ii++) {
//				for (int jj = 0; jj < a[0].length; jj++) {
//					System.out.printf("%3d\t", a[ii][jj]);
//				}
//				System.out.println();
//			}
		}

		System.out.println();
		// 출력
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.printf("%3d\t", a[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}
}
