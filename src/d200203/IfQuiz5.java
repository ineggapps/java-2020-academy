package d200203;

import java.util.Scanner;

public class IfQuiz5 {
	//�Է¹��� �ٹ��ð��� ���� �޿��� ����ϴ� ���α׷�
	//��, ���ϴ� �ð��� 8�ð��� �ʰ��ϸ� 8�ð��� ���� �޿��� �����ϰ� �ʰ� �ð��� 1.5���� �޿��� �����Ѵ�.
	//ex: 9�ð� ���ϸ� 8*10000 + 1*(10000*1.5) = 95,000���̴�.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour,pay;
		int per=10000;
		
		System.out.print("�ٹ� �ð� �Է�: ");
		hour = sc.nextInt();
		
		if(hour>8) {
			pay = (int)((hour-8)*(per*1.5f))+(8*per);
		}else {
			pay = hour*per;
		}
		
		System.out.format("�޿�: %,d��\n",pay);
	
		sc.close();
	}
}
