import java.util.Scanner;

public class Quiz101_Hap {
	public static void main(String[] args) {
/*		
		������ �Է� �޾� 1���� �Է� ���� �������� ��, ¦�� ��, Ȧ�� ��
*/
		Scanner sc=new Scanner(System.in);

		int input;
		System.out.print("�� ? ");
		input = sc.nextInt();

		int n, s, o, e;
		n=s=o=e=0;
		while(n < input) {
			n++;
			s+=n;
			if(n%2==0)
				e+=n;
			else
				o+=n;
		}

		System.out.println("1~"+input+" ���� �� = " + s);
		System.out.println("1~"+input+" ���� ¦�� �� = " + e);
		System.out.println("1~"+input+" ���� Ȧ�� �� = " + o);
		
		sc.close();
	}
}
