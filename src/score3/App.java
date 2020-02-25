package score3;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Score ss = new ScoreImpl();
		int ch;
		try {
			while (true) {
				do {
					System.out.print("1.�Է� 2.��� 3.�й��˻� 4.�̸��˻� 5.���� 6.���� 7.������ 8.���� > ");
					ch = sc.nextInt();
				} while (ch < 1 || ch > 8);
				if (ch == 8) {// ����
					break;
				}
				switch (ch) {
				case 1:// 1. �Է�
					ss.input();
					break;
				case 2:// 2. ���
					ss.print();
					break;
				case 3:// 3. �й� �˻�
					ss.findByHak();
					break;
				case 4:// 4. �̸� ����
					ss.findByName();
					break;
				case 5:// 5. ����
					ss.update();
					break;
				case 6:// 6. ����
					ss.remove();
					break;
				case 7: //7. ������ ���
					ss.toDescPrint();
					break;
				}
			}
		} finally {
			System.out.println("����");
			sc.close();
		}
	}
}
