package d200205;

import java.util.Scanner;

public class WhileQuizHard6Re {
	public static void main(String[] args) {
		// ������ ���
		Scanner sc = new Scanner(System.in);
		int com, user, cnt;
		
		//1~100 ���� ������ �߻���Ű��
		com = (int)(Math.random()*100)+1;

		//ī��Ʈ ���� �ʱ�ȭ
		cnt=0;
		while(true) {//���� ����
			System.out.print("��? ");
			user = sc.nextInt();
			cnt++;
			if(com>user) {
				System.out.println("�Է��� ������ �� Ů�ϴ�.");
			}else if(com<user) {
				System.out.println("�Է��� ������ �� �۽��ϴ�.");
			}else {
				System.out.printf("%d�� ���� �����Ͽ����ϴ�.\n",cnt);
				break;
			}
		}
		sc.close();
	}
}
