package d200131;

import java.util.Scanner;

public class IfEx10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		
		System.out.print("���� �Է�: ");
		ch=sc.next().charAt(0);
		
		if(ch>='A'&&ch<='Z') {
			System.out.println(ch+": �빮��");
		}
		else if(ch>='a'&&ch<='z') {
			System.out.println(ch+": �ҹ���");
		}
		else {
			System.out.println(ch+": ��Ÿ ����");
		}
		
		sc.close();
	}
}
