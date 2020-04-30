package d200204;

import java.util.Scanner;

public class ForQuiz6Advanced {
	public static void main(String[] args) {
		// 10개의 정수를 입력 받은 정수 중 가장 작은 값을 출력하는 프로그램 작성하기
		Scanner sc = new Scanner(System.in);
		int min =0, n;
		System.out.println("(최솟값 구하기) 10개의 정수 입력");
		for (int i = 1; i <= 10; i++) {
			n = sc.nextInt();
			if(i==1) {//처음에 입력받는 값을 min으로 세팅하고 비교한다.
				min = n;
			}
			else if (min> n) {
				min= n;
			}
		}
		System.out.println("최솟값: "+ min);
		sc.close();
	}
}
