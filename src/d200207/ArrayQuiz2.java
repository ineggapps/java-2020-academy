package d200207;

import java.util.Scanner;

public class ArrayQuiz2 {
	public static void main(String[] args) {
		// 5���� ����(0~10)�� �Է� �޾� �ִ� ������ �ּ� ������ �� ���� ���ϴ� ���α׷� �ۼ��ϱ�
		Scanner sc = new Scanner(System.in);
		int scores[] = new int[5];
		int sum = 0;
		int max = 0, min = 0;

		for (int i = 0; i < scores.length; i++) {
			do {
				System.out.printf("%d��° ����: ", i + 1);
				scores[i] = sc.nextInt();
			} while (scores[i] < 0 || scores[i] > 10);
			sum+=scores[i];
			if (i == 0) {
				max = scores[i];
				min = scores[i];
			} else {
				if (max < scores[i]) {
					max = scores[i];
				} else if (min > scores[i]) {
					min = scores[i];
				}
			}
		}

		System.out.print("���� ����Ʈ: ");
		for( int s: scores) {
			System.out.printf("%d\t",s);
		}
		System.out.println();
		System.out.printf("��� ����: %d",sum-max-min
				);
		sc.close();
	}
}
