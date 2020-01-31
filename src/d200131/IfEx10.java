package d200131;

import java.util.Scanner;

public class IfEx10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		
		System.out.print("문자 입력: ");
		ch=sc.next().charAt(0);
		
		if(ch>='A'&&ch<='Z') {
			System.out.println(ch+": 대문자");
		}
		else if(ch>='a'&&ch<='z') {
			System.out.println(ch+": 소문자");
		}
		else {
			System.out.println(ch+": 기타 문자");
		}
		
		sc.close();
	}
}
