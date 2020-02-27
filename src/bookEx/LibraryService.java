package bookEx;

public class LibraryService {
	private MemberVO loginMember = null;
	
	public LibraryService(MemberVO loginMember) {
		this.loginMember = loginMember;
	}
	
	public void rental() {
		System.out.println("도서 대여...\n");
		System.out.println("이름 : " + loginMember.getName());
	}
	
}
