package d200221;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User16 user = new User16();

		try {
			System.out.print("이름 ? ");
			user.setName(sc.next());
			System.out.print("나이 ? ");
			user.setAge(sc.nextInt());
			System.out.println(user.getName() + ":" + user.getAge());
		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력하세요.");
		} catch (AgeValidException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {// InputMismatchException과 AgeValidException 이외의 예외가 발생한 경우
			System.out.println("입력 오류");
		} finally {
			sc.close();
		}

		System.out.println("프로그램 종료");
	}
}

//사용자 정의 예외 클래스 작성
class AgeValidException extends Exception {
	private static final long serialVersionUID = 1L;

	// serialVersionUID: Exception을 신원을 구별 (기입하지 않으면 컴파일러가 자동으로 붙여 줌)
	// 분산환경 같은 네트워크 환경에서도 쓰이는 개념이므로 가볍게 생각.
	public AgeValidException() {
		this("AgeValidException");
	}

	public AgeValidException(String message) {
		super(message);
	}
}

class User16 {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws AgeValidException {
		if (age < 0) {
			throw new AgeValidException("나이는 0보다 크거나 같아야합니다.");
		}
		this.age = age;

	}
}