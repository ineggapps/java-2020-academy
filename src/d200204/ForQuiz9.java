package d200204;

public class ForQuiz9 {
	public static void main(String[] args) {
		// 1~10������ ��, 11~20������ ��, ..., 91~100������ ���� ���ϴ� ���α׷� �ۼ��ϱ�.
		int s = 0;
		for (int n = 1; n <= 100; n++) {
			s += n;
			if (n % 10 == 0) {
				System.out.printf("%d~%d������ ��: %d\n", n - 9, n, s);
				s = 0;
			}
		}
	}
}
