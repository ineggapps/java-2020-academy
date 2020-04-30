package d200210;

public class ArrayQuiz7 {
	public static void main(String[] args) {
		// 1~25까지의 수 실행결과처럼 달팽이 모양으로 채워 넣기
		int size = 5; // 한 라인(가로, 세로)당 몇 번의 숫자를 채워넣는지
		int[][] a = new int[size][size];
		int n=0, r=0, c=-1;
		// 연산
		for (int i = 0; i < size* 2 - 1; i++) {
			for(int j=0;j< size-(i/2);j++) {//★
				n++;
				if(i%4==1) // 좌->우
					a[r][++c]=n;
				else if(i%4==2) // 위->아래
					a[++r][c]=n;
				else if(i%4==3) // 우->좌
					a[r][--c]=n;
				else // 아래->위
					a[--r][c]=n;
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
