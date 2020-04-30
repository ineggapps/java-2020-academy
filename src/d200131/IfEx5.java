package d200131;

import java.util.Scanner;

public class IfEx5 {
	public static void main(String[] args) {
		// 세 수를 입력 받아 작은 수에서 큰 수 순으로 출력하기.
		Scanner sc = new Scanner(System.in);
		int a, b, c, t;

		// 똑같이 나열된 세 수 1,2,3을 입력받아오는 순서는 총 6가지(3!)이다.
		System.out.print("숫자 3개 입력 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		// 제일 작은 수를 a방에 넣는 방식으로 수행
		
		//a와b의 크기를 비교하여 a, b 순서대로 입력
		if (a > b) {
			t = a;
			a = b;
			b = t;
		}
		
		//a와 c의 크기를 비교. 이미 위에서 b는 a보다 큰 수로 정리가 되어 있음.
		if (a > c) {
			t = a;
			a = c;
			c = t;
		}
		
		//↑위의 구문의 실행을 모두 완료하면 a의 변수에는 a,b,c 중 가장 작은 값이 들어간다.

		//b와 c의 크기를 비교.
		if(b>c) {
			t=b;
			b=c;
			c=t
					;
		}
		
		System.out.format("%d, %d, %d", a, b, c);
		sc.close();
	}
}
