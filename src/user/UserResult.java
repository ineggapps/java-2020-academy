package user;

public class UserResult {

	private User user;

	public UserResult(User user){
		this.user = user;
	}

	public void write() {
		System.out.println("\n데이터 출력...");
		int cnt = user.getCount();
		UserVO[] list = user.getDataList();
		for(int i=0;i<cnt;i++) {
			UserVO vo = list[i];
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getAge() + "\t");
			System.out.print(adult(vo.getAge()) + "\n");
		}
	}

	public String adult(int age) {
		return age >= 19 ? "성인" : "미성년자";
	}
}
