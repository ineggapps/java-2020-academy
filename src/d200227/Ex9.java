package d200227;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		while (true) {
			try {
				System.out.print("�� ? ");
				n = sc.nextInt();
				System.out.println(n);
				break;
			} catch (InputMismatchException e) {
				System.out.println("���ڸ� �Է� �����մϴ�.");
				sc.nextLine();//�ݵ�� nextLine()�޼��带 ȣ���Ͽ� Ű���� ������ \n��ȣ�� ������� �Ѵ�.
			}
		}
		sc.close();
	}
}
