package d200130;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("��������?");
		s=sc.nextLine();
		int num = Integer.parseInt(s);
		//s�� ���ڿ��� String������ ��ȯ�� �޾����Ƿ� ������ ��ȯ�ϴ� �۾��� �ʿ��ϴ�.
		//�̶� ���ڿ��� ���㰪�� �������·� ��ȯ�ϴ� ���� Integer.parseInt()�޼��带 �̿��Ͽ� �۾��� �����Ѵ�.
		//String s�� ���õ� ������� ����� int num = sc.nextInt();�� �����ص� �ȴ�. 
		System.out.println(num);
		sc.close();
	}
}