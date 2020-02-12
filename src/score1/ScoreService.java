package score1;

import java.util.Scanner;

public class ScoreService {
	// field area
	// instance variables는 99% private 으로 선언하는 것이 원칙이다.
	private Scanner sc = new Scanner(System.in);
	private ScoreVO[] list = new ScoreVO[50];
	private int cnt = 0;
	private Score score = new Score();

	public void input() {
		if (cnt >= 50) {
			System.out.println("입력 초과");
			return;
		}

		System.out.println("데이터 입력...");
		String[] subject = { "국어 ? ", "영어 ? ", "수학 ? " };
		// 본격적인 입력 과정 시작
		ScoreVO vo = new ScoreVO();
		// 입력 절차
		System.out.print("학번 ? ");
		vo.hak = sc.next();

		System.out.print("이름 ? ");
		vo.name = sc.next();

		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i]);
			vo.score[i] = sc.nextInt();
		}
		vo.tot = score.getTot(vo.score);
		list[cnt++] = vo;// 입력할 때마다 입력된 자료를 카운트한다.
	}

	public void print() {
		System.out.println("데이터 출력...");
		System.out.println("학번\t이름\t국어\t수학\t영어\t총점\t평균\t석차");
		System.out.println("========================");
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%s\t%s\t", list[i].hak, list[i].name);
			for (int j = 0; j < list[i].score.length; j++) {
				System.out.print(list[i].score[j]+"\t");
			}
			System.out.printf("%d\t%d\t%d\t\n", list[i].tot, score.getAve(list[i].score), list[i].rank);
		}
	}

	public void findByName() {
		System.out.println("이름 검색");
	}

	public void delete() {
		System.out.println("데이터 삭제...");
	}
}
