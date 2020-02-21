package score2;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ScoreService {
	private Scanner sc = new Scanner(System.in);
	private Score score = new ScoreImpl();// ¾÷Ä³½ºÆÃ

	public void input() {
		System.out.println("\nÀÔ·Â...");

		try {
			String s;
			int n;
			ScoreVO vo = new ScoreVO();
			System.out.print("ÇÐ¹ø ? ");
			vo.setHak(sc.next());
			System.out.print("ÀÌ¸§ ? ");
			s = inputName();
			vo.setName(s);
			System.out.print("±¹¾î ? ");
			n = inputScore();
			vo.setKor(n);
			System.out.print("¿µ¾î ? ");
			n = inputScore();
			vo.setEng(n);
			System.out.print("¼öÇÐ ? ");
			n = inputScore();
			vo.setMat(n);

			if (score.append(vo) > 0) {
				System.out.println("Ãß°¡ ¼º°ø");
			} else {
				System.out.println("Á¤¿ø ÃÊ°ú·Î Ãß°¡ ½ÇÆÐ");
			}

		} catch (InputMismatchException e) {
			System.out.println("Á¡¼ö´Â ¼ýÀÚ¸¸ ÀÔÀåÀÌ °¡´ÉÇÕ´Ï´Ù.");
		} catch (ScoreValidException e) {
			System.out.println(e.getMessage());
		} catch (KoreanValidException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("-----------------------------\n");

	}

	public void print() {
		System.out.println("\nÃâ·Â...");

		for (int i = 0; i < score.getCount(); i++) {
			ScoreVO vo = score.getListData()[i];
			System.out.println(vo);
		}
		System.out.println("=====================\n");

	}

	private String inputName() throws KoreanValidException {
		String s = null;
		String regex = "^[°¡-ÆR]+$";
		// ^½ÃÀÛ, $³¡, +(1°³ ÀÌ»ó)
		// [°¡-ÆR]: \uac00-\ud7a3 (Á¤±ÔÇ¥Çö½Ä)
		s = sc.next();
		if (!Pattern.matches(regex, s)) {
			// Á¤±ÔÇ¥Çö½ÄÀÇ Á¶°Ç¿¡ ¸¸Á·ÇÒ °æ¿ì
			throw new KoreanValidException("ÀÌ¸§Àº ÇÑ±Û¸¸ ÀÔ·ÂÀÌ °¡´ÉÇÕ´Ï´Ù.");
		}
		return s;
	}

	private int inputScore() throws ScoreValidException, InputMismatchException {
		int s = 0;
		try {
			s = sc.nextInt();
			if (s < 0 || s > 100) {
				throw new ScoreValidException("Á¡¼ö´Â 0~100Á¡¸¸ °¡´ÉÇÕ´Ï´Ù.");
			}
		} catch (InputMismatchException e) {
			sc.nextLine();// ÀÔ·Â¹ÞÀº °ªÀ» ¹ö¸²
			throw e;// ¿¹¿Ü¸¦ ´Ù½Ã ´øÁü.
		}
		return s;
	}

}
