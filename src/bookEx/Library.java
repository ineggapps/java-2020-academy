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
		
		System.out.println(loginMember.getName()+"��...");
		do {
			System.out.print("1.�������� 2.ȸ������ 3.�α׾ƿ� =>");
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
		
		System.out.println(loginMember.getName()+"��...");
		do {
			System.out.print("1.�����뿩 2.�����ݳ� 3.�����˻� 4.�α׾ƿ� =>");
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
		
		System.out.println("���� ����...\n");
	}

	private void memberManage() {
		MemberVO loginMember = ms.loginMember();
		if(loginMember==null || ! loginMember.getId().equals("admin"))
			return;
		
		System.out.println("ȸ�� ����...\n");
	}
	
}
