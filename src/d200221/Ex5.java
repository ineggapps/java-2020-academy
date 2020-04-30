package d200221;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex5 {
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
		} catch (Exception e) {
			//모든 예외를 잡는 catch문만 작성하면 편리하지만, 왜 문제가 발생했는지 정확하게는 모를 수 있다.
			//그리고 문제가 발생한 유형별 처리를 하기에는 다소 곤란할 수 있음.
			System.out.println(e.toString());
		}	

		System.out.println("End");
	}
}
