package d200204;

import java.util.Scanner;

//���� �Է¹޾� ������ ���. ��, �Է� ���� ���� 1~9�� ����� ���Է� �޴´�.
public class WhileEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan, n=0;
		do {
			System.out.print("�� �Է�> ");
			dan = sc.nextInt();
			//while�� ������ �Է��� �ٽ� �޴� ������ ����ϸ� �ȴ�.
		}while(dan<1 || dan>9);
		
		while(n<9) {
			n++;
			System.out.printf("%d X %d = %d\n",dan,n,dan*n);
		}
		sc.close();
	}
}
