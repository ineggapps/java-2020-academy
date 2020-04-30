package d200203;

import java.util.Scanner;

public class SwitchEx7 {
	public static void main(String[] args) {
		// 한 문자를 입력 받아 숫자인지 아닌지 판별하는 프로그램
		Scanner sc = new Scanner(System.in);
		char c;

		System.out.print("문자 입력: ");
		c = sc.next().charAt(0);

		switch (c) {
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			System.out.println(c + ": 숫자");
			break;
		default:
			System.out.println(c + ": 숫자가 아님");
			break;

		}
		
		//하지만 switch문을 if문으로도 표현할 수 있음 (더 간편하고 효율적)
//		if(c>='0' && c<='9') {
//			System.out.println(c + ": 숫자");
//		}else {			
//			System.out.println(c + ": 숫자가 아님");
//		}
		
		sc.close();
	}
}
