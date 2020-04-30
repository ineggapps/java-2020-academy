package d200210;

public class ArrayQuiz4 {
	public static void main(String[] args) {
		/*
		 5행 5열의 배열에 1~15까지의 수를 실행결과처럼 역 직각삼각형 모양으로 채워서 출력
		 1		2		3		4		5
	 			6		7		8		9
 						10		11		12	
 								13		14
 										15
		 */
		
		int a[][] = new int[5][5];
		int cnt=1;
		//연산하여 값을 대입하기
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a[0].length;j++) {
				a[i][j]=cnt++;
			}
		}
		//출력하기
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(a[i][j]!=0) {					
					System.out.printf("%3d\t",a[i][j]);
				}else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}
