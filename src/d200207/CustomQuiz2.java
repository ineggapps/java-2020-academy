package d200207;

import java.util.Scanner;

public class CustomQuiz2 {
	public static void main(String[] args) {
		//������ �̿��Ͽ� ��ǻ�Ϳ� ������ ������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		/*
		 ��ǻ�ʹ� 1~5���� ����
		 1. ��, 2. �Ʒ�, 3. ���� 4. ������ 5.����
		 ���� 1~6 ������ �� �Է� 
		 1. ��, 2. �Ʒ�, 3. ���� 4. ������ 5.���� 6. ����
		�� ������ �Ѵ�.
		(�̱�� ����� ���� ������� ����)
		 */
		Scanner sc = new Scanner(System.in);
		int com;
		int user;
		String[] g = new String[] {"��","�Ʒ�","����","������","����"};
		while(true) {
			com = (int)(Math.random()*5)+1;
			System.out.print("1.��, 2.�Ʒ�, 3.���� 4.������ 5.���� 6.���� > ");
			user = sc.nextInt();
			
			//�Է� �� ����
			if(user==6) {
				break;
			}else if(user<1 || user>6) {
				continue;
			}
			
			//���
			System.out.printf("��ǻ��: %s",g[com-1]);
			System.out.println();
			System.out.printf("����: %s",g[user-1]);	
			System.out.println();
			
			if(com==user) {
				System.out.println("����� �����ϴ�.");
				break;
			}
		}
		sc.close();
	}
	
	
}
