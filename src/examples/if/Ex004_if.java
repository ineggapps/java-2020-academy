import java.util.Scanner;

public class Ex004_if {
	public static void main(String[] args) {
/*
		������ �Է� �޾� ũ������� ����ϴ� ���α׷�
*/
		Scanner sc=new Scanner(System.in);
		
		int a, b, c, temp;

		System.out.print("ù��° �� ? ");
		a = sc.nextInt();
		System.out.print("�ι�° �� ? ");
		b = sc.nextInt();
		System.out.print("����° �� ? ");
		c = sc.nextInt();

		if(a>b) {
			temp = a;	a = b;	b = temp;
		}

		if(a>c) {
			temp = a;	a = c;	c = temp;
		}

		if(b>c) {
			temp = b;	b = c;	c = temp;
		}
		System.out.println("��� : " + a + "  " + b + "  " + c);
		
		sc.close();
	}
}
