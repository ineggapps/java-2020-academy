package d200206;

public class ForQuizHard3 {
	public static void main(String[] args) {
		// 1. 1~100까지의 수 중 3,6,9가 들어 있는 수는 *로 출력, 나머지는 자신의 수 출력
		// 2. 한 줄에는 10개씩만 출력
		for (int i = 1; i <= 100; i++) {

			//100까지라고 범위를 한정했으므로 10을 나눈 나머지(일의자리)와 10을 나눈 몫(10의 자리)를 구하여 3,6,9가 들어갔는지를 확인한다.
			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9 || i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
				System.out.print("*\t");
			} else {
				System.out.format("%d\t", i);
			}

			if (i % 10 == 0) {
				System.out.println();
			}
		}
	}
}
