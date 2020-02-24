package friend;

import java.util.Scanner;

public class FriendApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;
		Friend fr = new FriendImpl();

		try {
			while (true) {
				do {
					System.out.print("1.등록 2.출력 3.이름검색 4.수정 5.삭제 6.종료 > ");
					ch = sc.nextInt();
				} while (ch < 1 || ch > 6);

				if (ch == 6) {
					break;
				}

				switch (ch) {
				case 1:// 등록
					fr.input();
					break;
				case 2:// 출력
					fr.print();
					break;
				case 3:// 이름검색
					fr.findByName();
					break;
				case 4:// 수정
					fr.update();
					break;
				case 5:// 삭제
					fr.delete();
					break;

				}
			}
		} finally {
			System.out.println("프로그램을 종료합니다.");
			sc.close();
		}
	}
}
