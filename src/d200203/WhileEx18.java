package d200203;

import java.util.Scanner;

public class WhileEx18 {
	public static void main(String[] args) {
		//���� �Է� �޾�
		Scanner sc = new Scanner(System.in);
		int dan,n=0;
		
		System.out.print("��[1~9] �Է�: ");
		dan = sc.nextInt();
		
		//���������δ� �����Ϸ��� while ���ǹ��� �ؼ��Ͽ� �ۼ��� �ݺ����� ������ Ǯ����´�.
		//�ӵ��� ������ ���� �� �ƴ�. ������� ���̼�, �۾��� ȿ���� ���� ����Ͽ� ź���� �����̴�.
		while(n<9) {// dan * 9���� ��µǵ��� ���� �����ϱ�
			n++;
			System.out.printf("%d X %d = %d%n",dan,n,dan*n);
		}
		
		sc.close();
	}
}
