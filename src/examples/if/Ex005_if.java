import java.util.Scanner;

public class Ex005_if {
	public static void main(String[] args) {
/*
		�ѹ��ڸ� �Է� �޾� ��ҹ������� �Ǻ��ϴ� ���α׷�
*/
		Scanner sc=new Scanner(System.in);
		
		char ch;
		System.out.print("�ѹ��� ? ");
		ch=sc.next().charAt(0);
		
		if(ch>='A' && ch <='Z') {
			System.out.println(ch+" : �빮��");
		} else if(ch>='a' && ch <='z') {
			System.out.println(ch+" : �ҹ���");
		} else {
			System.out.println(ch+" : ��Ÿ����");
		}
		
		sc.close();
	}
}
