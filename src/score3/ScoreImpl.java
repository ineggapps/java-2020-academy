package score3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl implements Score {
	private List<ScoreVO> list = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);

	@Override
	public void input() {
		System.out.println("\n데이터 입력...");
		try {
			ScoreVO vo = new ScoreVO();
			System.out.print("학번 ? ");
			vo.setHak(sc.next());
			// 이미 등록된 학번이 있는지 검색한다.
			if (readScore(vo.getHak()) != null) {
				System.out.println("등록된 학번입니다.");
				return;
			}

			System.out.print("이름 ? ");
			vo.setName(sc.next());

			System.out.print("국어 ? ");
			vo.setKor(sc.nextInt());

			System.out.print("영어 ? ");
			vo.setEng(sc.nextInt());

			System.out.print("수학 ? ");
			vo.setMat(sc.nextInt());

			// ArrayList에 저장
			list.add(vo);

			System.out.println("등록 완료...\n");
		} catch (InputMismatchException e) {
			System.out.println("점수는 숫자만 입력이 가능합니다.");
			sc.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void print() {
		System.out.println("\n데이터 출력...");

		// 학번순 정렬
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {
			// 정렬을 위한 재료 만들기
			@Override
			public int compare(ScoreVO o1, ScoreVO o2) {
				// TODO Auto-generated method stub
				return o1.getHak().compareTo(o2.getHak());
			}
		};
		Collections.sort(list, comp);

		for (ScoreVO vo : list) {
			System.out.print(vo.getHak() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMat() + "\t");
			System.out.println(vo.getTot());
		}
		System.out.println();
	}

	@Override
	public void findByHak() {
		System.out.println("\n학번 검색...");
		String hak;
		int tot;
		System.out.println("검색할 학번? ");
		hak = sc.next();
		System.out.println("학번 검색 결과");
		ScoreVO vo = readScore(hak);

		if (vo == null) {
			System.out.println("등록된 학번이 아닙니다");
			return;
		}

		System.out.print(vo.getHak() + "\t");
		System.out.print(vo.getName() + "\t");
		System.out.print(vo.getKor() + "\t");
		System.out.print(vo.getEng() + "\t");
		System.out.print(vo.getMat() + "\t");
		System.out.println(vo.getTot());
		System.out.println();
	}

	@Override
	public void findByName() {
		System.out.println("\n이름 검색...");
		String name;

		System.out.print("검색할 이름? ");
		name = sc.next();

		System.out.println(name + "님 검색 결과");
		for (ScoreVO vo : list) {
			if (vo.getName().startsWith(name)) {
				int tot = vo.getKor() + vo.getEng() + vo.getMat();
				System.out.print(vo.getHak() + "\t");
				System.out.print(vo.getName() + "\t");
				System.out.print(vo.getKor() + "\t");
				System.out.print(vo.getEng() + "\t");
				System.out.print(vo.getMat() + "\t");
				System.out.println(tot);
			}
		}
	}

	@Override
	public void update() {
		System.out.println("\n데이터 수정...");
		String hak;
		System.out.print("수정할 학번 ? ");
		hak = sc.next();

		ScoreVO vo = readScore(hak);
		if (vo == null) {
			System.out.println("등록된 학번이 아닙니다.");
			return;
		}

		try {
			System.out.print("이름 ? ");
			vo.setName(sc.next());

			System.out.print("국어 ? ");
			vo.setKor(sc.nextInt());

			System.out.print("영어 ? ");
			vo.setEng(sc.nextInt());

			System.out.print("수학 ? ");
			vo.setMat(sc.nextInt());

			System.out.println("데이터 수정 완료\n");
		} catch (InputMismatchException e) {
			System.out.println("점수는 숫자만 입력이 가능합니다.");
			sc.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void remove() {
		System.out.println("\n데이터 삭제...");
		String hak;
		System.out.print("삭제할 학번 ? ");
		hak = sc.next();

		ScoreVO vo = readScore(hak);
		if (vo == null) {
			System.out.println("등록된 학번이 아닙니다.");
			return;
		}

		list.remove(vo);
		System.out.println("데이터 삭제 완료...\n");
	}

	// 등록된 학번을 기준으로 검색하여 ScoreVO객체를 찾는다.
	private ScoreVO readScore(String hak) {
		ScoreVO vo = null;
		for (ScoreVO v : list) {
			if (v.getHak().equals(hak)) {
				return v;
			}
		}
		return vo;
	}

	@Override
	public void toDescPrint() {
		System.out.println("\n데이터 출력(총점 내림차순)");

		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {
			@Override
			public int compare(ScoreVO o1, ScoreVO o2) {
				return -(o1.getTot() - o2.getTot());
			}
		};
		Collections.sort(list, comp);

		for (ScoreVO vo : list) {
			System.out.print(vo.getHak() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMat() + "\t");
			System.out.println(vo.getTot());
		}
		System.out.println();
	}

}
