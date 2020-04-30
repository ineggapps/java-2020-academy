package score1;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch=0;
		ScoreService ss = new ScoreService();
		while (ch!=5) {
			do {
				System.out.print("1.입력 2.출력 3.검색 4.삭제 5.종료 > ");
				ch = sc.nextInt();
				if (ch == 5) {
					break;
				}
				switch (ch) {
				case 1:
					ss.input();
					break;
				case 2:
					ss.print();
					break;
				case 3:
					ss.findByName();
					break;
				case 4:
					ss.delete();
					break;
				}
			} while (ch < 1 || ch > 5);
		}
//		// 1.입력 영역
//		System.out.println("데이터 입력");
//		System.out.print("학번 ? ");
//		System.out.print("이름 ? ");
//		System.out.print("국어 ? ");
//		System.out.print("수학 ? ");
//		System.out.print("영어 ? ");
//		System.out.println("데이터가 입력되었습니다.");
//
//		// 2. 출력
//		// 1111 aaaa 80 80 80 240 80 1
//		// 3.0 3.0 3.0 9.0 3.0
//		// 2222 bbbb 70 70 70 210 70 2
//		// 2.0 2.0 2.0 6.0 2.0
//
//		// 3. 검색
//		System.out.print("이름 ? "); // aaaa 검색
//		// 1111 aaaa 80 80 80 240 80 1
//		// 3.0 3.0 3.0 9.0 3.0

	}
}
