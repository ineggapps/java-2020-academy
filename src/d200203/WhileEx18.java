package d200203;

import java.util.Scanner;

public class WhileEx18 {
	public static void main(String[] args) {
		//단을 입력 받아
		Scanner sc = new Scanner(System.in);
		int dan,n=0;
		
		System.out.print("단[1~9] 입력: ");
		dan = sc.nextInt();
		
		//내부적으로는 컴파일러가 while 조건문을 해석하여 작성한 반복문을 일일이 풀어놓는다.
		//속도가 무조건 빠른 건 아님. 디버깅의 편이성, 작업의 효율성 등을 고려하여 탄생한 개념이다.
		while(n<9) {// dan * 9까지 출력되도록 범위 설정하기
			n++;
			System.out.printf("%d X %d = %d%n",dan,n,dan*n);
		}
		
		sc.close();
	}
}
