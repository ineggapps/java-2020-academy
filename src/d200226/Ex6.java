package d200226;

import java.util.PriorityQueue;

public class Ex6 {
	public static void main(String[] args) {
		PriorityQueue<UserVO> q = new PriorityQueue<UserVO>();
		// ★Comparable인터페이스가 구현되어 있지 않으면 런타임 오류가 발생한다. cannot be cast to
		// java.lang.Comparable
		q.offer(new UserVO("전한길", 25));
		q.offer(new UserVO("이선재", 20));
		q.offer(new UserVO("강민성", 23));
		q.offer(new UserVO("이동기", 24));

		while (q.peek() != null) {
			UserVO vo = q.poll();
			System.out.println(vo);
		}
	}
}

class UserVO implements Comparable<UserVO> {
	private String name;
	private int age;

	public UserVO() {
	}

	public UserVO(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserVO [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(UserVO o) {
//		return name.compareTo(o.getName());
		return age-o.getAge();
	}

}