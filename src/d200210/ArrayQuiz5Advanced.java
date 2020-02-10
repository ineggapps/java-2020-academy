package d200210;

public class ArrayQuiz5Advanced {
	public static void main(String[] args) {
		int a[][] = new int[5][5];
		int cnt = 1;
		int k;
		/*
		 5X5 행렬에서는 대각선을 9번 긋는다.
		 
		 */
		// 배열 변수 조정
		for (int i = 0; i < a.length*2-1; i++) {
			for (int j = 0; j < a[0].length; j++) {// 대각선 그릴 때의 행
				k=i-j;
				/*
				 k=0-0 *continue
				 k=0-1 *continue
				 k=0-2 *continue
				 k=0-3 *continue
				 k=0-4 *continue
				 
				 k=1-0
				 k=1-2 *continue
				 k=1-3 *continue
				 k=1-4 *continue
				 
				 k=2-0
				 k=2-1
				 k=2-2
				 k=2-3
				 k=2-4
				 */
				if(k<0||k>4)continue;
				a[j][k] = cnt++;
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
