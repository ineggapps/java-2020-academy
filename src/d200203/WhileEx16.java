package d200203;

import java.util.Scanner;

public class WhileEx16 {
	public static void main(String[] args) {
		//������ �Է� �޾� 1���� �Է� ���� �������� Ȧ���� �� ���ϱ�
		//����
		Scanner sc = new Scanner(System.in);
		int num;
		int n=1,s=0;
		
		//�Է�
		System.out.print("���� �Է�: ");
		num = sc.nextInt();
		
		//����
		while(n<=num) {//�� �ε�ȣ <= // �Է� ���� ���� Ȧ���̸� Ȧ������ ���ؾ� �ϴµ�?
			System.out.printf("%d+%d=%d%n",s,n,s+n);
			s+=n;
			n+=2;
		}
		
		//���
		System.out.print("���: "+s);
		sc.close();
	}
}
