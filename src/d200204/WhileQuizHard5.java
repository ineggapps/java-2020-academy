package d200204;

import java.util.Scanner;

public class WhileQuizHard5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�ݾ��� �Է� �޾� �Է� ���� �ݾ��� 50000�� �ǿ��� 1�� �Ǳ��� ȭ�� �ż��� �� �������� ����ϴ� ���α׷�
		//while�� �̿��Ͽ� ȭ���� �ż� ����ϱ�
		//�ݾ��� 70,000���� ��� ȭ���� �ż��� 50,000�� �� 1��, 10,000�� �� 2��ó�� ū ���� �ݾ׺��� ����ϰ� �������� ���� ���� ȭ�󿡼� ����ϱ�.
		int unit=50000;		
		int cnt=0;
		int share;
		int money;
		
		System.out.print("�ݾ� ? ");
		money = sc.nextInt();
		
		//������ �߰��߰� ����ϸ� �Ǵϱ� ���� ȭ�亰�� ������ ������ �ʿ�� ����.
		
		//����
		while(unit!=0) {
			share=money/unit;
			money%=unit;
			System.out.printf("%d�� �� ����: %d��%n",unit,share);
			if(++cnt%2==1) {
				//Ȧ�� ��°�� 5�� ������
				unit/=5;
			}
			else {
				//¦�� ��°�� 2�� ������
				unit/=2;
			}
			
		}
		
		sc.close();
	}
}
