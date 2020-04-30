package bookEx;

public class App {
	public static void main(String[] args) {
		Library lib = new Library();
		MemberVO loginMember = null;
		int ch;
		
		System.out.println("** 도서관 **"); 
		while(true) {
			System.out.println("\n[메인 메뉴]");
			
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

	}
}
