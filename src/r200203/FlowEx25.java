package r200203;

import java.util.Scanner;

public class FlowEx25 {
	public static void main(String[] args) {
		int num=0,sum=0;
		System.out.print("���ڸ� �Է��ϼ���. (��:12345)> ");
		
		Scanner sc = new Scanner(System.in);
		num= sc.nextInt();
		
		while(num!=0) {
			//num�� 10���� ���� �������� sum�� ���Ѵ�
			sum+=num%10;
			System.out.printf("sum=%3d num=%d%n",sum,num);
			num/=10;
		}
		System.out.println("�� �ڸ����� ��: "+sum);
		sc.close();
	}
}
