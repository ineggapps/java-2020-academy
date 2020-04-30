package d200204;

public class ForQuiz9 {
	public static void main(String[] args) {
		// 1~10까지의 합, 11~20까지의 합, ..., 91~100까지의 합을 구하는 프로그램 작성하기.
		int s = 0;
		for (int n = 1; n <= 100; n++) {
			s += n;
			if (n % 10 == 0) {
				System.out.printf("%d~%d까지의 합: %d\n", n - 9, n, s);
				s = 0;
			}
		}
	}
}
