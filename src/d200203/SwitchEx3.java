package d200203;

import java.util.Scanner;

public class SwitchEx3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("정수 입력: ");
		a = sc.nextInt();

		switch (a) {
		case 3:
			System.out.println("***");
		case 2:
			System.out.println("**");
		case 1:
			System.out.println("*");
		}
		
//		switch (a) {
//		case 3:
//			System.out.println("*");
//		case 2:
//			System.out.println("*");
//		case 1:
//			System.out.println("*");
//		}
		
		sc.close();
	}
}
