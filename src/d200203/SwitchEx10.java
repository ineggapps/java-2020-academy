package d200203;

import java.util.Scanner;

public class SwitchEx10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y,m,d=0;
		
		System.out.print("���� �Է�: ");
		y = sc.nextInt();
		
		System.out.print("�� �Է�: ");
		m = sc.nextInt();
		
		switch(m) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			d=31;
			break;
		case 4: case 6: case 9: case 11:
			d=30;
			break;
		case 2:
			d=28;
			if(y%4==0 && y%100!=0 || y%400==0) {
				//���� ���
				//������ 4�� ����̰� 100�� ����� �ƴϰų� 400�� ������� ��.
				d++;
			}
			break;
//		default:
//			//���� ���� �� d�� �ʱ�ȭ���� ���� ���
//			d=0;
//			break;
		}
		if(d!=0) {
			System.out.printf("%d�� %d���� %d�ϱ��� �ֽ��ϴ�.\n",y,m,d);
		}else {			
			System.out.println("�Է� ����...");
		}
		sc.close();
	}
}
