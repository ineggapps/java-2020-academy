package d200206;

import java.util.Scanner;

public class ContinueEx1 {
	public static void main(String[] args) {
		// 5���� Ȧ���� �Է� �޾� �Է� ���� Ȧ���� �� ���ϱ�.
		// ��, �Է� ���� ���� 0���� �۰ų� ¦���̸� �ٽ� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		int n, s = 0;
		System.out.print("Ȧ���� �Է�: ");
		for(int i=1;i<=5;i++) {
			n=sc.nextInt();
			if(n<0 || n%2==0) {
				i--;
				continue;
			}
			s+=n;
		}
		System.out.println("���: "+s);
		sc.close();
	}
}
