package d200224;

public class Ex10 {
	public static void main(String[] args) {
		User10<Integer> ob = new User10<>();
		ob.set(new Integer(10));
		
//		User10<Number> ob2=ob;//컴파일 오류. 상속 관계가 아니다.
		
		User10<?> ob2 = ob;
		// ? : 모든 클래스나 인터페이스가 가능하다
		// 제네릭 타입에 의존적이지 않는 메서드 등을 호출할 때 사용한다.
//		ob2.set(new Integer(200)); The method set(capture#1-of ?) in the type User10<capture#1-of ?> is not applicable for the arguments (Integer)
//		ob2는 자료형이 아직 결정되지 않은 상태에서 데이터를 삽입하였다.
//		와일드카드는 아무 곳에서나 사용하는 것이 아님.
		ob2.print();
	}
}

class User10<T> {
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

	public void print() {
		System.out.println(t);
	}
}