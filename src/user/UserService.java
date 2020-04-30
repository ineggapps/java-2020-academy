package user;

import java.util.Scanner;

public class UserService {
	private Scanner sc = new Scanner(System.in);
	private User user = new User();
	//생성자를 통해 의존 관계를 설정한다.
	private UserResult ur = new UserResult(user);

	public void input() {
		System.out.println("\n자료 등록...");

		UserVO vo = new UserVO();

		//이름 입력
		System.out.print("이름 ? ");
		vo.setName(sc.next());
	
		//나이 입력
		System.out.print("나이 ? ");
		vo.setAge(sc.nextInt());

		user.append(vo);
		System.out.println(vo.getName() + "님 자료 등록 완료...");
	}

	public void print() {
		ur.write();
	}

}
