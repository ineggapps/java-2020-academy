package d200129;

import java.util.Scanner;

public class InputEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//System.in�� Ű������ ����
		String name;
		int age;
		char gender;
		double height;
		
		System.out.print("�̸�? ");
		name=sc.next();//���ڿ� �Է� (�߰��� ���� �Է��� �Ұ���)
		System.out.print("����? ");
		age=sc.nextInt();//���� �Է�
		System.out.print("����[M/F]? ");
		gender=sc.next().charAt(0);//���� �Է�
		System.out.print("Ű? ");
		height=sc.nextDouble();//�Ǽ� �Է�
		sc.close();//�Է� �ڿ��� �� ����Ͽ����� close�Ͽ� �ڿ��� �ݳ��Ѵ�.
		
		System.out.format("�̸�:%s, ����:%d, ����:%C, Ű:%f",name,age,gender,height);
	}
}
