import java.util.Scanner;

public class Quiz107_Pass {
	public static void main(String[] args) {
/*
		�̸��� ������ ������ �Է� �޾� ���� ���θ� �Ǻ��ϴ� ���α׷�
*/
		Scanner sc = new Scanner(System.in);

		String name;
		int com, excel, word;
		int tot, ave;
		String result;
		
		System.out.print("�̸� ? ");
		name = sc.next();
		
		System.out.print("������ ���� ? ");
		com=sc.nextInt();
		excel=sc.nextInt();
		word=sc.nextInt();
		
		tot = com + excel + word;
		ave = tot / 3;

		if(com>=40 && excel>=40 && word>=40 && ave>=60) {
			result = "�հ�";
		}else if(ave<60) {
			result = "���հ�";
		}else {
			result = "����";
		}
		
		System.out.println(name+"���� " + result+" �Դϴ�.");
		
		sc.close();
	}
}
