package d200221;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b, c;

		try {
			System.out.print("첫 번째 수 > ");
			a = Integer.parseInt(br.readLine());
			System.out.print("두 번째 수 > ");
			b = Integer.parseInt(br.readLine());
			c = a / b;
			System.out.println(a + "/" + b + "=" + c);
		} catch (IOException e) { // checked 예외
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			// NumberFormatException: unchecked exception
			// 반드시 catch할 필요 없지만, 예외가 발생하면 프로그램은 비정상적으로 종료된다.
			// 문자열을 숫자로 변경이 불가능한 경우 발생한다.
//			System.out.println("숫자만 입력이 가능합니다.");
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (ArithmeticException e) {
			// unchecked 예외
			System.out.println("0으로 나눌 수 없습니다.");
//			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			// Exception: 모든 예외를 catch할 수 있음.
			// 여러 예외를 catch한 경우 가장 마지막에 기술한다. (Exception e)s
			System.out.println(e.toString());
		}

		System.out.println("End");
	}
}
