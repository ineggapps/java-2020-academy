package bookEx;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MemberService ms = new MemberService();
		Library lib = new Library(ms);
		
		MemberVO loginMember = null;
		int ch;
		
		try {
			System.out.println("** 도서관 **"); 
			while(true) {
				System.out.println("\n[메인 메뉴]");
				
				loginMember = ms.loginMember();
				
				if(loginMember == null) {
					do {
						System.out.print("1.로그인 2.회원가입 3.종료 => ");
						ch = sc.nextInt();
					} while(ch<1||ch>3);
					
					if(ch==3) {
						break; // System.exit(0);
					}
					
					switch(ch) {
					case 1: ms.login(); break;
					case 2: ms.join(); break;
					}
				} else if(loginMember.getId().equals("admin")) {
					lib.adminMenu();
				} else {
					lib.userMenu();
				}
			}
		} finally {
			sc.close();
		}
	}
}
