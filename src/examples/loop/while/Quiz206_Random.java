import java.util.Scanner;

public class Quiz206_Random {
	public static void main(String[] args) {
		// 1~100������ ������ �߻����� ����� ���ߴ��� ����ϴ� ���α׷� �ۼ�
		Scanner sc = new Scanner(System.in);

		int com, user, cnt;

		com = (int) (Math.random() * 100) + 1;
		cnt=0;
		while (true) {
			System.out.print("�� ? ");
			user = sc.nextInt();

			cnt++;

			if (user == com) {
				System.out.println(cnt + "�� ���� �����߽��ϴ�.");
				break;
			} else if (user > com) {
				System.out.println("�Է��� �����ٴ� ������ �Դϴ�.");
			} else {
				System.out.println("�Է��� �����ٴ� ū�� �Դϴ�.");
			}
		}
		
		sc.close();
	}
}
