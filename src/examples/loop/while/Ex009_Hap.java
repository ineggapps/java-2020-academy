import java.util.Scanner;

public class Ex009_Hap {
	public static void main(String[] args) {
/*
		������ �Է� �޾� 1���� �Է� ���� �������� ��
*/
		Scanner sc=new Scanner(System.in);
		
		int num;
		int s, n;
		
		System.out.print("���� ? ");
		num=sc.nextInt();
		
		s=n=0;
		while(n<num) {
			n++;
			s+=n;
		}
		System.out.println("��� : "+s);
		
		sc.close();
	}
}
