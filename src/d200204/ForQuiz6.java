package d200204;

import java.util.Scanner;

public class ForQuiz6 {
	public static void main(String[] args) {
		// 10���� ������ �Է� ���� ���� �� ���� ���� ���� ����ϴ� ���α׷� �ۼ��ϱ�
		Scanner sc = new Scanner(System.in);
		int min =Integer.MAX_VALUE, n;
		System.out.println("(�ּڰ� ���ϱ�) 10���� ���� �Է�");
		for (int i = 1; i <= 10; i++) {
			n = sc.nextInt();
			if (min> n) {
				min= n;
			}
		}
		System.out.println("�ּڰ�: "+ min);
		sc.close();
	}
}
