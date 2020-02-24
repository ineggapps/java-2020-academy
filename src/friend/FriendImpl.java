package friend;

import java.util.ArrayList;
import java.util.List;

public class FriendImpl implements Friend {

	List<FriendVO> list = new ArrayList<>();

	@Override
	public void input() {
		System.out.println("\n친구 등록");
		
		//동일한 이름과 동일한 전화번호가 있으면 등록 불가능
		
		
	}

	@Override
	public void print() {
		System.out.println("\n친구 목록...");
		//이름, 전화번호, 주소, 생년월일, 나이(메서드 만들어서)
		
		//한 화면에 10개씩
	}

	@Override
	public void findByName() {
		System.out.println("\n이름 검색...");
		//앞부분과 일치해도 검색 (홍길동의 '홍'자만 입력해도 검색이 되도록)
		
	}

	@Override
	public void update() {
		System.out.println("\n정보 수정...");

	}

	@Override
	public void delete() {
		System.out.println("\n친구 삭제...");
		//이름과 전화번호가 동일한 데이터 삭제
		//이름, 전화번호, 주소, 생년월일 모두 수정
		//	이름과 전화번호가 자신이 아닌 다른 사람과 일치하면 수정 불가능
		
	}

	private FriendVO readFriend(String name, String tel) {
		//이름과 전화번호가 동일한 친구를 검색
		
		return null;
	}
}
