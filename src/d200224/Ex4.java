package d200224;

public class Ex4 {
	public static void main(String[] args) {
		User4<String, Integer> ob = new User4<>();
		ob.set("seoul", 1000);
//		ob.set(1000,"dfslkdfjds");//������ ���� (������ �Ķ������ �ڷ����� ���缭 �����ؾ� �Ѵ�)
		ob.print();

		String s = ob.getT();// ĳ�������� ���� (���ʿ� �̷� �ݺ����� �۾� ���̷��� ���� ������ ���׸��ε�...)
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
