package d200204;

import java.util.Scanner;

public class WhileQuizBasic1 {
	/*
	 * ������ �Է� �޾� 1���� �Է� ���� �������� ��, ¦���� ��, Ȧ���� ���� ���ϴ� ���α׷� �ۼ��ϱ�
	 * While���� �̿��Ͽ� �ۼ�.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int n = 0, odd = 0, even = 0, sum = 0;
		System.out.print("�� ? ");
		num = sc.nextInt();
		while (n < num) {
			n++;
			sum += n;
//			if (n % 2 == 0) {
			if ((n & 1) == 0) {
				//¦�� ����
				even += n;
			} else {
				// Ȧ�� ����
				odd += n;
			}
		}
		System.out.printf("1~%d������ �� = %d\n", num, sum);
		System.out.printf("1~%d���� ¦���� �� = %d\n", num, even);
		System.out.printf("1~%d���� Ȧ���� �� = %d\n", num, odd);
		sc.close();
	}
}
