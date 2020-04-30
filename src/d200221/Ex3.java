package d200221;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3 {
	public static void main(String[] args) {
		// BufferedReader < 꼭 키보드로만 입력을받는 것은 아니다.
		// 다른 수단으로 입력받는다고 할지라도 어쨌든 입력 시에는 어떠한 예외 상황이 발생할 문제를 가지고 있다.
		// ex) 채팅으로 전송 받은 텍스트 데이터 => 도중에 인터넷 연결이 끊어지는 예외 상황이 발생
		// 그렇기 때문에 BufferedReader의 readLine은 IOException에 대한 예외처리를 요구한다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s;
		int a, b, c;

		try {
			// br.readLine()에서 checked exception이 발생하므로 반드시 예외처리가 필요하다.
			// IOException 예외처리를 한다.
			System.out.print("첫 번째 수 ? ");
			s = br.readLine();
			a = Integer.parseInt(s);

			System.out.print("두 번째 수 ? ");
			s = br.readLine();
			b = Integer.parseInt(s);

			c = a / b;
			System.out.println(a + "/" + b + "=" + c);
		} catch (IOException e) {
			// IOException: 입출력에 문제가 발생할 때 발생하는 예외
			// checked exception으로 반드시 예외 처리를 해야 한다.
			// checked exception은 메서드를 정의할 때 throws한 예외이다.
			// 예외 처리를 하지 않으면 컴파일 오류가 발생한다.
			// 단, checked exception이 발생할 만한(throws된) 코드가 없으면 try-catch 블록에 오류가 난다.
			e.printStackTrace();
		}
		System.out.println("end~");

	}

}
