package bookEx;

public class LibraryService {
	private MemberVO loginMember = null;
	
	public LibraryService(MemberVO loginMember) {
		this.loginMember = loginMember;
	}
	
	public void rental() {
		System.out.println("���� �뿩...\n");
		System.out.println("�̸� : " + loginMember.getName());
	}
	
}
