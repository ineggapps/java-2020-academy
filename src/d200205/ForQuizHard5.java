package d200205;

public class ForQuizHard5 {
	public static void main(String[] args) {
		int cnt = 0;
		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j <= i; j++) {
				// j는 i가 소수인지 판별하기 위해 2부터 자기자신까지 증가하며 순차적으로 대입해 나눠 본다.
				if (i % j == 0 && i != j) {// i는 j와 나누어 떨어지고, 자기 자신이 아니면?
					// 조건을 만족하면 어차피 소수가 아니므로 연산을 중단한다
					break;
				} else if (i == j) {
					// 자기 자신까지 나누어보았다면?
					cnt++;// 소수가 분명해
					System.out.printf("%d\t", i);
					if (cnt % 10 == 0) {
						System.out.println();
					}
				}
			}
		}
	}
}
