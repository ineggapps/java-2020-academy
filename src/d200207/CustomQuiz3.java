package d200207;

import java.util.Scanner;

public class CustomQuiz3 {
	public static void main(String[] args) {
		// Ȧ¦ ����
		Scanner sc = new Scanner(System.in);
		int com;
		int user;
		// 1. Ȧ 2. ¦ 3. ����
		while (true) {
			System.out.println("���� ��ǻ�Ͱ� �����ϴ� ���ڴ� Ȧ���ϱ��, ¦���ϱ��?");
			System.out.print("1.Ȧ, 2.¦, 3.���� > ");
			user = sc.nextInt();

			// �Է°� ����
			if (user < 1 && user > 3) {
				continue;
			} else if (user == 3) {
				break;
			}

			// ���
			com = (int) (Math.random() * 100) + 1;
			System.out.println("��ǻ��: " + com);
			System.out.println("�����: " + (user == 1 ? "Ȧ��" : "¦��"));
			if (com % 2 == user % 2) {
				System.out.println("�������ϴ�.");
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
				break;
			}
		}

		System.out.println("���α׷��� �����մϴ�.");
		sc.close();
	}
}
