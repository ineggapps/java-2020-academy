package d200204;

import java.util.Scanner;

public class WhileQuizHard3B {
	// �� ������ �Է� �޾� �Է� ���� ������ �ִ����� �� �ּҰ������ ���ϴ� ���α׷�
	// while���� �̿��Ͽ� �ۼ�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2,tmp;
		int r1, r2=1; //������ �˻�
 		int gcd=0,lcm=0;

		// �Է�
		System.out.print("�� �� ? ");
//		num1 = sc.nextInt();//32
//		num2 = sc.nextInt();//72
		num1=1071;
		num2=1029;
		
		//���� ���Ǹ� ���� �������� ����
		//��� �Ǻ� (num1<num2)�� ����
		if(num1>num2) {
			tmp = num1;
			num1=num2;
			num2=tmp;
		}
		
		//�ִ����� ����
		//TODO: (���ذ�)
		/*
			���2: �� ���� a,b�� ���ؼ� a>b�� ��� a=a-b��, a<b�� ��� b=b-a�� a==b�� �� ������ �ݺ��ϸ� �� ���� �ִ������� �ȴ�.
		*/
		//���
		System.out.printf("GCD(�ִ�����): %d%n", gcd);
		System.out.printf("LCM(�ּҰ����): %d%n", lcm);

		sc.close();

	}
}