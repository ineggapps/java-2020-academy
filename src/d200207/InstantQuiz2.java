package d200207;

import java.util.Scanner;

public class InstantQuiz2 {
	public static void main(String[] args) {
		/*
		 * �̸��� �޿��� �Է� �޾� ������ ����ϴ� ���α׷� ������ �޿��� 300���� �̻��̸� 3.3% ������ �޿��� 200���� �̻��̸� 2.2%
		 * ��Ÿ �޿��� 0�� ��, ������ �����ڸ����� �ݿø��Ѵ�. ���� ��� ������ 3057�̸� 3060�̴�.
		 * 
		 * <���> �̸� �޿� ���� �Ǽ��ɾ�
		 */

		Scanner sc = new Scanner(System.in);
		String name;
		int salary, tax, income;
		// �޿��� 0���� ���� ��� ����
		do {
			System.out.print("�̸� �Է� > ");
			name = sc.next();
			System.out.print("�޿� �Է� > ");
			salary = sc.nextInt();

			tax = salary > 3000000 ? (int) (salary * 0.033) : (int) (salary * 0.022);
			System.out.println("�ݿø� ��:" + tax);
			// 1���ڸ����� �ݿø��ϱ�
			if (tax % 10 >= 5) {
				tax += 10;
			}
			tax -= (tax % 10);
			System.out.println("�ݿø� ��:" + tax);

			income = salary - tax;

			System.out.print("�̸�\t\t\t�޿�\t\t\t����\t\t\t�Ǽ��ɾ�\n");
			System.out.printf("%s\t\t%d\t\t%d\t\t%d\n", name, salary, tax, income);
		} while (salary > 0);

		sc.close();
	}
}
