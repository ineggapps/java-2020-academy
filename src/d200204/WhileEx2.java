package d200204;

import java.util.Scanner;

//단을 입력받아 구구단 출력. 단, 입력 받은 단이 1~9를 벗어나면 재입력 받는다.
public class WhileEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan=1, n=0;
		boolean b=true;
		/*
		do~while문을 이용하지 않고도 얼마든지 작성은 가능하지만
		반복문을 처음에 진입하기 위해 boolean 변수를 추가로 true로 초기화하여 설정하여 진입하도록 만들어야 한다.
		가독성을 따지자면 do~while문이 좋다.
		*/
		while(b){
			System.out.print("단 입력> ");
			dan = sc.nextInt();
			//조건식을 판별하여 1~9까지의 숫자라는 조건을 만족하면 b=false로 설정하여 반복문을 빠져나간다.
			if(dan>=1 && dan<=9) {
				b=false;
			}
		}
		
		while(n<9) {
			n++;
			System.out.printf("%d X %d = %d\n",dan,n,dan*n);
		}
		sc.close();
	}
}
