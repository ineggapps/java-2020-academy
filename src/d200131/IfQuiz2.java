package d200131;

import java.util.Scanner;

public class IfQuiz2 {
	//if���� �̿��Ͽ� ������ ���ϴ� ���α׷�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year;
		System.out.print("���� �Է�: ");
		year = sc.nextInt();
		
		if(year%4==0 && year%10!=0 || year%400==0) {
			System.out.println(year+"�⵵�� �����Դϴ�.");
		}else {
			System.out.println(year+"�⵵�� ����Դϴ�.");			
		}
		
		sc.close();
	}
}
