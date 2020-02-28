package bookEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Library {
	private Scanner sc=new Scanner(System.in);
	
	private MemberService ms;
	private Book book;
	private BookService bs;
	private RentalService rs;
			
	public Library() {
		ms = new MemberService();
		book = new BookImpl();
		bs = new BookService(book);
		rs = new RentalService(book);
	}
	
	public MemberVO loginMember() {
		return ms.loginMember();
	}
	
	public int mainForm() {
		int ch = 0;
		
		try {
			do {
				System.out.print("1.로그인 2.회원가입 3.종료 => ");
				ch = sc.nextInt();
			} while(ch<1||ch>3);
			
			switch(ch) {
			case 1: ms.login(); break;
			case 2: ms.join(); break;
			}

		} catch (InputMismatchException e) {
			sc.nextLine();
		}
		
		return ch;
	}
	
	public void adminForm() {
		int ch;
		MemberVO lm = loginMember();
		if(lm==null || ! lm.getId().equals("admin"))
			return;
		
		System.out.println(lm.getName()+"님...");
		
		try {
			do {
				System.out.print("1.도서관리 2.회원관리 3.로그아웃 =>");
				ch = sc.nextInt();
			} while(ch<1||ch>3);
			
			switch(ch) {
			case 1:bookManage(); break;
			case 2:memberManage(); break;
			case 3:ms.logout(); break;
			}
		} catch (InputMismatchException e) {
			sc.nextInt();
		}
		
	}
	
	public void userForm() {
		int ch;
		MemberVO lm = loginMember();
		if(lm==null) return;
		
		System.out.println(lm.getName()+"님...");
		try {
			do {
				System.out.print("1.도서대여 2.도서반납 3.도서검색 4.로그아웃 => ");
				ch = sc.nextInt();
			} while(ch<1||ch>4);
			
			switch(ch) {
			case 1: rs.bookRental(loginMember()); break;
			case 2: rs.bookReturn(loginMember()); break;
			case 3: bs.findBySubject(); break;
			case 4:ms.logout(); break;
			}
		} catch (InputMismatchException e) {
			sc.nextLine();
		}
		
	}
	
	private void bookManage() {
		int ch;
		MemberVO lm = loginMember();
		if(lm==null || ! lm.getId().equals("admin"))
			return;
		
		while(true) {
			try {
				System.out.println("\n도서 관리...");
				do {
					System.out.print("1.도서등록 2.도서수정 3.리스트 4.대여리스트 5.메인 => ");
					ch = sc.nextInt();
				} while(ch<1||ch>5);
				
				if(ch==5) {
					return;
				}
				
				switch(ch) {
				case 1: bs.insertBook(); break;
				case 2: break;
				case 3: break;
				case 4: break;
				}
			} catch (InputMismatchException e) {
				sc.nextLine();
			}
			
		}
		
	}

	private void memberManage() {
		int ch;
		MemberVO lm = loginMember();
		if(lm==null || ! lm.getId().equals("admin"))
			return;
		
		while(true) {
			try {
				System.out.println("\n회원 관리...");
				do {
					System.out.print("1.회원리스트 2.아이디검색 3.이름검색 4.메인 => ");
					ch = sc.nextInt();
				} while(ch<1||ch>4);
				
				if(ch==4) {
					return;
				}
				
				switch(ch) {
				case 1: break;
				case 2: break;
				case 3: break;
				}
			} catch (InputMismatchException e) {
				sc.nextLine();
			}
		}
	}
}
