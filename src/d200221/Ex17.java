package d200221;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		int n;
		//JDK7 �̻� �������� ��� ������ ����.
//		try(���ҽ� ��ü) ����ϸ� �ڵ����� ���ҽ��� close(sc.close())��.
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("���� ? ");
			n = sc.nextInt();
			System.out.println(n);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
