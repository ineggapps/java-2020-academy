package member;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member mb = new MemberImpl();
		int ch;
		try {
			while (true) {
				do {
					System.out.print("1.�Է� 2.��� 3.���� 4.Ż�� 5.�̸��ϰ˻� 6.�̸��˻� 7.����");
					ch = sc.nextInt();
				} while (ch < 1 || ch > 7);
				if (ch == 7) {
					break;
				}
				switch (ch) {
				case 1:// �Է�
					mb.input();
					break;
				case 2:// ���
					mb.print();
					break;
				case 3:// ����
					mb.update();
					break;
				case 4:// Ż��
					mb.delete();
					break;
				case 5:// �̸��ϰ˻�
					mb.findByEmail();
					break;
				case 6:// �̸��˻�
					mb.findByName();
					break;
				}
			}
		} finally {
			sc.close();
		}
	}
}
