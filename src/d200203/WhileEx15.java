package d200203;

import java.util.Scanner;

public class WhileEx15 {
	public static void main(String[] args) {
		//������ �Է� �޾� 1���� �Է� ���� ������ �� ���ϱ�
		//����
		Scanner sc = new Scanner(System.in);
		int num;
		int n=0,s=0;
		
		//�Է�
		System.out.print("���� �Է�: ");
		num = sc.nextInt();
		
		//����
		while(n<num) {
			n++;
			System.out.printf("%d+%d=%d%n",s,n,s+n);
			s+=n;
		}
		
		//���
		System.out.printf("1���� %d������ ���� %d�Դϴ�.",num,s);
		sc.close();
	}
}
