import java.util.Scanner;

public class Quiz101_Hap {
	public static void main(String[] args) {
/*		
		������ �Է� �޾� �Է� ���� ������ �ձ��ϱ�
*/		
		Scanner sc=new Scanner(System.in);
		int s, n;
		
		do {
			System.out.print("�� ? ");
			n=sc.nextInt();
		} while(n<1||n>1000);
		
		s=0;
		for(int i=1; i<=n; i++) {
			s+=i;
		}
		System.out.println("1~"+n+"���� �� : " + s);
		
		sc.close();
	}
}
