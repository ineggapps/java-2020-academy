package d200205;

import java.util.Scanner;

public class ForQuizHard1 {
	//5���� ������ �Է� �޾� �Է� ���� ���� �� 7�� ���� ����� ���� ����ϴ� ���α׷��� �ۼ�
	/*
	 * 1. 5���� ������ for���� �̿��Ͽ� �Է� �޴´�
	 * ���� 6�� 8ó�� ���̰� ���� ���� ��� ���� �Է��� ���� ����Ѵ�
	 * ������ �Է��� Scanner Ŭ������ nextInt()�޼��带 �̿��Ѵ�.
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, num7 = 0;// �Է� ��, �Է� ������ 7 ����
		int best = 0, best7 = 0;// ���� ����� ��, ���� ����� ������ 7 ��
		System.out.println("5���� ���ڸ� �Է��ϼ���... ");
		for (int i = 0; i < 5; i++) {
			num = sc.nextInt();
			num7 = num - 7;
			num7 = num7 > 0 ? num7 : -num7; // �������� ����
			if (best7 > num7 || i==0) {
				best = num;
				best7 = num - 7;
				best7 = best7 > 0 ? best7 : -best7;
			}
		}
		System.out.println("7�� ���� ����� ��: " + best);
		sc.close();
	}
}
