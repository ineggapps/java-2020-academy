import java.util.Scanner;

public class Quiz208_PrimeFactorization {
	public static void main(String[] args) {
/*		
	 	2�̻��� ������ �Է� �޾� ���μ� �����Ͽ� ��� �ϴ� ���α׷�
*/	 	
		Scanner sc = new Scanner(System.in);

		int num;
		int p, n;
		
		do {
			System.out.print("���� ? ");
			num=sc.nextInt();
		} while(num<2);
		
		System.out.print(num+" = ");
		
		p=2;
		n=num;
		while(n!=1) {
			if(n%p==0) {
				if(n!=num) {
					System.out.print("*");	
				}
				System.out.print(p);
				
				n=n/p;
			} else {
				p++;
			}
		}
		
		System.out.println();
		
		sc.close();
	}
}
