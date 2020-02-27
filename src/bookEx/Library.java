package bookEx;

import java.util.Scanner;

public class Library {
	private Scanner sc=new Scanner(System.in);
	private MemberService ms;
	
	public Library(MemberService ms) {
		this.ms = ms;
	}
	
	public void adminMenu() {
		int ch;
		MemberVO loginMember = ms.loginMember();
		if(loginMember==null || ! loginMember.getId().equals("admin"))
			return;
		
		System.out.println(loginMember.getName()+"님...");
		do {
			System.out.print("1.도서관리 2.회원관리 3.로그아웃 =>");
			ch = sc.nextInt();
		} while(ch<1||ch>3);
		
		switch(ch) {
		case 1:bookManage(); break;
		case 2:memberManage(); break;
		case 3:ms.logout(); break;
		}
		
	}
	
	public void userMenu() {
		int ch;
		MemberVO loginMember = ms.loginMember();
		if(loginMember==null)
			return;
		
		System.out.println(loginMember.getName()+"님...");
		do {
			System.out.print("1.도서대여 2.도서반납 3.도서검색 4.로그아웃 =>");
			ch = sc.nextInt();
		} while(ch<1||ch>4);
		
		switch(ch) {
		case 1:break;
		case 2:break;
		case 3:break;
		case 4:ms.logout(); break;
		}
	}
	
	private void bookManage() {
		MemberVO loginMember = ms.loginMember();
		if(loginMember==null || ! loginMember.getId().equals("admin"))
			return;
		
		System.out.println("도서 관리...\n");
	}

	private void memberManage() {
		MemberVO loginMember = ms.loginMember();
		if(loginMember==null || ! loginMember.getId().equals("admin"))
			return;
		
		System.out.println("회원 관리...\n");
	}
	
}
