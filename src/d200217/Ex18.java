package d200217;

import java.util.Random;
import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int input;
		int cnt = 0;

		int com = rnd.nextInt(100) + 1;
		do {
			System.out.print("input ? ");
			input = sc.nextInt();

			if (com > input) {
				System.out.println("ũ��.");
			} else if (com < input) {
				System.out.println("�۴�.");
			}
			cnt++;
		} while (input != com && cnt < 20);//���ǹ��� input!=com�� �ɾ�����...
		if(input==com) {
			System.out.println(cnt+"�� ���� �������ϴ�.");
		}else {
			System.out.println("���� ���� ~ ��: "+cnt);
		}

		sc.close();
	}
}
