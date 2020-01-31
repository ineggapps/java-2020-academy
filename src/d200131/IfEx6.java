package d200131;

import java.util.Scanner;

public class IfEx6 {
	public static void main(String[] args) {
		// 한 문자를 입력받아서 대문자, 소문자, 기타문자인지 판별하기
		// else 없이 작성
		Scanner sc = new Scanner(System.in);
		char c;

		System.out.print("한 문자 입력: ");
		c = sc.next().charAt(0);

		if (c >= 'A' && c <= 'Z') {
			System.out.println("입력 문자는 대문자");
		}
		
		if (c >= 'a' && c <= 'z') {
			System.out.println("입력 문자는 소문자");
		}
		
		if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')) {
			System.out.println("입력 문자는 기타 문자");
		}

		sc.close();
	}
}
