import java.util.Scanner;

public class Ex003_switch {
	public static void main(String[] args) {
/*
		1~3사이의 수를 입력 받아 입력 받은 수만큼 * 를 출력하는 프로그램
*/
        Scanner sc=new Scanner(System.in);
        int input;

		System.out.print("수  ? ");
		input = sc.nextInt();

		switch(input) {
			case 3: System.out.print("***"); break;
			case 2: System.out.print("**"); break;
			case 1: System.out.print("*"); break;
			default: System.out.print("입력에러..."); break;
		}
		System.out.println();
		sc.close();
	}
}
