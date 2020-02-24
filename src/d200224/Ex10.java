package d200224;

public class Ex10 {
	public static void main(String[] args) {
		User10<Integer> ob = new User10<>();
		ob.set(new Integer(10));
		
//		User10<Number> ob2=ob;//������ ����. ��� ���谡 �ƴϴ�.
		
		User10<?> ob2 = ob;
		// ? : ��� Ŭ������ �������̽��� �����ϴ�
		// ���׸� Ÿ�Կ� ���������� �ʴ� �޼��� ���� ȣ���� �� ����Ѵ�.
//		ob2.set(new Integer(200)); The method set(capture#1-of ?) in the type User10<capture#1-of ?> is not applicable for the arguments (Integer)
//		ob2�� �ڷ����� ���� �������� ���� ���¿��� �����͸� �����Ͽ���.
//		���ϵ�ī��� �ƹ� �������� ����ϴ� ���� �ƴ�.
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