package d200210;

public class ArrayQuiz5 {
	public static void main(String[] args) {
		/*
		 * 5행 5열의 배열에 1~25까지의 수를 실행결과처럼 대각선 모양으로 채워 출력하는 프로그램
		 */

		int a[][] = new int[5][5];
		int size = a.length * a[0].length;
		int diag = 0;
		int cnt = 1;

		// 연산
		for (int i = 0; i < a[0].length; i++) {// 열의 범위를 지정
			if (i < a[0].length) {
				diag++;
			} else {
				diag--;
			}
//			System.out.printf("j=0; j<%d\n", diag);
			for (int j = 0; j < diag; j++) {
				a[j][diag - 1 - j] = cnt++;
				/*
				
				 * */
			}
		}

		int start;
		for (int i = 1; i < a[0].length; i++) {
			start = a.length - 1;
			for (int j = i; j < a.length; j++) {
//				System.out.printf("%d %d\n", j, a.length - j);
				a[j][start--] = cnt++;
				// 감소 for문
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
/*
 * 				
  j  diag-j 
 0	0
 
 0 1
 1 0
 
 0 2
 1 1
 2 0
 
 0 3
 1 2
 2 1 
 3 0
 
 0 4
 1 3
 2 2
 3 1 
 4 0
 
 -------------------------

1 4
2 3
3 2
4 1

2 4
3 3
4 2

3 4
4 3

4 4
* */