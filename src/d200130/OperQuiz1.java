package d200130;

import java.util.Scanner;

public class OperQuiz1 {
	//가로와 세로를 입력 받아 직사각형의 넓이와 둘레 계산
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int width, height;
		System.out.print("너비 ? ");
		width = sc.nextInt();
		System.out.print("높이 ? ");
		height = sc.nextInt();
		System.out.printf("가로 %d, 세로 %d인 사각형의 넓이는 %d이며, 둘레는 %d입니다.\n",width,height,width*height,(width+height)*2);
		sc.close();
	}
}
