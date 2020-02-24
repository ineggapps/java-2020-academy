package d200224;

public class Ex6 {
	public static void main(String[] args) {
		User6 ob1 = new User6();
		ob1.print(new String("Seoul"));
		ob1.print(new Integer(100));
	}
}

class User6 { // 제네릭 클래스가 아니므로 클래스 뒤에 <T> 등을 명시하지 않음.
	// 제네릭 메서드
	public <U> void print(U u) {
		System.out.println(u.getClass().getName());
		System.out.println(u);
	}
}