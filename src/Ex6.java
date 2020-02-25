import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex6 {
	public static void main(String[] args) {
		List<UserVO> list = new ArrayList<UserVO>();
		list.add(new UserVO("도도도", "010", 26));
		list.add(new UserVO("후후후", "011", 20));
		list.add(new UserVO("가가가", "012", 22));
		list.add(new UserVO("마마마", "013", 25));
		list.add(new UserVO("마가가", "014", 23));

		print("정렬 전", list);

		// 정렬
		// 크기 순으로 정렬: Comparable 인터페이스가 구현된 클래스만 가능
		// Collection.sort(list); //컴오류 - Comparable 인터페이스가 구현되어 있지 않기 때문이다.
		// (이해용 설명)
		// UserVO는 이름, 전화번호, 나이를 담고 있는데 무엇을 기준으로 정렬할지 알려주기
		// compareTo(UserVO o) 메서드를 오버라이딩한 후 Collections의 sort메서드를 호출한다.
		Collections.sort(list);

		print("정렬 후", list);
	}

	public static void print(String title, List<UserVO> list) {
		System.out.println(title);
		for (UserVO vo : list) {
			System.out.println(vo);
		}
	}
}

class UserVO implements Comparable<UserVO> {
	// Comparable(비교할 만한) 인터페이스가 구현된 클래스 가능
	private String name;
	private String tel;
	private int age;

	public UserVO() {

	}

	public UserVO(String name, String tel, int age) {
		this.name = name;
		this.tel = tel;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// comparableTo: Comparable메서드로 정렬 기준을 설정한다
	// String 클래스의 compareTo - 사전 식으로 비교
	// 혼동 유의

	@Override
	public int compareTo(UserVO o) {
//		 String클래스의 compareTo(): 문자열을 사전 식으로 비교
//		 return name.compareTo(o.getName());//이름 오름차순 비교
//		 return -name.compareTo(o.getName());//이름 내림차순 비교
		return age - o.getAge();// 나이 오름차순
//		 return -(age-(o.getAge())); //나이 내림차
	}

	@Override
	public String toString() {
		return "UserVO [name=" + name + ", tel=" + tel + ", age=" + age + "]";
	}

}