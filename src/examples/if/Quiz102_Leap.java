import java.util.Scanner;

public class Quiz102_Leap {
	public static void main(String[] args) {
/*
		�⵵�� �Է� �޾� ������� �������� �Ǻ��ϴ� ���α׷�
*/
		Scanner sc=new Scanner(System.in);
		int y;
		
		System.out.print("�⵵ ? ");
		y=sc.nextInt();
		
		if(y%4==0 && y%100!=0 || y%400==0) {
			System.out.println(y + "�⵵�� �����Դϴ�.");
		} else {
			System.out.println(y + "�⵵�� ����Դϴ�.");
		}
		
		sc.close();
	}
}
