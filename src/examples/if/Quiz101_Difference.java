import java.util.Scanner;

public class Quiz101_Difference {
	public static void main(String[] args) {
/*
		�������� �Է� �޾� ū������ ���������� ���̸� ���ϴ� ���α׷�

		d=n1-n2�� ���� d�� ���밪�� ����ص� ����
*/
		Scanner sc=new Scanner(System.in);
		int n1, n2, d;
		
		System.out.print("ù��°�� ? ");
		n1=sc.nextInt();
		
		System.out.print("�ι�°�� ? ");
		n2=sc.nextInt();
		
		if(n1>n2) {
			d=n1-n2;
		} else {
			d=n2-n1;
		}
		
		System.out.println("�μ��� ���� : " + d);
		
		sc.close();
	}
}
