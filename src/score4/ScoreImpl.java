package score4;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class ScoreImpl implements Score {
	private Scanner sc = new Scanner(System.in);

	// HashMap: 동시성 지원하지 않음
//	private Map<String, ScoreVO> map = new HashMap<>();

	// Hashtable:동시성 지원(멀티 쓰레드에서 안전하다). 속도가 느리다.
//	private Map<String, ScoreVO> map = new Hashtable<>();

	// TreeMap: 키로 정렬. 단, 키를 나타내는 클래스는 Comparable 인터페이스로 구현이 되어 있어야 한다.
	// 동시성을 지원하지 않는다.
	private Map<String, ScoreVO> map = new TreeMap<>();

	@Override
	public void input() {
		System.out.println("\n입력");

		String hak;
		System.out.print("학번 ? ");
		hak = sc.next();

		if (map.containsKey(hak)) {
			System.out.println("등록된 학번입니다.");
		}

		try {
			ScoreVO vo = new ScoreVO();
			System.out.print("이름 ? ");
			vo.setName(sc.next());

			System.out.print("국어 ? ");
			vo.setKor(sc.nextInt());

			System.out.print("영어 ? ");
			vo.setEng(sc.nextInt());

			System.out.print("수학 ? ");
			vo.setMat(sc.nextInt());

			// map에 저장하기
			map.put(hak, vo);
			System.out.println("등록 완료");
		} catch (InputMismatchException e) {
			System.out.println("점수는 숫자만 입력이 가능합니다.");
			sc.nextLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void print() {
		System.out.println("\n출력");
		System.out.println("인원 수: " + map.size());
		// 1) Iterator<String> it = map.keySet().iterator();
		// 2) 1)과 같은 의미
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();

		while (it.hasNext()) {
			String hak = it.next();
			ScoreVO vo = map.get(hak);
			System.out.println(vo);
		}
		System.out.println();
	}

	@Override
	public void update() {
		System.out.println("\n수정");

		String hak;
		System.out.print("수정할 학번? ");
		hak = sc.next();

		ScoreVO vo = map.get(hak);

		if (vo == null) {
			System.out.println("학번이 존재하지 않아 수정할 수 없습니다.\n");
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

			System.out.println("수정 완료!");
		} catch (InputMismatchException e) {
			System.out.println("점수는 숫자만 입력이 가능합니다.");
			sc.nextLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete() {
		System.out.println("\n삭제");

		String hak;
		System.out.print("삭제할 학번?");
		hak = sc.next();

		ScoreVO vo = map.remove(hak);
		if (vo == null) {
			System.out.println("등록된 자료가 아닙니다.\n");
			return;
		}
		System.out.println(vo.getName() + "님의 자료 삭제 완료.\n");
	}

	@Override
	public void findByHak() {
		System.out.println("\n학번으로 검색");

		String hak;
		System.out.print("검색할 학번?");
		hak = sc.next();

		ScoreVO vo = map.get(hak);
		if (vo == null) {
			System.out.println("해당 학번은 존재하지 않습니다.");
			return;
		}

		System.out.println(vo);
	}

	@Override
	public void findByName() {
		System.out.println("\n이름으로 검색");

		String name;
		System.out.println("검색할 이름?");
		name = sc.next();

		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String hak = it.next();
			ScoreVO vo = map.get(hak);
			if (vo.getName().indexOf(name) >= 0) {// 키워드가 이름에 포함되어 있으면
				System.out.println(vo);
			}
		}
		System.out.println();
	}

}
