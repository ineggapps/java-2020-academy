package d200203;

import java.util.Scanner;

public class WhileEx17 {
	public static void main(String[] args) {
		//������ �Է� �޾� 1���� �Է� ���� �������� Ȧ���� ����ϰ� Ȧ���� ���� ���ϱ�
		//��, �� �ٿ� Ȧ���� 5���� ��´�.
		//����
		Scanner sc = new Scanner(System.in);
		int num;
		int n=1,s=0,cnt=0;
		
		//�Է�
		System.out.print("���� �Է�: ");
		num = sc.nextInt();
		
		while(n<=num) {
			System.out.printf("%d\t",n);
			//����
			s+=n;
			n+=2;
			//�߰� ����� ���� �ٹٲ�
			//�� �ٿ� 5���� �Է¹ް� �ٹٲ����ִ� �ڵ�
			cnt++;
			if(cnt%5==0) {
				System.out.println();
			}
//			if(cnt==5) {
//				System.out.println();
//				cnt=0;
//			}
		}
		//���
		if(cnt%5!=0) {
			System.out.println();
		}
		System.out.print("Ȧ���� ��: "+s);
		sc.close();
	}
}
