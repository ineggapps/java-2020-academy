package member;

public class MemberImpl implements Member {

	@Override
	public void input() {
		System.out.println("\n입력");
	}

	@Override
	public void print() {
		System.out.println("\n출력");

	}

	@Override
	public void update() {
		System.out.println("\n수정");

	}

	@Override
	public void delete() {
		System.out.println("\n삭제");

	}

	@Override
	public void findByEmail() {
		System.out.println("\n이메일로 검색");

	}

	@Override
	public void findByName() {
		System.out.println("\n이름으로 검색");

	}

}
