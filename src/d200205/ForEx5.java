package d200205;

public class ForEx5 {
	public static void main(String[] args) {
		// for문을 while문으로 변환하여 작성하기 예제
		for (int i = 1; i <= 10; i++) {
			for (int j = i; j <= i + 9; j++) {
				System.out.printf("%3d\t", j);
			}
			System.out.println();
		}
		// Mini quiz
		System.out.println("======================");
		int i = 1, j;
		while (i <= 10) {
			j = i;
			while (j <= i + 9) {
				System.out.printf("%3d\t", j);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
