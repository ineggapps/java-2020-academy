package d200204;

import java.util.Scanner;

public class WhileQuizHard8 {
	//2 �̻��� ������ �Է¹޾� ���μ� �����Ͽ� ����ϴ� ���α׷� �ۼ��ϱ�
	//Ex: 60 = 2*2*3*5
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;//�Է� �޴� ������ �����ϴ� ����
		int tmp;//�Է� ���� ������ ���μ������Ͽ� �߰� �ᱣ���� �����ϴ� ����
		int op;//�������� 0�� �� ������ ���μ����ظ� ���� (2, 3, 4, ...)
		//�Է�
		do {
			System.out.print("����? ");
			num = sc.nextInt();
		}while(num<2);
		
		tmp=num;
		op=2;
		System.out.printf("%d = ",num);
		//ó��
		while(tmp!=1) {
			//���μ����ش� 2���� �����Ѵ�.
//			System.out.println(tmp+","+op);
			if(tmp%op==0) {
				//�������� ���� ������ ���갪�� ��� ������.
				tmp/=op;
				System.out.print(op);
				if(tmp!=1) {
					//�������� ���ϴ� ������ *�� �ڿ� ������ ����
					System.out.print(" * ");
				}
			} 
			else {
				//�������� �ִٸ� op�� �÷��� ���� ����.
				op++;
			}
		}
		//���
		
		sc.close();
	}
}
