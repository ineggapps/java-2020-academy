package d200224;

public class Ex9 {
	public static void main(String[] args) {
		User9<Number> ob1 = new User9<>();
		ob1.set(new Integer(30));
		System.out.println(ob1.get());
		ob1.set(new Double(30.99));
		System.out.println(ob1.get());
		
		User9<Integer> ob2 = new User9<>();
		ob2.set(new Integer(50));
//		User9<Number> ob3 = ob2;//컴파일 오류. 이러한 경우 제네릭 업캐스팅은 불가능하다.
//		User9의 Number클래스와 User9의 Integer클래스는 서로 상하관계가 아니므로 캐스팅할 수 없음

		//어떠한 타입 매개변수를 가진 제네릭 클래스에서는 상속관계가 성립하지 않는다.
	}
}

class User9<T> {
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
}