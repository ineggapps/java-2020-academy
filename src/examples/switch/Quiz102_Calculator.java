import java.util.Scanner;

public class Quiz102_Calculator {
	public static void main(String[] args) {
/*
		�μ� �� �����ڸ� �Է� �޾� ��Ģ ������ �ϴ� ���α׷�
*/
		Scanner sc = new Scanner(System.in);

		int a, b;
		char c;
		String result;

		System.out.print("�μ� ? ");
		a = sc.nextInt();
		b = sc.nextInt();

		System.out.print("������[+, -, *, /] ? ");
		c = sc.next().charAt(0);

		switch (c) {
		case '+': result = a+"+"+b+"="+(a+b); break;
		case '-': result = a+"-"+b+"="+(a-b); break;
		case '*': result = a+"*"+b+"="+(a*b); break;
		case '/': result = a+"/"+b+"="+(a/b); break;
		default: result="������ �Է� ����..."; break;
		}
		
		System.out.println(result);
		sc.close();
	}
}
