package d200204;

import java.util.Scanner;

public class ForQuiz7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, tmp;
		int sum = 0, avg = 0, cnt = 0;
		// �Է�
		System.out.print("�� ���� ? ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		System.out.printf("%d %d�� �Է�%n",num1,num2);
		// ���� num1<num2 �� �ǵ���
		if (num1 > num2) {
			tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		System.out.printf("%d %d�� ����%n",num1,num2);

		// ����
		//�Է� ���� �� ���� ������ ���� �� ������ �����ؾ� ��. ���� ���ǽ��� �ε�ȣ�� <�� �ƴ϶� <=�� �Ǿ�� ��.
		for (int i = num1; i <= num2; i++) {
			//3�� ����̰ų� 5�� ����� ������ �հ� ��ո� ���ϱ�
			if(i%3==0 || i%5==0) {				
				sum += i;
				cnt++;
			}
		}
		avg = sum / cnt;
		System.out.println("��: " + sum);
		System.out.println("���: " + avg);
		sc.close();
	}
}
