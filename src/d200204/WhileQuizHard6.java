package d200204;

import java.util.Scanner;

public class WhileQuizHard6 {
	public static void main(String[] args) {
		// 1~100������ ������ �߻����� �� ���� ���ߴ��� ����ϴ� ���α׷� �ۼ��ϱ�
		Scanner sc = new Scanner(System.in);
		int number = (int) (Math.random() * 100) + 1;
		int input, cnt = 0;

		while (true) {
			cnt++;
			System.out.print("��? ");
			input = sc.nextInt();
			if (number == input) {
				break;
			} else if (number > input) {
				System.out.println("�Է��� �����ٴ� ū �� �Դϴ�.");
			} else {
				System.out.println("�Է��� �����ٴ� ���� ���Դϴ�.");
			}
		}

		System.out.printf("%d�� ���� �����߽��ϴ�.", cnt);
		sc.close();
	}
}
