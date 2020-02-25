package score4;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class ScoreImpl implements Score {
	private Scanner sc = new Scanner(System.in);

	// HashMap: ���ü� �������� ����
//	private Map<String, ScoreVO> map = new HashMap<>();

	// Hashtable:���ü� ����(��Ƽ �����忡�� �����ϴ�). �ӵ��� ������.
//	private Map<String, ScoreVO> map = new Hashtable<>();

	// TreeMap: Ű�� ����. ��, Ű�� ��Ÿ���� Ŭ������ Comparable �������̽��� ������ �Ǿ� �־�� �Ѵ�.
	// ���ü��� �������� �ʴ´�.
	private Map<String, ScoreVO> map = new TreeMap<>();

	@Override
	public void input() {
		System.out.println("\n�Է�");

		String hak;
		System.out.print("�й� ? ");
		hak = sc.next();

		if (map.containsKey(hak)) {
			System.out.println("��ϵ� �й��Դϴ�.");
		}

		try {
			ScoreVO vo = new ScoreVO();
			System.out.print("�̸� ? ");
			vo.setName(sc.next());

			System.out.print("���� ? ");
			vo.setKor(sc.nextInt());

			System.out.print("���� ? ");
			vo.setEng(sc.nextInt());

			System.out.print("���� ? ");
			vo.setMat(sc.nextInt());

			// map�� �����ϱ�
			map.put(hak, vo);
			System.out.println("��� �Ϸ�");
		} catch (InputMismatchException e) {
			System.out.println("������ ���ڸ� �Է��� �����մϴ�.");
			sc.nextLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void print() {
		System.out.println("\n���");
		System.out.println("�ο� ��: " + map.size());
		// 1) Iterator<String> it = map.keySet().iterator();
		// 2) 1)�� ���� �ǹ�
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
		System.out.println("\n����");

		String hak;
		System.out.print("������ �й�? ");
		hak = sc.next();

		ScoreVO vo = map.get(hak);

		if (vo == null) {
			System.out.println("�й��� �������� �ʾ� ������ �� �����ϴ�.\n");
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

			System.out.println("���� �Ϸ�!");
		} catch (InputMismatchException e) {
			System.out.println("������ ���ڸ� �Է��� �����մϴ�.");
			sc.nextLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete() {
		System.out.println("\n����");

		String hak;
		System.out.print("������ �й�?");
		hak = sc.next();

		ScoreVO vo = map.remove(hak);
		if (vo == null) {
			System.out.println("��ϵ� �ڷᰡ �ƴմϴ�.\n");
			return;
		}
		System.out.println(vo.getName() + "���� �ڷ� ���� �Ϸ�.\n");
	}

	@Override
	public void findByHak() {
		System.out.println("\n�й����� �˻�");

		String hak;
		System.out.print("�˻��� �й�?");
		hak = sc.next();

		ScoreVO vo = map.get(hak);
		if (vo == null) {
			System.out.println("�ش� �й��� �������� �ʽ��ϴ�.");
			return;
		}

		System.out.println(vo);
	}

	@Override
	public void findByName() {
		System.out.println("\n�̸����� �˻�");

		String name;
		System.out.println("�˻��� �̸�?");
		name = sc.next();

		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String hak = it.next();
			ScoreVO vo = map.get(hak);
			if (vo.getName().indexOf(name) >= 0) {// Ű���尡 �̸��� ���ԵǾ� ������
				System.out.println(vo);
			}
		}
		System.out.println();
	}

}
