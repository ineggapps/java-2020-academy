package d200204;

import java.util.Scanner;

public class ForQuiz5Advanced {
	public static void main(String[] args) {
		// 10���� ������ �Է� ���� ���� �� ���� ū ���� ����ϴ� ���α׷� �ۼ��ϱ�
		Scanner sc = new Scanner(System.in);
		int max = Integer.MIN_VALUE, n;
		System.out.println("(�ִ� ���ϱ�) 10���� ���� �Է�");
		for (int i = 1; i <= 10; i++) {
			n = sc.nextInt();
			// ù ��° ������ ���� �ִ��� �����س��� ���ϱ�
			if (max < n) {
				max = n;
			}
		}
		System.out.println("�ִ�: " + max);
		sc.close();
	}
}
