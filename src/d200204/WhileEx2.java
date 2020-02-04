package d200204;

import java.util.Scanner;

//단을 입력받아 구구단 출력. 단, 입력 받은 단이 1~9를 벗어나면 재입력 받는다.
public class WhileEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan, n=0;
		do {
			System.out.print("단 입력> ");
			dan = sc.nextInt();
			//while의 조건은 입력을 다시 받는 조건을 명시하면 된다.
		}while(dan<1 || dan>9);
		
		while(n<9) {
			n++;
			System.out.printf("%d X %d = %d\n",dan,n,dan*n);
		}
		sc.close();
	}
}
