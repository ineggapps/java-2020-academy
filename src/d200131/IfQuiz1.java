package d200131;

import java.util.Scanner;

public class IfQuiz1 {
	//if���� �̿��Ͽ� �� ���� ���� ���ϵ� �ᱣ���� ����� �ǵ��� �ϴ� ���α׷�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, result;

		System.out.print("ù ��° �� �Է�: ");
		num1 = sc.nextInt();
		System.out.print("�� ��° �� �Է�: ");
		num2 = sc.nextInt();

//		�ذ��� #1
//		if (num1 > num2) {
//			result = num1 - num2;
//		} else {
//			result = num2 - num1;
//		}

//		�ذ��� #2
		result = num1 - num2;
		if (result < 0) {
			result = -result;
		}

		System.out.println("�� ���� ����: " + result);

		sc.close();
	}
}
