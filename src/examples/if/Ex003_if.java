import java.util.Scanner;

public class Ex003_if {
	public static void main(String[] args) {
/*
		������ �Է� �޾� �Է� ���� ���� ¦������ Ȧ������ �Ǻ��ϴ� ���α׷�
*/
		Scanner sc=new Scanner(System.in);
		int n;
		
		System.out.print("���� ? ");
		n=sc.nextInt();
		
		if(n%2==0) {
			System.out.println(n + " : ¦��");
		} else {
			System.out.println(n + " : Ȧ��");
		}
		
		sc.close();
	}
}
