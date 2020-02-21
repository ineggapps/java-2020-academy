package d200221;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		User8 u = new User8();
		u.input();
	}
}

class User8 {
	private Scanner sc = new Scanner(System.in);

	private int inputScore() {
		int result = 0;
		// 아무데서나 try{}catch{}블록을 쓰면 오히려 더 이상하게 실행이 될 수도 있다.
		// 점수 입력에서 오류가 발생하면 전화번호가 점수에서 올바르게 입력되지 않은 문자가 입력되어 프로그램이 종료된다.
		// inputScore를 부른 메서드인 input메서드에게 오류가 발생했다고 알려주지 않고 자체적으로 실행해 버렸다.
		// 그래서 국어와 영어점수에는 계속 문자열값을 대입을 시도하려다가 오류가 연달아 발생하고 예외처리가 실행된다.
		// input메서드는 오류가 난 사실을 알지 못한 채 문자열값 입력을 tel = sc.next()구문에서 최종적으로 실행한다.
		// 결론적으로 String의 값을 받는 tel = sc.next();구문에서 문자열이 입력된 뒤에 프로그램이 종료된다.
		try {
			result = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력 가능합니다.");
			sc.nextLine();//문제가 있는 데이터를 읽어서 버림
			//예외를 명시적으로 발생시킨다.
//			throw new Exception("숫자만 입력 가능합니다");
		}
		return result;
	}

	public void input() {
		String name, tel;
		int kor, eng;

		System.out.print("이름 ? ");
		name = sc.next();

		System.out.print("국어 ? ");
		kor = inputScore();

		System.out.print("영어 ? ");
		eng = inputScore();

		System.out.print("전화번호 ? ");
		tel = sc.next();

		System.out.println(name + ":" + kor + ":" + eng + ":" + tel);

	}
}