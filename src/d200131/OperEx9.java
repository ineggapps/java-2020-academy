package d200131;

import java.util.Scanner;

public class OperEx9 {
	/*
	 * ������ �Է� �޾� ������� �������� �������� �Ǻ� ����?10 10: ���
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		String result;
		System.out.print("���� �Է�: ");
		num = sc.nextInt();

		/*
		 * ����� �� 1. 0�� �� 2. ����� �� 3. ������ ��
		 */
//		result = num==0? "0": num>0?"���":"����";
		result = num > 0 ? "���" : num < 0 ? "����" : "0";
		System.out.printf("%d�� %s�Դϴ�.", num, result);
		sc.close();
	}
}
