package d200129;

import java.util.Scanner;
/*
 * �ʸ� �Է� �޾� ��, ��, �ʷ� ��ȯ�ϴ� ���α׷��� �ۼ��ϼ���.
 * [ó������]
 * - ���� �Է��� Scanner Ŭ������ nextInt() �޼��带 �̿��Ѵ�.
 * */
public class OperQuiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour, minute, second, inputSecond;
		System.out.print("�ʸ� �Է��ϼ���?");
		inputSecond = sc.nextInt();
		
		hour = inputSecond/(3600);
		minute = (inputSecond/60)%60;
//		minute = (inputSecond-hour*3600)/60;
		second = inputSecond%60;
		
		System.out.printf("%d�ʴ� %d�ð� %d�� %d�� �Դϴ�.\n",inputSecond, hour, minute, second);
		sc.close();		
	}
}
