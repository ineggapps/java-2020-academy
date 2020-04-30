package d200205;

public class ForEx9 {
	public static void main(String[] args) {
		// 다이아몬드 만들기
		// (for문 6개)
		/*
		 * aaaa* aaa*** aa***** a*******
		 *********
		 * a******* aa***** aaa*** aaaa*
		 */

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print("a");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// * 갯수 감소
		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print("a");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("================");
		// for문 2번을 이용하여 위의 결과 만들기
		int s = 5;
		int n = s / 2;// n변수를 이용하여 출력하는 문자의 개수를 조정한다.
		for (int i = 0; i < s; i++) {
			for (int j = 0; j < s - n; j++) {
				System.out.print(j >= n ? "*" : "a");// j>=n의 범위에서만 *을 그리고 그렇지 않으면 공백
			}
			n = i < (s / 2) ? n - 1 : n + 1;// 현재 출력 줄 수가 반절에 미치지 못하면 n-1을 하고, 반절부터는 n+1을 실시한다
			//j<s-n <<< 에서 --n은 +n이 되는 원리를 생각하면 된다.
			System.out.println();
		}

	}
}
