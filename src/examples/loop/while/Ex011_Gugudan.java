import java.util.Scanner;

public class Ex011_Gugudan {
	public static void main(String[] args) {
/*
		����(��)�� �Է� �޾� �Է� ���� ���� �������� ���
*/
		Scanner sc=new Scanner(System.in);
		
		int dan;
		int s, n;
		
		System.out.print("�� ? ");
		dan=sc.nextInt();
		
		n=0;
		while(n<9) {
			n++;
			s=dan*n;
			System.out.printf("%d * %d = %d\n", dan, n, s);
			// System.out.println(dan + "*" + n + "= " + s);
		}
		
		sc.close();
	}
}
