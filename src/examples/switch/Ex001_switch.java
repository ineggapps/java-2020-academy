import java.util.Scanner;

public class Ex001_switch {
	public static void main(String[] args) {
/*
		1~3������ ���� �Է� �޾� �Է� ���� ����ŭ * �� ����ϴ� ���α׷�
*/
        Scanner sc=new Scanner(System.in);
        int input;

		System.out.print("��  ? ");
		input = sc.nextInt();

		switch(input) { // byte, short, char, int, String(7.0), enum �� ����.(long, float, double�� �Ұ���)
			case 3: System.out.print("*");
			case 2: System.out.print("*");
			case 1: System.out.print("*");
		}
		System.out.println();
		sc.close();
	}
}
