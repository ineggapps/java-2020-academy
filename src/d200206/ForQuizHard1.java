package d200206;

import java.util.Scanner;

public class ForQuizHard1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int com, user;

		while (true) {
			do {
				System.out.print("1.���� 2.���� 3.�� 4.���� ���� > ");
				user = sc.nextInt();
			} while (user < 1 || user > 4);
			if (user == 4) {
				break;
			}
			com = (int) (Math.random() * 3) + 1;
			//user�� com�� ��� �ۼ��ϱ�
			System.out.print("���: " );
			if(user==1) {
				System.out.println("����");
			} else if(user==2) {
				System.out.println("����");
			}else {
				System.out.println("��");
			}
			System.out.print("��ǻ��: " );
			if(com==1) {
				System.out.println("����");
			} else if(com==2) {
				System.out.println("����");
			}else {
				System.out.println("��");
			}
			
			
			
			// user�� com�̶� ���Ͽ� ���� �̰���� ����ϱ�
			if(user==com) {
				System.out.println("�����ϴ�.");
			}else if(user-com==1 || user-com==-2) {
				System.out.println("����� �̰���ϴ�.");
			}else {//user-com==2 Ȥ�� -1
				System.out.println("����� �����ϴ�.");
			}
		}

		sc.close();
	}
}
