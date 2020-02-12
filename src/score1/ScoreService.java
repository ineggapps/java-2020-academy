package score1;

import java.util.Scanner;

public class ScoreService {
	// field area
	// instance variables�� 99% private ���� �����ϴ� ���� ��Ģ�̴�.
	private Scanner sc = new Scanner(System.in);
	private ScoreVO[] list = new ScoreVO[50];
	private int cnt = 0;
	private Score score = new Score();

	public void input() {
		if (cnt >= 50) {
			System.out.println("�Է� �ʰ�");
			return;
		}

		System.out.println("������ �Է�...");
		String[] subject = { "���� ? ", "���� ? ", "���� ? " };
		// �������� �Է� ���� ����
		ScoreVO vo = new ScoreVO();
		// �Է� ����
		System.out.print("�й� ? ");
		vo.hak = sc.next();

		System.out.print("�̸� ? ");
		vo.name = sc.next();

		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i]);
			vo.score[i] = sc.nextInt();
		}
		vo.tot = score.getTot(vo.score);
		list[cnt++] = vo;// �Է��� ������ �Էµ� �ڷḦ ī��Ʈ�Ѵ�.
	}

	public void print() {
		System.out.println("������ ���...");
		System.out.println("�й�\t�̸�\t����\t����\t����\t����\t���\t����");
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
		System.out.println("�̸� �˻�");
	}

	public void delete() {
		System.out.println("������ ����...");
	}
}
