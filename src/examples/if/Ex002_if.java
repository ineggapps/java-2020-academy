import java.util.Scanner;

public class Ex002_if {
	public static void main(String[] args) {
/*
		������ �Է� �޾� �Է� ���� ���� Ȧ������ �Ǻ��ϴ� ���α׷�
*/
		Scanner sc=new Scanner(System.in);
		int n;
		
		System.out.print("���� ? ");
		n=sc.nextInt();
		
		if(n%2==1) {
			System.out.println(n + " : Ȧ��");
		}
		
/*
		if((n&1)==1) {
			System.out.println(n + " : Ȧ��");
		} 
*/		
		sc.close();
	}
}
