package d200204;

import java.util.Scanner;

public class ForQuiz3 {
	public static void main(String[] args) {
		//10���� ������ �Է� �޾� �Է� ���� ���� ��, ¦�� ������ Ȧ�� ������ ����ϴ� ���α׷�
		Scanner sc = new Scanner(System.in);
		int n, odd=0, even=0;
		System.out.println("10���� ������ �Է��ϼ���...");
		for(int i=1;i<=10;i++) {
			n =  sc.nextInt();
			if((n&1)==0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.printf("Ȧ���� ����: %d%n",odd);
		System.out.printf("¦���� ����: %d%n",even);
		
//		for(int i=1;i<=10;i++) {
//			System.out.println("d");
//			i=10; // ����Ƚ�� �� ��
//			for�� �ȿ��� �ݺ����� ���� ������ �����ϸ� �ݺ� Ƚ���� �ٲ��.
//		}
		sc.close();
	}
}
