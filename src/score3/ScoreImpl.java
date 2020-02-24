package score3;

public class ScoreImpl implements Score {

	@Override
	public void input() {
		System.out.println("\n데이터 입력...");
	}

	@Override
	public void print() {
		System.out.println("\n데이터 출력...");
	}

	@Override
	public void findByHak() {
		System.out.println("\n학번 검색...");
	}

	@Override
	public void findByName() {
		System.out.println("\n이름 검색...");
	}

	@Override
	public void update() {
		System.out.println("\n데이터 수정...");
	}

	@Override
	public void remove() {
		System.out.println("\n데이터 삭제...");

	}

}
