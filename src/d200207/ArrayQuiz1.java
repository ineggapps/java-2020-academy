package d200207;

import java.util.Scanner;

public class ArrayQuiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y;
		String band[] = { "������", "��", "��", "����", "��", "��", "��", "�䳢", "��", "��", "��", "��" };

		/*
		 * ������ �Է¹޾� �Է� ���� ������ �츦 ���ϴ� ���α׷��� �ۼ��Ѵ�.
		 * ��� ��, ��, ��, �䳢, ��, ��, ��, ��, ������, ��, ��, ���� ������ ����ȴ�. 
		 * 2016���� �����̶��̴�. (2016%12==0)
		 * �����ϴ� ���� �����ʹ� ���� �ٸ���
		 * ������ �������� ���� 0�� ���� ����� �����ϸ� �ȴ�.
		 * ���� �迭�� �ʱ갪�� "������"���� �����ϸ� �ȴ�.
		 */

		// �Է�
		do {
			System.out.print("���� ? ");
			y = sc.nextInt();
		} while (y < 1900);

		System.out.printf("%d�⵵�� %s���� ���Դϴ�.", y, band[y % band.length]);

		sc.close();
	}
}
