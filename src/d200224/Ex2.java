package d200224;

public class Ex2 {
	public static void main(String[] args) {
		User2 ob = new User2();
		String s;

		ob.set("korea");
		System.out.println(ob.get());
		s = (String) ob.get();
		System.out.println(s + ":" + s.length());

		ob.set(new Integer(20));
		System.out.println(ob.get());
		s = (String) ob.get();// Integer를 String형으로 변환을 시도하였으므로 ClassCastException 런타임 오류가 발생함.
		System.out.println(s + ":" + s.length());
	}
}

class User2 {
	private Object data;

	public void set(Object t) {
		data = t;
	}

	public Object get() {
		return data;
	}

}