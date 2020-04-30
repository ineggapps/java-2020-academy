package d200205;

public class ForQuizHard7 {
	public static void main(String[] args) {
		//구구단을 한 줄에 4단씩 출력하는 프로그램
		int unit = 4;
		// 2~9단까지의 구구단을 한 줄에 4단씩 출력하는 프로그램을 작성한다.
		for (int i = 2; i < 10; i += unit) {
			// i는 구구단을 2번 분절하여 출력시키기 위한 변수
			for (int n = 1; n <= 9; n++) {// X1~ X9 9줄 출력하기
				for (int dan = i; dan < i + 4; dan++) {
					System.out.printf("%d * %d = %3d\t",dan,n, n * dan);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
