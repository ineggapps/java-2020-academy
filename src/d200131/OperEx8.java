package d200131;

import java.util.Scanner;

public class OperEx8 {
	/*
	 * ������ �Է¹޾� �������� ��������� �Ǻ��ϱ� ex: 2020? ����
	 * 
	 * 2�� 29��(366��)�̸� �����̰� �׷��� ������ ���(365��) 
	 * ������ 4�� ����̰� 100�� ����� �ƴϰų� 400�� ����̸� �����̰�
	 * �׷��� ������ ����̴�.
	 * 
	 * cf) ���� 1�� 1�� 1���� �������̴�.
	 * ������ ��Ģ�� ���� �ѱ��� �߱��� �ٸ���
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		String result;
		System.out.print("���� �Է�: ");
		year = sc.nextInt();
		
		//������ 4�� ����̰� 100�� ����� �ƴϰų� 400�� ����̸� ����
		result = year%4==0 && year%100!=0 || year % 400==0 ? "����":"���";
		System.out.printf("%d���� %s�Դϴ�.",year,result);
		
		sc.close();
	}
}
