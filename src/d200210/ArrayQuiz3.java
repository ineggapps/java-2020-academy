package d200210;

public class ArrayQuiz3 {
	public static void main(String[] args) {
		/*
		 4행 5열의 배열에 1~20까지의 수를 실행결과처럼 채워 출력하는 프로그램 작성하기
		 1		8		9		16		17
		 2		7		10		15		18
		 3		6		11		14		19
		 4		5		12		13		20
		 */
		int a[][] = new int[4][5];
		int cnt=1;
		//삽입하기
		for(int i=0;i<a[0].length;i++) {
			for(int j=0;j<a.length;j++) {
//				한 줄로 함축시킨 삼항연산자는 다음과 같다.
//				a[((i&1)==1?a.length-1-j:j)][i]=cnt++;
				
				//전개하면 다음과 같다.
				cnt++;
				if(i%2==0) {
					a[j][i]=cnt;
				}else {
					a[a.length-1-j][i]=cnt;
				}
				
			}
		}
		//출력
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.printf("%3d\t",a[i][j]);
			}
			System.out.println();
		}
	}
}
