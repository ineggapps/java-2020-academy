package d200129;

import java.util.Scanner;
/*
 * �����µ��� �Է� �޾� ȭ�� �µ��� ��ȯ�ϴ� ���α׷��� �ۼ��Ͻÿ�
 * [ó������]
 * - ���� �µ��� �Է��� Scanner Ŭ������ nextInt() �޼��带 �̿��Ѵ�
 * - ȭ�� �µ��� double ������ ó���Ѵ�.
 * - ȭ�� �µ��� �Ҽ��� �� ° �ڸ����� �ݿø��Ͽ� ù ° �ڸ����� ����Ѵ�.
 * [��������]
 * - ���� �µ� �� ȭ�� �µ��� ��ȯ
 * - ȭ�� �µ� = ���� �µ� * 1.8 + 32
 * - ���� �µ� = (ȭ�� �µ� - 32) / 1.8
 * */
public class OperQuiz4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double celsius, fahrenheit;
		System.out.printf("���� �µ� ? ");
		celsius = sc.nextInt();
		
		fahrenheit = celsius * 1.8 + 32;
		System.out.printf("ȭ�� �µ� %.1f",fahrenheit);
		sc.close();
	}
}
