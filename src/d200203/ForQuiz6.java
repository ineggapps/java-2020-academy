package d200203;

import java.util.Scanner;

public class ForQuiz6 {
	public static void main(String[] args) {
		// 10���� ������ �Է� ���� ���� �� ���� ���� ���� ����ϴ� ���α׷� �ۼ��ϱ�
		Scanner sc = new Scanner(System.in);
		int min =0, n;
		System.out.println("(�ּڰ� ���ϱ�) 10���� ���� �Է�");
		for (int i = 1; i <= 10; i++) {
			n = sc.nextInt();
			if(i==1) {//ó���� �Է¹޴� ���� min���� �����ϰ� ���Ѵ�.
				min = n;
			}
			else if (min> n) {
				min= n;
			}
		}
		System.out.println("�ּڰ�: "+ min);
		sc.close();
	}
}
