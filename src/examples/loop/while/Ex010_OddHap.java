import java.util.Scanner;

public class Ex010_OddHap {
	public static void main(String[] args) {
/*
		������ �Է� �޾� 1���� �Է� ���� �������� Ȧ�� ��
*/
		Scanner sc=new Scanner(System.in);
		
		int num;
		int s, n;
		
		System.out.print("���� ? ");
		num=sc.nextInt();
		
		s=0;
		n=1;
		while(n<=num) {
			s+=n;
			n+=2;
		}
		System.out.println("��� : "+s);
		
		sc.close();
	}
}
