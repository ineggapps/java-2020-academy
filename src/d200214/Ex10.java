package d200214;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		// �̸��� �Է� �޾� �Է� ���� �̸� �� �达�� �ο������ϱ�
		// ��, �Է� ���� �̸��� end�̸� ���α׷��� ����
		Scanner sc = new Scanner(System.in);
		String name;
		int cnt = 0;
		do {
			System.out.print("�̸�? ");
			name = sc.next();
//			name.indexOf("��")==0 ���� �ϰų�...
			cnt = name.startsWith("��")? cnt + 1 : cnt;
		} while (!name.equals("end"));
		System.out.printf("�达: %d��", cnt);
		sc.close();
	}

}
