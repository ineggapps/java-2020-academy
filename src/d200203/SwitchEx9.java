package d200203;

import java.util.Scanner;

public class SwitchEx9 {
	/*
	 * �� �����ڸ� �Է� �޾� ��Ģ����
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		String oper;

		System.out.print("�� �� �Է�: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();

		System.out.print("������ �Է�[+-*/]: ");
		oper = sc.next();

		switch (oper) {
		case "+":
			System.out.printf("%d %s %d = %d\n", n1, oper, n2, n1 + n2);
			break;
		case "-":
			System.out.printf("%d %s %d = %d\n", n1, oper, n2, n1 - n2);
			break;
		case "*":
			System.out.printf("%d %s %d = %d\n", n1, oper, n2, n1 * n2);
			break;
		case "/":
			System.out.printf("%d %s %d = %.2f\n", n1, oper, n2, (double)n1 / n2);
			break;
		default:
			System.out.println("��� ����: �ùٸ��� ���� ������");
			break;
		}

		sc.close();
	}
}
