package d200130;

import java.util.Scanner;

public class OperQuiz2 {
	public static void main(String[] args) {
		//�������� �Է� �޾� �� ���̿� �ѷ��� ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		int r;
		System.out.print("���� �������� ? ");
		r = sc.nextInt();
		System.out.printf("���� ���̴� %.2f�̰� �ѷ��� %.2f�Դϴ�.", r*r*3.14, r*2*3.14);
	}
}
