package d200129;

import java.util.Scanner;
/* �ݾ��� �Է� �޾�, �Է� ���� �ݾ��� 50000�� �ǿ��� 1���� ������ ȭ��ż��� ����ϴ� ���α׷��� �����ڸ� �̿��Ͽ� �ۼ��Ͻÿ�.
 * [ó������]
 * �ݾ��� �Է��� Scanner Ŭ������ nextInt() �޼��带 �̿��Ѵ�.
 * �ݾ��� 70000���� ��� ȭ���� �ż��� 50000�� �� 1��, 10000�� �� 2��ó�� ū ���� �ݾ׺��� ����ϰ� �������� ���� ���� ȭ�󿡼� ����Ѵ�.
 * */
public class OperQuiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money, b50000, b10000, b5000, b1000, b500, b100, b50, b10, b5, b1;
		System.out.print("�ݾ� ? ");
		money = sc.nextInt();

		// ��������
		b50000 = money / 50000;
		money = money - (b50000 * 50000);

		// ������
		b10000 = money / 10000;
		money = money - (b10000 * 10000);

		// ��õ����
		b5000 = money / 5000;
		money = money - (b5000 * 5000);

		// õ����
		b1000 = money / 1000;
		money = money - (b1000 * 1000);

		// �������
		b500 = money / 500;
		money = money - (b500 * 500);

		// �����
		b100 = money / 100;
		money = money - (b100 * 100);

		// ���ʿ���
		b50 = money / 50;
		money = money - (b50 * 50);

		// �ʿ���
		b10 = money / 10;
		money = money - (b10 * 10);

		// ������
		b5 = money / 5;
		money = money - (b5 * 5);

		// �Ͽ���
		b1 = money;

		System.out.printf("��������: %d\n", b50000);
		System.out.printf("������: %d\n", b10000);
		System.out.printf("��õ����: %d\n", b5000);
		System.out.printf("õ����: %d\n", b1000);
		System.out.printf("�������: %d\n", b500);
		System.out.printf("�����: %d\n", b100);
		System.out.printf("���ʿ���: %d\n", b50);
		System.out.printf("�ʿ���: %d\n", b10);
		System.out.printf("������: %d\n", b5);
		System.out.printf("�Ͽ���: %d\n", b1);
		
		sc.close();
	}
}
