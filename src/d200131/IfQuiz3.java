package d200131;

import java.util.Scanner;

public class IfQuiz3 {
	//���빮�� �Է¹����� �ҹ��ڷ�, ���ҹ��ڴ� �빮�ڷ� ��ȯ�ϴ� ���α׷� ���
	//��, ��Ÿ ���ڴ� �״�� ����Ѵ�.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch, r;

		System.out.print("�� ���� �Է�: ");
		ch = sc.next().charAt(0);

		if (ch >= 'A' && ch <= 'Z') {
			r = (char) (ch + 32);
		} else if (ch >= 'a' && ch <= 'z') {
			r = (char) (ch - 32);
		} else {
			r = ch;
		}

		System.out.println(ch + " => " + r);

		sc.close();
	}
}
