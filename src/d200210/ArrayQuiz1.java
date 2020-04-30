package d200210;

public class ArrayQuiz1 {
	public static void main(String[] args) {
		/*
		 5행 5열의 배열에 1~25까지의 수를 실행결과처럼 ㄹ자 모양으로 채워 출력하는 프로그램 작성하기
		   1	  2			3	  4	  5	
		 10	  9			8	  7	  6	
		 11	 12	 13	 14	 15	
		 20	 19	 18	 17	 16	
		 21	 22	 23	 24	 25	1	
		 * */
		int[][] a = new int[5][5];
		int n = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
//				한 줄로 요약
//				a[i][((i&1)==0)?j:a[i].length-1-j] = ++n;
				n++;
				
				if(i%2==0) {
					a[i][j]=n;
				}else {
					a[i][a[i].length-1-j]=n;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d\t", a[i][j]);
			}
			System.out.println();
		}
	}
}
