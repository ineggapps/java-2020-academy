package d200204;

import java.util.Scanner;

public class WhileQuizHard2 {
	//������ �Է� �޾� �Է� ���� ������ �� �ڸ� ���������� ����ϴ� ���α׷�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,r, cnt=1;
		//n: �Է� ���� ����
		//r: n�� ������ �߰� ���尪
		//cnt: ������ �ڸ����� ���� ����
		System.out.print("���� �Է�? ");
		n = sc.nextInt();
		
		r = n;//100 �Է�
		while(r!=0) {
			r /= 10;
			if(r!=0) {				
				cnt++;
			}
		}
		System.out.printf("%d�� %d�ڸ� ����",n,cnt);
		sc.close();
	}
}
