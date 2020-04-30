package d200129;

import java.util.Scanner;
/*
 * 초를 입력 받아 시, 분, 초로 변환하는 프로그램을 작성하세요.
 * [처리조건]
 * - 초의 입력은 Scanner 클래스의 nextInt() 메서드를 이용한다.
 * */
public class OperQuiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour, minute, second, inputSecond;
		System.out.print("초를 입력하세요?");
		inputSecond = sc.nextInt();
		
		hour = inputSecond/(3600);
		minute = (inputSecond/60)%60;
//		minute = (inputSecond-hour*3600)/60;
		second = inputSecond%60;
		
		System.out.printf("%d초는 %d시간 %d분 %d초 입니다.\n",inputSecond, hour, minute, second);
		sc.close();		
	}
}
