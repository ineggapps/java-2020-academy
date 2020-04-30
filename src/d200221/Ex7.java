package d200221;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;

		try {
			System.out.print("두 수 ? ");
			a = sc.nextInt();
			b = sc.nextInt();
			c = a + b;
			System.out.println(c);
		} catch (InputMismatchException e) {
			//InputMismatchException: unchecked 예외
			//Scanner의 nextInt()메 등에서 숫자가 입력되지 않은 경우 오류가 발생한다.
			System.out.println("숫자만 입력 가능합니다.");
			e.printStackTrace();
		} finally {
			// 예외가 발생하여도 무조건 실행한다. (∵ 밑의 end구문은 실행되지 않거든!)
			System.out.println("예외와 관계없이 실행된다.");
			sc.close();
		}

		System.out.println("end");
	}
}
