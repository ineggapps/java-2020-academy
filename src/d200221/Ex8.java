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

	// throws Exception: 메서드를 호출한 곳에서 Exception checked 예외를 catch하여야 한다고 명시한 것.
	// cf) RuntimeException class만 unchecked exception이다.
	//throws 예약어만 붙일 수도 있지만, 통상적으로는 메서드 안에서 throw new 구문과 같이 실행한다.
	//throws: 특정 예외의 상황이 발생할 수 있다는 것을 명시 
	//throw: 특정 예외의 상황이 발생해야 할 때 throw new ~로 메서드 내부에서 구문을 기술할 시 호출한 메서드쪽으로 예외의 상황이 전달됨.
	//Exception도 클래스이므로 새로운 예외의 객체를 생성(new)하여 호출한 메서드쪽으로 넘겨주어야 한다.
	private int inputScore() throws Exception {
		int result = 0;
		// 아무데서나 try{}catch{}블록을 쓰면 오히려 더 이상하게 실행이 될 수도 있다.
		// 점수 입력에서 오류가 발생하면 전화번호가 점수에서 올바르게 입력되지 않은 문자가 입력되어 프로그램이 종료된다.
		// inputScore를 부른 메서드인 input메서드에게 오류가 발생했다고 알려주지 않고 자체적으로 실행해 버렸다.
		// 그래서 국어와 영어점수에는 계속 문자열값을 대입을 시도하려다가 오류가 연달아 발생하고 예외처리가 실행된다.
		// input메서드는 오류가 난 사실을 알지 못한 채 문자열값 입력을 tel = sc.next()구문에서 최종적으로 실행한다.
		// 결론적으로 String의 값을 받는 tel = sc.next();구문에서 문자열이 입력된 뒤에 프로그램이 종료된다.
		try {
			result = sc.nextInt();
			if (result < 0 || result > 100) {
				//예외 던짐. 실행을 중지하고 호출 함수 쪽에서 예외를 발생시킴.
				throw new Exception("점수는 0~100 사이만 가능합니다.");
			}
		} catch (InputMismatchException e) {
//			System.out.println("숫자만 입력 가능합니다.");
			sc.nextLine();// 문제가 있는 데이터를 읽어서 버림
			// 예외를 명시적으로 발생시킨다.
			throw new Exception("숫자만 입력 가능합니다");
		}
		return result;
	}

	public void input() {
		String name, tel;
		int kor, eng;

		try {
			System.out.print("이름 ? ");
			name = sc.next();

			System.out.print("국어 ? ");
			kor = inputScore();

			System.out.print("영어 ? ");
			eng = inputScore();

			System.out.print("전화번호 ? ");
			tel = sc.next();

			System.out.println(name + ":" + kor + ":" + eng + ":" + tel);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("-----------------------------------");
	}
}