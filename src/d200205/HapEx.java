package d200205;

import java.util.Scanner;

public class HapEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, s;
		int ch;
		int start, offset;
		while (true) {
			do {
				System.out.print("1. ��, 2.Ȧ���� ��, 3.¦���� ��, 4.���� => ");
				ch = sc.nextInt();
			} while (ch < 1 || ch > 4);
			if (ch == 4)
				break;

			System.out.print("���ϴ� ��: ");
			num = sc.nextInt();

			// ���� �ʱ�ȭ
			switch (ch) {
			case 1:// �ڿ����� ��
				start = 1;offset = 1;break;
			case 2:// Ȧ���� ��
				start = 1;offset = 2;break;
			default:// ¦���� ��
				start = 2;offset = 2;break;
			}

			s = 0;
			for (int i = start; i <= num; i += offset) {
				s += i;
			}

			System.out.println("���: " + s);
		}
		sc.close();
	}
}
