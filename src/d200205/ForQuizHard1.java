package d200205;

import java.util.Scanner;

public class ForQuizHard1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,apx=0;
		//�޴� ��, ����� �� ���庯��
		int sub;
		//Ư�� ��-7
		System.out.println("5���� ������ �Է��ϼ���...");
		for(int i=0;i<5;i++) {
			num = sc.nextInt();
			if(i==0) {
				//ó���� �� apx������ num �Է�
				apx=num;
			}
			sub=num-7;
			if(sub==1 || sub==-1) {
				//ó���� �ƴϸ� apx������ ���� �Էµ� num�� ������ ������ �� ������� ���� ��
				//��, 7���� �ٻ��� ���ٸ� ���� ���� ���� ����ؾ� ��.
				//(������� �Ͽ����Ƿ� 7���� �ٻ��� �ּڰ��� -1�̰ų� 1�̹Ƿ� ������ �����ϸ� apx������ ���� ��� break;
				apx=num;
				break;
			} else if(apx-7>sub) {
				//�ٻ��� ���ŵǸ�
				apx=num;
			}
		}
		System.out.println("7�� ���� ����� ��: "+apx);
		sc.close();
	}
}
