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
//		User9<Number> ob3 = ob2;//������ ����. �̷��� ��� ���׸� ��ĳ������ �Ұ����ϴ�.
//		User9�� NumberŬ������ User9�� IntegerŬ������ ���� ���ϰ��谡 �ƴϹǷ� ĳ������ �� ����

		//��� Ÿ�� �Ű������� ���� ���׸� Ŭ���������� ��Ӱ��谡 �������� �ʴ´�.
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