package d200204;

import java.util.Scanner;

//���� �Է¹޾� ������ ���. ��, �Է� ���� ���� 1~9�� ����� ���Է� �޴´�.
public class WhileEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan=1, n=0;
		boolean b=true;
		/*
		do~while���� �̿����� �ʰ� �󸶵��� �ۼ��� ����������
		�ݺ����� ó���� �����ϱ� ���� boolean ������ �߰��� true�� �ʱ�ȭ�Ͽ� �����Ͽ� �����ϵ��� ������ �Ѵ�.
		�������� �����ڸ� do~while���� ����.
		*/
		while(b){
			System.out.print("�� �Է�> ");
			dan = sc.nextInt();
			//���ǽ��� �Ǻ��Ͽ� 1~9������ ���ڶ�� ������ �����ϸ� b=false�� �����Ͽ� �ݺ����� ����������.
			if(dan>=1 && dan<=9) {
				b=false;
			}
		}
		
		while(n<9) {
			n++;
			System.out.printf("%d X %d = %d\n",dan,n,dan*n);
		}
		sc.close();
	}
}
