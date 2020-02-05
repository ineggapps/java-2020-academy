import java.util.Scanner;

public class Ex001_switch {
	public static void main(String[] args) {
/*
		1~3사이의 수를 입력 받아 입력 받은 수만큼 * 를 출력하는 프로그램
*/
        Scanner sc=new Scanner(System.in);
        int input;

		System.out.print("수  ? ");
		input = sc.nextInt();

		switch(input) { // byte, short, char, int, String(7.0), enum 만 가능.(long, float, double는 불가능)
			case 3: System.out.print("*");
			case 2: System.out.print("*");
			case 1: System.out.print("*");
		}
		System.out.println();
		sc.close();
	}
}
