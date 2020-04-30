package d200227;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		try {
			//try catch문 안에 있으면 무한루프를 돌지 않고 바로 while 반복문 밖으로 빠져나감.
			while (true) {
				System.out.print("수 : ");
				n = sc.nextInt();
				System.out.println(n);
			}
		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력 가능");
		} finally {
			sc.close();
		}
	}
}
