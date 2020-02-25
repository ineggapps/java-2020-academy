package score4;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;

		Score ss = new ScoreImpl();

		try {
			while (true) {
				do {
					System.out.print("1.�Է� 2.���� 3.���� 4.��� 5.�й��˻� 6.�̸��˻� 7.���� > ");
					ch = sc.nextInt();
				} while (ch < 1 || ch > 7);
				if (ch == 7) {
					break;
				}

				switch (ch) {
				case 1:// �Է�
					ss.input();
					break;
				case 2:// ����
					ss.update();
					break;
				case 3:// ����
					ss.delete();
					break;
				case 4:// ���
					ss.print();
					break;
				case 5:// �й� �˻�
					ss.findByHak();
					break;
				case 6:// �̸� �˻�
					ss.findByName();
					break;
				}
			}
		} finally {
			sc.close();
		}

	}
}
