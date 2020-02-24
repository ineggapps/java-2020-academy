package d200224;

public class Ex5 {
	public static void main(String[] args) {
		User5<Integer> ob1 = new User5<>();
		ob1.set(100);
		int a= ob1.get();
		System.out.println(a);
		
		User5<Long> ob2 = new User5<>();
		ob2.set(50L);
		long b = ob2.get();
		System.out.println(b);

//		User5<String> ob3 = new User5<>(); // 컴파일오류: User5의 T는 Number을 상속받은 클래스여야만 한다.
	
	}
}

class User5<T extends Number> {
	// T는 Number를 상속받은 클래스에 한정된다.
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
}
