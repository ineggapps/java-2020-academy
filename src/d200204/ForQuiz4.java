package d200204;

public class ForQuiz4 {
	public static void main(String[] args) {
		// 다중 for문을 이용하여 2단에서 9단까지의 구구단이 아래의 실행 결과처럼 출력되는 프로그램 작성하기
		int dan, n;
		for (n = 1; n <= 9; n++) {
			for (dan = 2; dan <= 9; dan++) {
				System.out.printf("%3d * %3d=%3d\t",dan,n,dan*n);
			}
			System.out.println();
		}
	}
}
