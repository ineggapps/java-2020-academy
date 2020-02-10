package d200210;

import java.util.Scanner;

public class ScoreEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt;
		String[] name;
		int[] score;
		int[] rank;

		do {
			System.out.print("�ο� ��[1~50]?");
			cnt = sc.nextInt();
		} while (cnt < 1 || cnt > 50);

		// �ο�����ŭ �迭 �޸𸮸� �Ҵ��Ѵ�.
		name = new String[cnt];
		score = new int[cnt];
		rank = new int[cnt];

		// �ο�����ŭ �̸��� ������ �Է¹޴´�.
		for (int i = 0; i < cnt; i++) {
			System.out.print((i + 1) + "��° �̸� ? ");
			name[i] = sc.next();
			System.out.print("����? ");
			score[i] = sc.nextInt();
		}

//		�Է� ��� ����� ������
//		cnt = 5;
//		name = new String[] { "a", "b", "c", "d", "e" };
//		score = new int[] { 90, 80, 90, 100, 70 };
//		rank = new int[cnt];
		
		// ���� �ʱ�ȭ�ϱ�
		for (int i = 0; i < cnt; i++) {
			rank[i] = 1;
		}

		// ���� ����ϱ�
		for (int i = 0; i < cnt - 1; i++) {
			for (int j = i + 1; j < cnt; j++) {
				/*
				 1. ũ��
				 2. �۴�
				 3. ����
				 */
				if (score[i] > score[j]) {
					rank[j]++;
				} else if (score[i] < score[j]) {
					rank[i]++;
				}
			}
		}

		// ���
		System.out.println("�̸�\t����\t����");
		for (int i = 0; i < cnt; i++) {
			System.out.println(name[i] + "\t" + score[i] + "\t" + rank[i]);
		}

		sc.close();
	}
}
