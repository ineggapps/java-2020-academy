import java.util.Scanner;

public class Quiz207_NumberTrun {
	public static void main(String[] args) {
/*		
		���� ������ �Է� �޾� �Է� ���� ������ ������ ���
*/		
		Scanner sc = new Scanner(System.in);

		int num1, num2, temp;

		do {
			System.out.print("�� ? ");
			num1 = sc.nextInt();
		} while(num1<0);

		num2 = 0;
        temp=num1;
		while(temp>0) {
			num2*=10;
			num2+=temp%10;
			temp/=10;
		}

		System.out.println("������ �� : " + num1);
		System.out.println("������ �� : " + num2);
		
		sc.close();
	}
}
