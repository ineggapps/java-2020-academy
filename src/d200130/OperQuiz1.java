package d200130;

import java.util.Scanner;

public class OperQuiz1 {
	//���ο� ���θ� �Է� �޾� ���簢���� ���̿� �ѷ� ���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int width, height;
		System.out.print("�ʺ� ? ");
		width = sc.nextInt();
		System.out.print("���� ? ");
		height = sc.nextInt();
		System.out.printf("���� %d, ���� %d�� �簢���� ���̴� %d�̸�, �ѷ��� %d�Դϴ�.\n",width,height,width*height,(width+height)*2);
		sc.close();
	}
}
