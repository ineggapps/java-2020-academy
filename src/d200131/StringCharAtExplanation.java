package d200131;

import java.util.Scanner;

public class StringCharAtExplanation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ�?");
		String s = sc.next();
		char ch;
		
		//s�� "korea"�� ���
		ch = s.charAt(0);//korea �� k�� ���� (0��°)
		System.out.println(ch);

		ch = s.charAt(2);//korea �� r�� ���� (2��°)
		System.out.println(ch);
		
		sc.close();
	}
}
