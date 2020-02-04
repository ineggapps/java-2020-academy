package d200204;

public class WhileQuizBasic10 {
	public static void main(String[] args) {
		//구구단을 2단에서 9단까지 실행 결과처럼 가로로 출력하는 프로그램 작성하기
		//While(조건)문을 이용하여 작성
		int dan=2, n=1;
		while(n<10) {
			dan++;
			System.out.printf("%d*%d=%d\t",dan,n,dan*n);
			if(dan==9){
				dan=2;
				n++;
				System.out.println();
			}
		}
	}
}
