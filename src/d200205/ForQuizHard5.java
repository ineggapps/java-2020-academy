package d200205;

public class ForQuizHard5 {
	public static void main(String[] args) {
		//1~100까지의 수 중 소수를 한 줄에 10개씩출력하고 마지막에 소수의 개수를 출력하는 프로그램
		int cnt = 0;
		for (int i = 2; i <= 100; i++) {
			//단, 수학에서 1은 소수가 아니므로 2부터 반복을 시작한다.
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
		System.out.println("\n소수의 개수: "+cnt);
		
		/*
		 심화: 123의 약수를 구할 때 2~12까지만 계산하여도 소수임을 단정할 수 있다.
		 ∵ 12^2=144 이다.
		 * */
	}
}
