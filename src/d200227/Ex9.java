package d200227;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		while (true) {
			try {
				System.out.print("수 ? ");
				n = sc.nextInt();
				System.out.println(n);
				break;
			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력 가능합니다.");
				sc.nextLine();//반드시 nextLine()메서드를 호출하여 키보드 버퍼의 \n기호를 없애줘야 한다.
			}
		}
		sc.close();
	}
}
