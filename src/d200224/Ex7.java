package d200224;

public class Ex7 {
	public static void main(String[] args) {
		User7<Integer> ob = new User7<>();
		Integer[] a = {10,20,30};
		ob.set(a);
		
		Integer[] b = ob.get();
		for(int x: b) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
}

class User7<T> {
	private T[] data;

	@SuppressWarnings("unchecked")//��� �����ϰڴٴ� ����
	public User7() {
		data = (T[]) new Object[10];// ������ �迭�� ���� (�������� ����)
		// Object�� �迭�� ������ �� ĳ������ ���ָ� ������ �迭�� ������ �� �ִ�.
		// ������ new T[3]; ó�� ������ �Ұ����� ������ ���� Type�� �������� �ʾұ� �����̴�.
	}

	public void set(T[] data) {
		this.data = data;
	}

	public T[] get() {
		return data;
	}
}