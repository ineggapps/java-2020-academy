package d200224;

public class Ex3 {
	public static void main(String[] args) {
		User3<String> ob = new User3<>();//1.7���� ������ <>�� ������ �����ϴ�.
//		User3<String> ob = new User3<String>();//JDK 1.5, 1.6 ���������� �ݵ�� �� �� <> �ȿ� Ÿ���� ����ؾ��Ѵ�.
		ob.set("korea");
		System.out.println(ob.get());

//		ob.set(new Integer(20));//���׸� Ÿ������ �����Ͽ����Ƿ� ������ ������ �߻��Ѵ�.
		// �ֳ��ϸ� User3�� String������ Ȱ���ϱ�� ���׸� Ÿ������ �����Ͽ��� �����̴�.

		User3<Integer> ob2 = new User3<>();
		ob2.set(new Integer(20));
		System.out.println(ob2.get());
		
		User3 ob3 = new User3();//���׸� Ÿ������ �����Ͽ����� ���׸� Ÿ���� ������� ������ ��� �߻��Ѵ�.
		ob3.set(new Integer(300));//���������� Object�� ó���Ͽ��� ������ �߻������� ������ ��� ����.
		//���α׷� ���� �� �߸��� ����ȯ���� ��Ÿ�� ������ �߻��� �� �ֱ� �����̴�.
		//ob3ó�� ��ü�� �����ϴ� ���� �������� ����.
		System.out.println(ob3.get());

		ob3.set(new String("seoul"));
		System.out.println(ob3.get());
	}
}

class User3<T> {//<T>: ���׸�. ���� �ÿ� �ڷ����� �����ȴ�.
	//Type�� ����
	//���������δ� Object�� ó���ϳ� �� �� ���� ����ϵ��� ó���� ���� ���׸�
	private T data;

	public void set(T t) {
		System.out.println(t.getClass().getName());
		data = t;
	}

	public T get() {
		return data;
	}

}