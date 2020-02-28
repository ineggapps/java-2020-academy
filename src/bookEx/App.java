package bookEx;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Library lib = new Library();
		
		MemberVO loginMember = null;
		int ch;
		
		try {
			System.out.println("** ������ **"); 
			while(true) {
				System.out.println("\n[���� �޴�]");
				
				loginMember = lib.loginMember();
				if(loginMember == null) {
					ch = lib.mainForm();
					if(ch==3) {
						break;
					}
				} else if(loginMember.getId().equals("admin")) {
					lib.adminForm();
				} else {
					lib.userForm();
				}
			}
		} finally {
			sc.close();
		}
	}
}
