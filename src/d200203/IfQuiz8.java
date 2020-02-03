package d200203;

import java.util.Scanner;

public class IfQuiz8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int midScore, finalScore, ab, reportScore;
		int midResult = 0, finalResult = 0, atResult = 0, reportResult = 0;
		int total = 0;
		String stuNum, name;
		char grade;

		System.out.print("학번? ");
		// 00학번을 받을 수 있다. cf)우편번호, 전화번호, 계좌번호, 신용카드번호 는 문자열로 입력받는 것을 전제로 한다.
		stuNum = sc.next();
		System.out.print("이름? ");
		name = sc.next();
		System.out.print("중간고사 점수? ");
		midScore = sc.nextInt();
		System.out.print("기말고사 점수? ");
		finalScore = sc.nextInt();
		System.out.print("결석 횟수? ");
		ab = sc.nextInt();
		System.out.print("레포트 점수? ");
		reportScore = sc.nextInt();


		// 출석점수 계산
		if (ab >= 6) {
			atResult = 0;
		} else if (ab >= 4) {
			atResult = 60;
		} else if (ab >= 2) {
			atResult = 80;
		} else {
			atResult = 100;
		}

//		if (ab >= 0 && ab <= 1) {
//			atResult = 100;
//		} else if (ab >= 2 && ab <= 3) {
//			atResult = 80;
//		} else if (ab >= 4 && ab <= 5) {
//			atResult = 50;
//		} else if (ab >= 6) {
//			atResult = 0;
//		}

		total += midResult += midScore * 0.4;
		total += finalResult += finalScore * 0.4;
		total += atResult *= 0.1;
		total += reportResult += reportScore * 0.1;

		if (total >= 90) {
			grade = 'A';
		} else if (total >= 80) {
			grade = 'B';
		} else if (total >= 70) {
			grade = 'C';
		} else if (total >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.println("학번\t이름\t중간고사\t기말고사\t출석점수\t레포트\t\t합산점수\t학점");
		System.out.format("%s\t%s\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%c", 
				stuNum, name, midResult, finalResult, atResult,reportResult, total, grade);

		sc.close();

	}
}
