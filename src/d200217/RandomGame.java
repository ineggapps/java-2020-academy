package d200217;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
	public static void main(String[] args) {
		// 스무 고개 1~100까지 하나의 난수를 발생시켜 20번 안에 맞추는 게임
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
				System.out.println("ERR: 입력 가능한 수는 1부터 100까지의 수입니다.");
				continue;
			}
			life--;// 기회 차감

			// 숫자 판별
			if (input > number) {
				System.out.printf("%d보다는 작습니다.(%d번 남음)%n", input, life);
			} else if (input < number) {
				System.out.printf("%d보다는 큽니다.(%d번 남음)%n ", input, life);
			} else {
				System.out.printf("%d번 만에 성공했습니다!%n", CHANCE - life);
				sc.close();
				return;
			}
		} while (life > 0 );
		System.out.println("20번 안에 맞히지 못했습니다. 정답은 " + number);
		sc.close();
	}

}