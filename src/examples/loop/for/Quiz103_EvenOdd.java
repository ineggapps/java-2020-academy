import java.util.Scanner;

public class Quiz103_EvenOdd {
	public static void main(String[] args) {
/*		
		10���� ������ �Է� ���� �Է� ���� ���� ¦���� Ȧ�� ����
*/		
		Scanner sc=new Scanner(System.in);
		int input, even, odd;
		
		even=odd=0;
		System.out.println("10���� ������ �Է� �ϼ���...");
		for(int i=0; i<10; i++) {
			input=sc.nextInt();
			
			if(input%2==0)
				even++;
			else
				odd++;
			
		}
		System.out.println("Ȧ���� ���� : " + odd);
		System.out.println("¦���� ���� : " + even);
		
		sc.close();
	}
}
