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
				System.out.print("1.�α��� 2.ȸ������ 3.���� => ");
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
		
		System.out.println(lm.getName()+"��...");
		
		try {
			do {
				System.out.print("1.�������� 2.ȸ������ 3.�α׾ƿ� =>");
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
		
		System.out.println(lm.getName()+"��...");
		try {
			do {
				System.out.print("1.�����뿩 2.�����ݳ� 3.�����˻� 4.�α׾ƿ� => ");
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
				System.out.println("\n���� ����...");
				do {
					System.out.print("1.������� 2.�������� 3.����Ʈ 4.�뿩����Ʈ 5.���� => ");
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
				System.out.println("\nȸ�� ����...");
				do {
					System.out.print("1.ȸ������Ʈ 2.���̵�˻� 3.�̸��˻� 4.���� => ");
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
