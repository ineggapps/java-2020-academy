package d200205;

import java.util.Scanner;

public class ForQuizHard1Answer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		// diff: �ݺ��ϸ鼭 ���ϴ� �ڿ��� 7���� �Ÿ�(���)
		// min: �ݺ��ϸ鼭 ������ 7���� �Ÿ��� �ּڰ�
		// result: �ݺ��ϸ鼭 ������ 7���� �Ÿ��� �ּڰ��� ����� ����
		int diff, min = 0, result = 0;
		System.out.println("5���� ���� �Է� ");
		for (int i = 0; i < 5; i++) {
			n = sc.nextInt();
			// ���ʿ� �Է¹��� �� ������ ���� �ʵ��� ���� ���� �ֱ���.
			diff = n > 7 ? n - 7 : 7 - n;
			if (i == 0 || min > diff) {// �� ó���Է� ���� ���
				min = diff;
				result = n;
			}
		}
		System.out.println("���� ����� ��: " + result);
		sc.close();
	}
}
