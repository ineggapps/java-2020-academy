package d200203;

import java.util.Scanner;

public class IfQuiz7 {
	// �̸��� �� ���� ������ �Է� �޾� �հ� ���θ� �Ǵ��ϴ� ���α׷�
	// �� ���� ������ ��� 40�� �̻��̰� ����� 60�� �̻��̸� �հ�
	// ����� 60�� �̻������� �� �����̶� 40�� �̸��̸� ����
	// �׷��� ������ ���հ�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int sub1, sub2, sub3;
		double avg;

		System.out.print("�̸� �Է�: ");
		name = sc.next();

		System.out.print("�� ���� ���� �Է�: ");
		sub1 = sc.nextInt();
		sub2 = sc.nextInt();
		sub3 = sc.nextInt();
		avg = (sub1 + sub2 + sub3) / 3;

//		if (avg > 60) {
//			if (sub1 > 40 && sub2 > 40 && sub3 > 40) {
//				System.out.printf("%s���� �հ��Դϴ�.\n", name);
//			} else {
//				System.out.printf("%s���� �����Դϴ�.\n", name);
//			}
//		} else {
//			System.out.printf("%s���� ���հ��Դϴ�.\n", name);
//		}

		if (sub1 > 40 && sub2 > 40 && sub3 > 40 && avg>=60) {
				System.out.printf("%s���� �հ��Դϴ�.",name);
		}
		else if(avg<60) {
			System.out.printf("%s���� ���հ��Դϴ�.",name);			
		}
		else {
			//else�� �ɸ��� ����: (sub1 < 40 && sub2 < 40 && sub3 < 40) && avg>=60
			System.out.printf("%s���� �����Դϴ�.\n",name);
		}

		sc.close();

	}
}
