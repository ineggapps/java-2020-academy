import java.util.Scanner;

public class Ex003_switch {
	public static void main(String[] args) {
/*
		1~3������ ���� �Է� �޾� �Է� ���� ����ŭ * �� ����ϴ� ���α׷�
*/
        Scanner sc=new Scanner(System.in);
        int input;

		System.out.print("��  ? ");
		input = sc.nextInt();

		switch(input) {
			case 3: System.out.print("***"); break;
			case 2: System.out.print("**"); break;
			case 1: System.out.print("*"); break;
			default: System.out.print("�Է¿���..."); break;
		}
		System.out.println();
		sc.close();
	}
}
