package member;

public class MemberImpl implements Member {

	@Override
	public void input() {
		System.out.println("\n�Է�");
	}

	@Override
	public void print() {
		System.out.println("\n���");

	}

	@Override
	public void update() {
		System.out.println("\n����");

	}

	@Override
	public void delete() {
		System.out.println("\n����");

	}

	@Override
	public void findByEmail() {
		System.out.println("\n�̸��Ϸ� �˻�");

	}

	@Override
	public void findByName() {
		System.out.println("\n�̸����� �˻�");

	}

}
