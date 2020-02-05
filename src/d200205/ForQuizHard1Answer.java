package d200205;

import java.util.Scanner;

public class ForQuizHard1Answer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		// diff: 반복하면서 구하는 자연수 7과의 거리(양수)
		// min: 반복하면서 구해진 7과의 거리의 최솟값
		// result: 반복하면서 구해진 7과의 거리의 최솟값을 만드는 정수
		int diff, min = 0, result = 0;
		System.out.println("5개의 정수 입력 ");
		for (int i = 0; i < 5; i++) {
			n = sc.nextInt();
			// 애초에 입력받을 때 음수가 되지 않도록 받을 수도 있구나.
			diff = n > 7 ? n - 7 : 7 - n;
			if (i == 0 || min > diff) {// 맨 처음입력 받은 경우
				min = diff;
				result = n;
			}
		}
		System.out.println("가장 가까운 수: " + result);
		sc.close();
	}
}
