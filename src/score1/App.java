package score1;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch=0;
		ScoreService ss = new ScoreService();
		while (ch!=5) {
			do {
				System.out.print("1.�Է� 2.��� 3.�˻� 4.���� 5.���� > ");
				ch = sc.nextInt();
				if (ch == 5) {
					break;
				}
				switch (ch) {
				case 1:
					ss.input();
					break;
				case 2:
					ss.print();
					break;
				case 3:
					ss.findByName();
					break;
				case 4:
					ss.delete();
					break;
				}
			} while (ch < 1 || ch > 5);
		}
//		// 1.�Է� ����
//		System.out.println("������ �Է�");
//		System.out.print("�й� ? ");
//		System.out.print("�̸� ? ");
//		System.out.print("���� ? ");
//		System.out.print("���� ? ");
//		System.out.print("���� ? ");
//		System.out.println("�����Ͱ� �ԷµǾ����ϴ�.");
//
//		// 2. ���
//		// 1111 aaaa 80 80 80 240 80 1
//		// 3.0 3.0 3.0 9.0 3.0
//		// 2222 bbbb 70 70 70 210 70 2
//		// 2.0 2.0 2.0 6.0 2.0
//
//		// 3. �˻�
//		System.out.print("�̸� ? "); // aaaa �˻�
//		// 1111 aaaa 80 80 80 240 80 1
//		// 3.0 3.0 3.0 9.0 3.0

	}
}
