import java.util.Scanner;

public class Ex004_switch {
	public static void main(String[] args) {
/*
		입력 받은문자가 숫자인지 판별하는 프로그램
*/
        Scanner sc=new Scanner(System.in);
        char ch;

		System.out.print("문자  ? ");
		ch = sc.next().charAt(0);

		switch(ch) {
			case '0': case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': 
			case '9': System.out.println(ch+"는(은) 숫자입니다."); break;
			default: System.out.print(ch+"는(은) 숫자가 아닙니다."); break;
		}
		System.out.println();
		sc.close();
	}
}
