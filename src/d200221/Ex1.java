package d200221;

import java.util.Scanner;

//���� ��Ȳ �ó�����
//1. ������ �ƴ� ���ڳ� �Ҽ����� �Է�
//2. b�� 0�� �Է� (0���� ����)
//3. int�� ������ �ʰ��ϴ� 21�� ������ ���� �Է�

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;

		System.out.print("�� ���� �Է� > ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = a / b;
		System.out.println(a + "/" + b + "=" + c);
		System.out.println("��ȿ���� ���� �Է��Դϴ�.");
		System.out.println("������ ����Ǿ����ϴ�.");
		sc.close();
	}
}
