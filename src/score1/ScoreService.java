package score1;

import java.util.Arrays;
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
		//출력 전에 석차 계산하기
		//입력할 때 매번 석차 계산하는 대신 출력하기 전에 한 번만 수행하기 위함
		setRank(list,cnt);
		System.out.println("데이터 출력...");
		System.out.println("학번\t이름\t국어\t수학\t영어\t총점\t평균\t석차");
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
		// 순차 검색 구현
		System.out.println("이름 검색");
		System.out.print("검색할 이름 ? ");
		String name = sc.next();
		for (int i = 0; i < cnt; i++) {
//			if(name.equals(list[i].name)) {//name과 문자열 값이 같으면
			if (list[i].name.startsWith(name)) {// 문자열 값이 name으로 시작하면 (앞부분 검색)
				System.out.println("학번\t이름\t총점");
				System.out.printf("%s\t%s\t%d\n", list[i].hak, list[i].name, list[i].tot);
				break;
			} else if (i == cnt - 1) {
				System.out.println("검색 결과 없음");
			}
		}
	}

	public void delete() {
		System.out.println("데이터 삭제...");
		// 학번은 중복되지 않게 입력되었다는 가정 하에 삭제 기능을 구현한다.
		System.out.print("삭제할 항목의 학번 ? ");
		String hak = sc.next();
		boolean b = false;
		for (int i = 0; i < cnt; i++) {
			if (hak.equals(list[i].hak)) {
				// 찾았으면 배열 당기기
				for (int j = i; j < cnt; j++) {
					list[j] = list[j + 1];
				}
				list[--cnt] = null;
				b=true;
				break;
			}
		}
		if(!b) {
			System.out.println("등록된 자료가 아닙니다. (학번을 찾지 못한 경우)");
		}else {
			System.out.println("삭제되었습니다.");
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
					//동점자일 경우 카운트하지 않아야 하니까!
				}
			}
		}
	}
}
