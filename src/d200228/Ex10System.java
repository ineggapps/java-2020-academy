package d200228;

import java.util.Scanner;

public class Ex10System {
	// main�� ���α׷��� ��������������, ���������� �ǹ��ϴ� ���� �ƴϴ�.
	// main�� �����ٰ� �ϴ��� ���α׷��� ��������� ���� ���� �ִ�. (������ ������ ��� ��쿡 �̷� ��찡 ����)
	// but System.exit(0)�� ������ �Ǹ� ������ ���α׷��� �ߵ��� ������ �����.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		try {
			while (true) {
				System.out.print("���� ? ");
				n = sc.nextInt();

				if (n == 0) {
//					System.exit(0);//���α׷� ���� ����
					// �翬�� ���α׷��� ������ System.exit(0)���� ����ǹǷ� ������ finally������ ����� ������� �ʴ´�.
					return;// finally block�� �����Ѵ�.
					// ��, return�� �ϸ� (���α׷� ������ ���Դϴ�)������ �������� �ʴ´�.
					// �׸�ŭ finally����� �����ϴٴ� ���� �ǹ��Ѵ�.
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally block...");
			sc.close();
		}
		System.out.println("���α׷� ������ ���Դϴ�.");
	}
}
