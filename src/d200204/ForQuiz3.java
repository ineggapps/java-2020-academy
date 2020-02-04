package d200204;

import java.util.Scanner;

public class ForQuiz3 {
	public static void main(String[] args) {
		//10개의 정수를 입력 받아 입력 받은 정수 중, 짝수 개수와 홀수 개수를 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		int n, odd=0, even=0;
		System.out.println("10개의 정수를 입력하세요...");
		for(int i=1;i<=10;i++) {
			n =  sc.nextInt();
			if((n&1)==0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.printf("홀수의 개수: %d%n",odd);
		System.out.printf("짝수의 개수: %d%n",even);
		
//		for(int i=1;i<=10;i++) {
//			System.out.println("d");
//			i=10; // 실행횟수 한 번
//			for문 안에서 반복문에 사용된 변수를 변경하면 반복 횟수가 바뀐다.
//		}
		sc.close();
	}
}
