package d200131;

import java.util.Scanner;

public class IfEx8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("���� �Է�: ");
		n = sc.nextInt();
		
		if(n%2==0 && n%3==0) { // ==>  if(n%6==0)�� ���� �ǹ��̴�.
			System.out.println(n+": 2�� ����� 3�� ���");
		}else if(n%2==0) {
			System.out.println(n+": 2�� ���");
		}else if(n%3==0) {
			System.out.println(n+ ": 3�� ���");			
		}else {
			System.out.println(n+": 2 �Ǵ� 3�� ����� �ƴ�");
		}
		
		sc.close();
	}
}
