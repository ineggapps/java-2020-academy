package d200224;

public class Ex6 {
	public static void main(String[] args) {
		User6 ob1 = new User6();
		ob1.print(new String("Seoul"));
		ob1.print(new Integer(100));
	}
}

class User6 { // ���׸� Ŭ������ �ƴϹǷ� Ŭ���� �ڿ� <T> ���� ������� ����.
	// ���׸� �޼���
	public <U> void print(U u) {
		System.out.println(u.getClass().getName());
		System.out.println(u);
	}
}