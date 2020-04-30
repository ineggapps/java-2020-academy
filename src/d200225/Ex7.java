package d200225;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex7 {
	public static void main(String[] args) {
		// Ex6 ArrayListSort를 다른 방법으로 정렬
		// 이 방법은 기억하기.
		List<UserDTO> list = new ArrayList<UserDTO>();
		list.add(new UserDTO("도도도", "010", 25));
		list.add(new UserDTO("후후후", "011", 20));
		list.add(new UserDTO("가가가", "012", 22));
		list.add(new UserDTO("마마마", "013", 25));
		list.add(new UserDTO("마가가", "014", 23));

		print("정렬 전", list);// static이므로 바로 부를 수 있음.

		// 크기순 정렬
		// 이름으로 정렬
		// Comparator 인터페이스 구현: 정렬 기준 설정
		Comparator<UserDTO> comp = new Comparator<UserDTO>() {

			@Override
			public int compare(UserDTO o1, UserDTO o2) {
				return o1.getName().compareTo(o2.getName());// 오름차순
//				return -o1.getName().compareTo(o2.getName());//내림차순
				// name 항목은 String이니까 자체 메서드인 compareTo 이용하여 비교
			}
		};

		Collections.sort(list, comp);
		print("이름 정렬 후", list);

		// 나이 정렬
		Comparator<UserDTO> comp2 = new Comparator<UserDTO>() {

			@Override
			public int compare(UserDTO o1, UserDTO o2) {
				return o1.getAge() - o2.getAge();// 오름차순
//				return -(o1.getAge()-o2.getAge());//내림차순
			}
		};

		Collections.sort(list, comp2);
		print("나이 정렬 후", list);

	}

	public static void print(String title, List<UserDTO> list) {
		System.out.println(title);
		for (UserDTO vo : list) {
			System.out.println(vo);
		}
		System.out.println();
	}

}

class UserDTO {
	private String name;
	private String tel;
	private int age;

	public UserDTO() {
	}

	public UserDTO(String name, String tel, int age) {
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

	@Override
	public String toString() {
		return "UserDTO [name=" + name + ", tel=" + tel + ", age=" + age + "]";
	}

}