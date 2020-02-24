package d200224;

public class Ex4 {
	public static void main(String[] args) {
		User4<String, Integer> ob = new User4<>();
		ob.set("seoul", 1000);
//		ob.set(1000,"dfslkdfjds");//컴파일 오류 (선언한 파라미터의 자료형에 맞춰서 전달해야 한다)
		ob.print();

		String s = ob.getT();// 캐스팅하지 않음 (애초에 이런 반복적인 작업 줄이려고 만든 개념이 제네릭인데...)
		System.out.println(s);
	}
}

class User4<T, U> {
	private T t;
	private U u;

	public void set(T t, U u) {
		this.t = t;
		this.u = u;
	}

	public T getT() {
		return t;
	}

	public U getU() {
		return u;
	}

	public void print() {
		System.out.println(t.getClass().getName() + ", " + u.getClass().getName());
		System.out.println(t + ":" + u);
	}
}
