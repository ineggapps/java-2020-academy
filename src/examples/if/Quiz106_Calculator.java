import java.util.Scanner;

public class Quiz106_Calculator {
	public static void main(String[] args) {
/*
		�μ� �� �����ڸ� �Է� �޾� ��Ģ ������ �ϴ� ���α׷�
*/
		Scanner sc = new Scanner(System.in);

		int a, b;
		char c;
		
		System.out.print("�μ� ? ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.print("������[+, -, *, /] ? ");
		c=sc.next().charAt(0);

		if(c=='+') {
			System.out.printf("%d + %d = %d\n", a, b, a+b);
		}else if(c=='-') {
			System.out.printf("%d - %d = %d\n", a, b, a-b);
		}else if(c=='*') {
			System.out.printf("%d * %d = %d\n", a, b, a*b);
		}else if(c=='/') {
			System.out.printf("%d / %d = %d\n", a, b, a/b);
		}else {
			System.out.println("������ �Է� ���� �Դϴ�.");
		}
		
		sc.close();
	}
}
