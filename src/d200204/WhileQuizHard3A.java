package d200204;

import java.util.Scanner;

public class WhileQuizHard3A {
	// �� ������ �Է� �޾� �Է� ���� ������ �ִ����� �� �ּҰ������ ���ϴ� ���α׷�
	// while���� �̿��Ͽ� �ۼ�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2,tmp;
		int r1, r2=1; //������ �˻�
 		int gcd=0,lcm=0;

		// �Է�
		System.out.print("�� �� ? ");
		num1 = sc.nextInt();//32
		num2 = sc.nextInt();//72
		
		//��� �Ǻ� (num1<num2)�� ����
		if(num1>num2) {
			tmp = num1;
			num1=num2;
			num2=tmp;
		}
		
		//�ִ����� ����
		r1=num1%num2;
		r2=num2%r1;
		while(r2!=0) {
			tmp=r1;
			r1=r2;
			r2=tmp%r1;
		}
		gcd=r1;
		lcm=num1*num2/gcd;
		
		//���
		System.out.printf("GCD(�ִ�����): %d%n", gcd);
		System.out.printf("LCM(�ּҰ����): %d%n", lcm);

		sc.close();

	}
}
