import java.util.Scanner;

public class Quiz102_Gugudan {
	public static void main(String[] args) {
/*		
		���� �Է� �޾� �Է¹��� ���� �������� ���
*/		
		Scanner sc=new Scanner(System.in);
		int n;
		
		do {
			System.out.print("�� ? ");
			n=sc.nextInt();
		} while(n<1||n>9);
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", n, i, n*i);
		}
		
		sc.close();
	}
}
