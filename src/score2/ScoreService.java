package score2;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ScoreService {
	private Scanner sc = new Scanner(System.in);
	private Score score = new ScoreImpl();// ��ĳ����

	public void input() {
		System.out.println("\n�Է�...");

		try {
			String s;
			int n;
			ScoreVO vo = new ScoreVO();
			System.out.print("�й� ? ");
			vo.setHak(sc.next());
			System.out.print("�̸� ? ");
			s = inputName();
			vo.setName(s);
			System.out.print("���� ? ");
			n = inputScore();
			vo.setKor(n);
			System.out.print("���� ? ");
			n = inputScore();
			vo.setEng(n);
			System.out.print("���� ? ");
			n = inputScore();
			vo.setMat(n);

			if (score.append(vo) > 0) {
				System.out.println("�߰� ����");
			} else {
				System.out.println("���� �ʰ��� �߰� ����");
			}

		} catch (InputMismatchException e) {
			System.out.println("������ ���ڸ� ������ �����մϴ�.");
		} catch (ScoreValidException e) {
			System.out.println(e.getMessage());
		} catch (KoreanValidException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("-----------------------------\n");

	}

	public void print() {
		System.out.println("\n���...");

		for (int i = 0; i < score.getCount(); i++) {
			ScoreVO vo = score.getListData()[i];
			System.out.println(vo);
		}
		System.out.println("=====================\n");

	}

	private String inputName() throws KoreanValidException {
		String s = null;
		String regex = "^[��-�R]+$";
		// ^����, $��, +(1�� �̻�)
		// [��-�R]: \uac00-\ud7a3 (����ǥ����)
		s = sc.next();
		if (!Pattern.matches(regex, s)) {
			// ����ǥ������ ���ǿ� ������ ���
			throw new KoreanValidException("�̸��� �ѱ۸� �Է��� �����մϴ�.");
		}
		return s;
	}

	private int inputScore() throws ScoreValidException, InputMismatchException {
		int s = 0;
		try {
			s = sc.nextInt();
			if (s < 0 || s > 100) {
				throw new ScoreValidException("������ 0~100���� �����մϴ�.");
			}
		} catch (InputMismatchException e) {
			sc.nextLine();// �Է¹��� ���� ����
			throw e;// ���ܸ� �ٽ� ����.
		}
		return s;
	}

}
