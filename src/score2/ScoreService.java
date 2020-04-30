package score2;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ScoreService {
	private Scanner sc = new Scanner(System.in);
	private Score score = new ScoreImpl();// 업캐스팅

	public void input() {
		System.out.println("\n입력...");

		try {
			String s;
			int n;
			ScoreVO vo = new ScoreVO();
			System.out.print("학번 ? ");
			vo.setHak(sc.next());
			System.out.print("이름 ? ");
			s = inputName();
			vo.setName(s);
			System.out.print("국어 ? ");
			n = inputScore();
			vo.setKor(n);
			System.out.print("영어 ? ");
			n = inputScore();
			vo.setEng(n);
			System.out.print("수학 ? ");
			n = inputScore();
			vo.setMat(n);

			if (score.append(vo) > 0) {
				System.out.println("추가 성공");
			} else {
				System.out.println("정원 초과로 추가 실패");
			}

		} catch (InputMismatchException e) {
			System.out.println("점수는 숫자만 입장이 가능합니다.");
		} catch (ScoreValidException e) {
			System.out.println(e.getMessage());
		} catch (KoreanValidException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("-----------------------------\n");

	}

	public void print() {
		System.out.println("\n출력...");

		for (int i = 0; i < score.getCount(); i++) {
			ScoreVO vo = score.getListData()[i];
			System.out.println(vo);
		}
		System.out.println("=====================\n");

	}

	private String inputName() throws KoreanValidException {
		String s = null;
		String regex = "^[가-?]+$";
		// ^시작, $끝, +(1개 이상)
		// [가-?]: \uac00-\ud7a3 (정규표현식)
		s = sc.next();
		if (!Pattern.matches(regex, s)) {
			// 정규표현식의 조건에 만족할 경우
			throw new KoreanValidException("이름은 한글만 입력이 가능합니다.");
		}
		return s;
	}

	private int inputScore() throws ScoreValidException, InputMismatchException {
		int s = 0;
		try {
			s = sc.nextInt();
			if (s < 0 || s > 100) {
				throw new ScoreValidException("점수는 0~100점만 가능합니다.");
			}
		} catch (InputMismatchException e) {
			sc.nextLine();// 입력받은 값을 버림
			throw e;// 예외를 다시 던짐.
		}
		return s;
	}

}
