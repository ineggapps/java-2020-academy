package d200129;

import java.util.Scanner;
/*
 * �� ������ �Է� �޾� ��Ģ ������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�
 * [ó�� ����]
 * - ������ �Է��� Scanner Ŭ������ nextInt() �޼��带 �̿��Ѵ�.
 * - �������� ����� ������ ó���Ѵ�.
 * - ����� System.out.printf() �޼��带 �̿��Ѵ�.
 * */
public class OperQuiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		System.out.print("�� ���� ? ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.printf("%d + %d = %d\t",a,b,a+b);
		System.out.printf("%d - %d = %d\n",a,b,a-b);
		System.out.printf("%d * %d = %d\t",a,b,a*b);
		System.out.printf("%d / %d = %d\n",a,b,a/b);
		
		sc.close();
	}
}
