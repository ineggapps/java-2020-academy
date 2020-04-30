package d200221;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] names = new String[3];
		int idx = 0;

		try {

			System.out.println("이름 입력[종료:문장을 입력하지 않고 엔터를 누르세요]...");
			String s;
			while ((s = sc.nextLine()).length() != 0) {
				names[idx++] = s;
				System.out.print("이름 입력: ");// 예외가 발생하면 실행하지 않음
			}
			System.out.println("------------------------");//예외가 발생하면 구문을 실행하지 않고 지나친다.
		} catch (ArrayIndexOutOfBoundsException e) {
			// ArrayIndexOutOfBoundsException : unchecked 예외
			// 배열의 첨자가 범위를 벗어나면 발생하는 예외
			System.out.println("입력을 초과했습니다.");
		} finally {
			// try{} finally{}처럼 catch가 없어도 가능하다.
			System.out.println("예외와 관계없이 실행됩니다.");
			sc.close();
		}

		for (String str : names) {
			System.out.print(str + " ");
		}

		System.out.println("End...");

		try {
			System.out.println("try구문");
		} finally {
			System.out.println("finally구문 (catch없음)");
		}
	}
}
