package member;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member mb = new MemberImpl();
		int ch;
		try {
			while (true) {
				do {
					System.out.print("1.입력 2.출력 3.수정 4.탈퇴 5.이메일검색 6.이름검색 7.종료");
					ch = sc.nextInt();
				} while (ch < 1 || ch > 7);
				if (ch == 7) {
					break;
				}
				switch (ch) {
				case 1:// 입력
					mb.input();
					break;
				case 2:// 출력
					mb.print();
					break;
				case 3:// 수정
					mb.update();
					break;
				case 4:// 탈퇴
					mb.delete();
					break;
				case 5:// 이메일검색
					mb.findByEmail();
					break;
				case 6:// 이름검색
					mb.findByName();
					break;
				}
			}
		} finally {
			sc.close();
		}
	}
}
