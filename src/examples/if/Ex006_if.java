import java.util.Scanner;

public class Ex006_if {
	public static void main(String[] args) {
/*
		������ �Է� �޾� 2 �Ǵ� 3�� ������� �Ǻ��ϴ� ���α׷�
*/
		Scanner sc=new Scanner(System.in);
		
		int input;
		System.out.print("�� ? ");
		input = sc.nextInt();

		if(input%2==0 && input%3==0) {
			System.out.println(input + " : 2�� 3�� ���");
		} else if(input%2==0){
			System.out.println(input + " : 2�� ���");
		} else if(input%3==0){
			System.out.println(input + " : 3�� ���");
		} else {
			System.out.println(input + " : 2 �Ǵ� 3�� ����� �ƴϴ�.");
		}		
		sc.close();
	}
}
