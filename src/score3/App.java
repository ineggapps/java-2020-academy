package score3;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Score ss = new ScoreImpl();
		int ch;
		try {
			while (true) {
				do {
					System.out.print("1.입력 2.출력 3.학번검색 4.이름검색 5.수정 6.삭제 7.총점순 8.종료 > ");
					ch = sc.nextInt();
				} while (ch < 1 || ch > 8);
				if (ch == 8) {// 종료
					break;
				}
				switch (ch) {
				case 1:// 1. 입력
					ss.input();
					break;
				case 2:// 2. 출력
					ss.print();
					break;
				case 3:// 3. 학번 검색
					ss.findByHak();
					break;
				case 4:// 4. 이름 섬색
					ss.findByName();
					break;
				case 5:// 5. 수정
					ss.update();
					break;
				case 6:// 6. 삭제
					ss.remove();
					break;
				case 7: //7. 총점순 출력
					ss.toDescPrint();
					break;
				}
			}
		} finally {
			System.out.println("종료");
			sc.close();
		}
	}
}
