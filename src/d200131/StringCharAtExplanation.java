package d200131;

import java.util.Scanner;

public class StringCharAtExplanation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열?");
		String s = sc.next();
		char ch;
		
		//s가 "korea"인 경우
		ch = s.charAt(0);//korea 중 k를 추출 (0번째)
		System.out.println(ch);

		ch = s.charAt(2);//korea 중 r을 추출 (2번째)
		System.out.println(ch);
		
		sc.close();
	}
}
