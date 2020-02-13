package score1;

import java.util.Arrays;
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
		//��� ���� ���� ����ϱ�
		//�Է��� �� �Ź� ���� ����ϴ� ��� ����ϱ� ���� �� ���� �����ϱ� ����
		setRank(list,cnt);
		System.out.println("������ ���...");
		System.out.println("�й�\t�̸�\t����\t����\t����\t����\t���\t����");
		System.out.println("========================");
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%s\t%s\t", list[i].hak, list[i].name);
			for (int j = 0; j < list[i].score.length; j++) {
				System.out.print(list[i].score[j] + "\t");
			}
			System.out.printf("%d\t%d\t%d\t\n", list[i].tot, score.getAve(list[i].score), list[i].rank);
			System.out.print("\t\t");
			double tot=0;
			for(int j=0;j<3;j++) {
				tot+=score.getGrade(list[i].score[j]);
				System.out.print(score.getGrade(list[i].score[j])+"\t");
			}
			System.out.print(tot+"\t");
			System.out.printf("%.1f",tot/list[i].score.length);
			System.out.println();
		}
		
	}

	public void findByName() {
		// ���� �˻� ����
		System.out.println("�̸� �˻�");
		System.out.print("�˻��� �̸� ? ");
		String name = sc.next();
		for (int i = 0; i < cnt; i++) {
//			if(name.equals(list[i].name)) {//name�� ���ڿ� ���� ������
			if (list[i].name.startsWith(name)) {// ���ڿ� ���� name���� �����ϸ� (�պκ� �˻�)
				System.out.println("�й�\t�̸�\t����");
				System.out.printf("%s\t%s\t%d\n", list[i].hak, list[i].name, list[i].tot);
				break;
			} else if (i == cnt - 1) {
				System.out.println("�˻� ��� ����");
			}
		}
	}

	public void delete() {
		System.out.println("������ ����...");
		// �й��� �ߺ����� �ʰ� �ԷµǾ��ٴ� ���� �Ͽ� ���� ����� �����Ѵ�.
		System.out.print("������ �׸��� �й� ? ");
		String hak = sc.next();
		boolean b = false;
		for (int i = 0; i < cnt; i++) {
			if (hak.equals(list[i].hak)) {
				// ã������ �迭 ����
				for (int j = i; j < cnt; j++) {
					list[j] = list[j + 1];
				}
				list[--cnt] = null;
				b=true;
				break;
			}
		}
		if(!b) {
			System.out.println("��ϵ� �ڷᰡ �ƴմϴ�. (�й��� ã�� ���� ���)");
		}else {
			System.out.println("�����Ǿ����ϴ�.");
		}
	}
	
	private void setRank(ScoreVO[] list,int length) {
		for (int i = 0; i < length; i++) {
			list[i].rank = 1;
		}
		for (int i = 0; i < length-1; i++) {
			for (int j = i+1; j < length; j++) {
				if (list[i].tot < list[j].tot) {
					list[i].rank++;
				} else if(list[i].tot > list[j].tot){
					list[j].rank++;
				}else {
					//�������� ��� ī��Ʈ���� �ʾƾ� �ϴϱ�!
				}
			}
		}
	}
}
