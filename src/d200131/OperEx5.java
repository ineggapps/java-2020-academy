package d200131;

import java.util.Scanner;

public class OperEx5 {
	public static void main(String[] args) {
//		int a = 10, b = 5;
//		int c;
//		c = a > b ? a : b;
//		System.out.println("ū ��: " + c);
		
		//������ �Է� �޾� ���� ���ϱ�
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		System.out.print("����? ");
		a=sc.nextInt();
		
		//���� ���ϱ�
		b=a>0?a:-a;
		System.out.println(a+"�� ������ " +b);
		
		sc.close();
	}
}
