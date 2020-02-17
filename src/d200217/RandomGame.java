package d200217;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
	public static void main(String[] args) {
		// ���� �� 1~100���� �ϳ��� ������ �߻����� 20�� �ȿ� ���ߴ� ����
		Game g = new Game();
		g.play();
	}
}

class Game {
	Random random = new Random();
	public static final int CHANCE = 20;
	private int number;
	private int life;
	private int input;

	Game() {
		number = random.nextInt(100) + 1;
	}

	public void play() {
		Scanner sc = new Scanner(System.in);
		life = CHANCE;
		do {
			System.out.print("input(1~100) ? ");
			input = sc.nextInt();

			if (input < 1 || input > 100) {
				System.out.println("ERR: �Է� ������ ���� 1���� 100������ ���Դϴ�.");
				continue;
			}
			life--;// ��ȸ ����

			// ���� �Ǻ�
			if (input > number) {
				System.out.printf("%d���ٴ� �۽��ϴ�.(%d�� ����)%n", input, life);
			} else if (input < number) {
				System.out.printf("%d���ٴ� Ů�ϴ�.(%d�� ����)%n ", input, life);
			} else {
				System.out.printf("%d�� ���� �����߽��ϴ�!%n", CHANCE - life);
				sc.close();
				return;
			}
		} while (life > 0 );
		System.out.println("20�� �ȿ� ������ ���߽��ϴ�. ������ " + number);
		sc.close();
	}

}