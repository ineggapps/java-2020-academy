package d200207;

import java.util.Scanner;

public class ArrayQuiz4 {
	public static void main(String[] args) {
		// �޷� �����
		Scanner sc = new Scanner(System.in);
		int y, m, d;
		int month[] = new int[] { 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String week[] = new String[] { "��", "��", "ȭ", "��", "��", "��", "��" };
		int tot;//���ϰ��� �ϴ� ���� ���������� ������� ���ϱ�
		int startDay;
		
		do {
			System.out.print("���� > ");
			y = sc.nextInt();
		} while (y < 1);

		do {
			System.out.print("�� > ");
			m = sc.nextInt();
		} while (m < 1 || m > 12);

		// ������ �ϴ� ������ �������� ���ϱ� (2��)
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
			month[1]=29;//�����̸� 2���� 1���� �� �߰��Ѵ�.
		}else {
			month[1]=28;
		}
		
//		�޷��� �������� ���ϸ� �ȴ�.
//		do {
//			System.out.print("�� > ");
//			d = sc.nextInt();
//		} while (d < 1 || d > month[d - 1]);

		//�޷� �׸���
		//�޷��� �׸��� ���ؼ��� �� �������� ������ ����ؾ� �Ѵ�.
		//���ϰ��� �ϴ� ���⵵�� ���� ���ϱ����� ��¥ �� ī��Ʈ
		//���⵵*365�� + (1*���⵵���� �����̾��� ������ ����)
		tot = (y-1)*365 + ((y-1)/4 - (y-1)/100 + (y-1)/400);
		//���ϰ��� �ϴ� ������ ���� ���������� ��¥ �� ī��Ʈ�ϱ�
		for(int i=0;i<m-1;i++) {
			tot+=month[i];
		}
		tot++; //���� ���� 1���� ī��Ʈ
		startDay = tot%7;//�����ϴ� ���� ��
		System.out.println(month[m-1]+"(����)���� ����");
		System.out.println(tot+"�������� " + tot%7 +" " + week[tot%7]);
		System.out.printf("%d�� %d��\n",y,m);
		for(String i: week) {
			System.out.printf("%s\t\t",i);
		}
		System.out.println("\n==========================================");
		//�޷��� 7�� ������ �ٹٲ��� �ϴϱ� 7�� literal������ ����Ұ�!
		int day=1;
		/*
		#1. ��1��  
		int cursor=0;
		while(day<=month[m-1]) {
			cursor++;
			if(cursor<7 && cursor%7<=startDay) {
				System.out.print("*\t\t");
			}else {
				System.out.printf("%d\t\t",day);
				day++;
			}
			if(cursor%7==0) {
				System.out.println();
			}
		}*/
		
		//���� ù ���� ������ �ʿ��ϹǷ� ������ ���� ����Ѵ�
//		System.out.println("������:"+startDay);
		//#2. ��2��
		//2020�� 2���� ���� ��� 2�� 1���� ������̴�.
		//�Ͽ�ȭ����ݿ��Ͽ��� ������ ���� �Ѵ�.
		for(int i=0;i<startDay;i++) {
			System.out.print("*\t\t");
		}
		//2020�� 2���� ���� ��� 2���� 29�ϱ��� �ִ�.
		//������ ��� ���������� ������ ���������� ������ �ȴ�.
		//��, ������ ������� ��쿡�� �ٹٲ��� ���� �ʵ��� ó���Ѵ�.
		for (int i=1;i<=month[m-1];i++) {
			System.out.printf("%d\t\t",day++);
			if((startDay+i)%7==0 && i<month[m-1]) {
				//7�� ���� ������ �����ٷ�, ���������� ���� ����.
				System.out.println();
			}
		}
		
		System.out.println("\n==========================================");
		sc.close();
	}
}
