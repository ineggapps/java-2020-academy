package d200207;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz3 {
	public static void main(String[] args) {
		//�ζ��� ���� ������ �Է� �޾� ���� ������ŭ�� �ζǸ� ����ϴ� ���α׷� �����
		Scanner sc = new Scanner(System.in);
		int num[] = new int[6];
		int amount;

		// �Է�
		do {
			System.out.print("���� ����[1~5] ? ");
			amount = sc.nextInt();
		} while (amount < 1 || amount > 5);

		for (int i = 0; i < amount; i++) {

			// �����ϰ� ����
			for (int j = 0; j < num.length; j++) {
				num[j] = (int) (Math.random() * 45) + 1;
				for(int k=0;k<j;k++) {
					if(num[j]==num[k]) {
						j--;//Ƚ�� �����ϰ� �ٽ� ������ ������
						break;
					}
				}
			}
			// �����ϱ�
			Arrays.sort(num);

			// ����ϱ�
			System.out.printf("%d��°: ", i + 1);
			for (int j = 0; j < num.length; j++) {
				System.out.printf("%d\t\t", num[j]);
			}
			System.out.println();
		}

		sc.close();

	}
}

