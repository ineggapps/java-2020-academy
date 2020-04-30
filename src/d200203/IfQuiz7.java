package d200203;

import java.util.Scanner;

public class IfQuiz7 {
	// 이름과 세 과목 점수를 입력 받아 합격 여부를 판단하는 프로그램
	// 세 과목 점수가 모두 40점 이상이고 평균이 60점 이상이면 합격
	// 평균이 60점 이상이지만 한 과목이라도 40점 미만이면 과락
	// 그렇지 않으면 불합격
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int sub1, sub2, sub3;
		double avg;

		System.out.print("이름 입력: ");
		name = sc.next();

		System.out.print("세 과목 점수 입력: ");
		sub1 = sc.nextInt();
		sub2 = sc.nextInt();
		sub3 = sc.nextInt();
		avg = (double)(sub1 + sub2 + sub3) / 3;

//		if (avg > 60) {
//			if (sub1 > 40 && sub2 > 40 && sub3 > 40) {
//				System.out.printf("%s님은 합격입니다.\n", name);
//			} else {
//				System.out.printf("%s님은 과락입니다.\n", name);
//			}
//		} else {
//			System.out.printf("%s님은 불합격입니다.\n", name);
//		}

		if (sub1 > 40 && sub2 > 40 && sub3 > 40 && avg>=60) {
				System.out.printf("%s님은 합격입니다.",name);
		}
		else if(avg<60) {
			System.out.printf("%s님은 불합격입니다.",name);			
		}
		else {
			//else에 걸리는 조건: (sub1 < 40 && sub2 < 40 && sub3 < 40) && avg>=60
			System.out.printf("%s님은 과락입니다.\n",name);
		}

		sc.close();

	}
}
