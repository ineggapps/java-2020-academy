import java.util.Scanner;

public class Quiz106_Hap {
	public static void main(String[] args) {
/*		
		�� ������ �Է� �޾� �Է� ���� ���� ���� ������ ū �������� ��
*/
		Scanner sc = new Scanner(System.in);

		int num1, num2, temp;
		int n, s;
		
		System.out.print("�μ� ? ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		if(num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}

		s = 0;
		n = num1;
		while(n <= num2) {
			s+=n;
			n++;
		}
		System.out.printf("%d ~ %d ������ �� = %d\n" , num1, num2, s);
		
		sc.close();
	}
}
