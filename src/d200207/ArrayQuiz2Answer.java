package d200207;

import java.util.Scanner;

public class ArrayQuiz2Answer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		int max, min, tot;

		tot = max = min = 0;
		// �Է� �� ��ü ������ ��
		for (int i = 0; i < 5; i++) {
			do {
				System.out.print((i + 1) + "��° ����: ");
				score[i] = sc.nextInt();
			} while (score[i] < 0 || score[i] > 10);
			tot += score[i];
		}

		// �ִ�, �ּڰ�, ������� ���ϱ�
		max = min = score[0];
		for (int i = 1; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
			} else if (min > score[i]) {
				min = score[i];
			}
		}
		
		System.out.print("���� ����Ʈ: ");
		for(int s:score) {
			System.out.print(s+"\t");
		}
		System.out.printf("\n�������: %d",tot-max-min);
		sc.close();
	}
}
