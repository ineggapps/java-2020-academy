package d200206;

import java.util.Scanner;

public class ContinueEx2 {
	public static void main(String[] args) {
		// 5���� Ȧ���� �Է� �޾� �Է� ���� Ȧ���� �� ���ϱ�.
		// ��, �Է� ���� ���� 0���� �۰ų� ¦���̸� �ٽ� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		int n, s = 0;
		int i=0;
		System.out.print("Ȧ���� �Է�: ");
		while(i<5) {
			n=sc.nextInt();
			if(n<0 || n%2==0) {
				continue;
			}
			s+=n;
			i++;
		}
		System.out.println("���: "+s);
		sc.close();
	}
}
