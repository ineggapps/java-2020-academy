package score3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl implements Score {
	private List<ScoreVO> list = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);

	@Override
	public void input() {
		System.out.println("\n������ �Է�...");
		try {
			ScoreVO vo = new ScoreVO();
			System.out.print("�й� ? ");
			vo.setHak(sc.next());
			// �̹� ��ϵ� �й��� �ִ��� �˻��Ѵ�.
			if (readScore(vo.getHak()) != null) {
				System.out.println("��ϵ� �й��Դϴ�.");
				return;
			}

			System.out.print("�̸� ? ");
			vo.setName(sc.next());

			System.out.print("���� ? ");
			vo.setKor(sc.nextInt());

			System.out.print("���� ? ");
			vo.setEng(sc.nextInt());

			System.out.print("���� ? ");
			vo.setMat(sc.nextInt());

			// ArrayList�� ����
			list.add(vo);

			System.out.println("��� �Ϸ�...\n");
		} catch (InputMismatchException e) {
			System.out.println("������ ���ڸ� �Է��� �����մϴ�.");
			sc.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void print() {
		System.out.println("\n������ ���...");
		int tot;

		for (ScoreVO vo : list) {
			tot = vo.getKor() + vo.getEng() + vo.getMat();
			System.out.print(vo.getHak() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMat() + "\t");
			System.out.println(tot);
		}
		System.out.println();
	}

	@Override
	public void findByHak() {
		System.out.println("\n�й� �˻�...");
		String hak;
		int tot;
		System.out.println("�˻��� �й�? ");
		hak =sc.next();
		System.out.println("�й� �˻� ���");
		ScoreVO vo = readScore(hak);

		if(vo==null) {
			System.out.println("��ϵ� �й��� �ƴմϴ�");
			return;
		}
		
		tot = vo.getKor() + vo.getEng() + vo.getMat();
		System.out.print(vo.getHak() + "\t");
		System.out.print(vo.getName() + "\t");
		System.out.print(vo.getKor() + "\t");
		System.out.print(vo.getEng() + "\t");
		System.out.print(vo.getMat() + "\t");
		System.out.println(tot);
	}

	@Override
	public void findByName() {
		System.out.println("\n�̸� �˻�...");
		String name;
		
		System.out.print("�˻��� �̸�? ");
		name = sc.next();
		
		System.out.println(name+"�� �˻� ���");
		for(ScoreVO vo: list) {
			if(vo.getName().startsWith(name)) {
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
		System.out.println("\n������ ����...");
		String hak;
		System.out.print("������ �й� ? ");
		hak = sc.next();

		ScoreVO vo = readScore(hak);
		if (vo == null) {
			System.out.println("��ϵ� �й��� �ƴմϴ�.");
			return;
		}

		try {
			System.out.print("�̸� ? ");
			vo.setName(sc.next());

			System.out.print("���� ? ");
			vo.setKor(sc.nextInt());

			System.out.print("���� ? ");
			vo.setEng(sc.nextInt());

			System.out.print("���� ? ");
			vo.setMat(sc.nextInt());
		} catch (InputMismatchException e) {
			System.out.println("������ ���ڸ� �Է��� �����մϴ�.");
			sc.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void remove() {
		System.out.println("\n������ ����...");
		String hak;
		System.out.print("������ �й� ? ");
		hak = sc.next();

		ScoreVO vo = readScore(hak);
		if (vo == null) {
			System.out.println("��ϵ� �й��� �ƴմϴ�.");
			return;
		}
		
		list.remove(vo);
		System.out.println("������ ���� �Ϸ�...\n");
	}

	// ��ϵ� �й��� �������� �˻��Ͽ� ScoreVO��ü�� ã�´�.
	private ScoreVO readScore(String hak) {
		ScoreVO vo = null;
		for (ScoreVO v : list) {
			if (v.getHak().equals(hak)) {
				return v;
			}
		}
		return vo;
	}

}
