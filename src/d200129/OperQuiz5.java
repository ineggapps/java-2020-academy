package d200129;

import java.util.Scanner;
/*
 * ����Ÿ��� �ü��� �Է� �޾� ����ð��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
 * [ó������]
 * - ���� �Ÿ��� �ü��� �Է��� Scanner Ŭ������ nextInt() �޼��带 �̿��Ѵ�.
 * - ���� �Ÿ��� ������ km�̸�, �ü��� km/h�̴�.
 * - ����ð��� ��, ��, ��, ������ ����ϸ� �ʴ� �Ҽ��� �� ° �ڸ����� �ݿø��Ͽ� �Ҽ� �� ° �ڱ��� ����Ѵ�.
 * */
public class OperQuiz5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int distance, velocity;
		double time;
		System.out.print("���� �Ÿ�(km) ? ");
		distance = sc.nextInt();
		System.out.print("�ü�(km/h) ? ");
		velocity = sc.nextInt();

		// ��� �κ� (�Ÿ�/�ӵ�=�ð�)
		time = (double) distance / velocity * 3600;

		System.out.printf("%d km => %d�ð� %d�� %.2f�� �ҿ�", distance, (int) time / 3600, (int) (time / 60) % 60, time % 60);
		sc.close();
	}
}
