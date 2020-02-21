package d200221;

public class Ex14 {
	public static void main(String[] args) {
		User14 u = new User14();
		try {
			u.set(-328493);
			int n = u.getAge();
			System.out.println(n);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("end...");
	}
}

class User14 {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		if (age < 0) {
			throw new Exception("나이는 0 이상이다.");
		}
		this.age = age;
	}

	public void set(int age) throws Exception {
		try {
			setAge(age);
		} catch (Exception e) {
//			System.out.println(e.toString());
			throw e;// 잡은 예외를 다시 던진다.
		}
	}

}