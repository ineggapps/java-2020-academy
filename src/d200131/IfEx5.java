package d200131;

import java.util.Scanner;

public class IfEx5 {
	public static void main(String[] args) {
		// �� ���� �Է� �޾� ���� ������ ū �� ������ ����ϱ�.
		Scanner sc = new Scanner(System.in);
		int a, b, c, t;

		// �Ȱ��� ������ �� �� 1,2,3�� �Է¹޾ƿ��� ������ �� 6����(3!)�̴�.
		System.out.print("���� 3�� �Է� ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		// ���� ���� ���� a�濡 �ִ� ������� ����
		
		//a��b�� ũ�⸦ ���Ͽ� a, b ������� �Է�
		if (a > b) {
			t = a;
			a = b;
			b = t;
		}
		
		//a�� c�� ũ�⸦ ��. �̹� ������ b�� a���� ū ���� ������ �Ǿ� ����.
		if (a > c) {
			t = a;
			a = c;
			c = t;
		}
		
		//������ ������ ������ ��� �Ϸ��ϸ� a�� �������� a,b,c �� ���� ���� ���� ����.

		//b�� c�� ũ�⸦ ��.
		if(b>c) {
			t=b;
			b=c;
			c=t
					;
		}
		
		System.out.format("%d, %d, %d", a, b, c);
		sc.close();
	}
}
