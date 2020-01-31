package d200131;

import java.util.Scanner;

public class IfQuiz3 {
	//영대문자 입력받으면 소문자로, 영소문자는 대문자로 변환하는 프로그램 출력
	//단, 기타 문자는 그대로 출력한다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch, r;

		System.out.print("한 문자 입력: ");
		ch = sc.next().charAt(0);

		if (ch >= 'A' && ch <= 'Z') {
			r = (char) (ch + 32);
		} else if (ch >= 'a' && ch <= 'z') {
			r = (char) (ch - 32);
		} else {
			r = ch;
		}

		System.out.println(ch + " => " + r);

		sc.close();
	}
}
