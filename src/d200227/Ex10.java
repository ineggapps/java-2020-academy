package d200227;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		try {
			//try catch�� �ȿ� ������ ���ѷ����� ���� �ʰ� �ٷ� while �ݺ��� ������ ��������.
			while (true) {
				System.out.print("�� : ");
				n = sc.nextInt();
				System.out.println(n);
			}
		} catch (InputMismatchException e) {
			System.out.println("���ڸ� �Է� ����");
		} finally {
			sc.close();
		}
	}
}
