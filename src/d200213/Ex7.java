package d200213;

public class Ex7 {
	public static void main(String[] args) {
//		Test7 t = new Test7();// ������ ����. ���ڰ� ���� �����ڰ� �������� ����. The constructor Test7() is not undefined.
		Test7 t = new Test7(10);
		t.write();
	}
}

class Test7 {
	private int a;

	// �̹� �����ڸ� �����Ͽ��� ������ �����Ϸ��� �⺻ �����ڸ� ������ �ʴ´�.
	// �⺻ ������(����Ʈ ������)�� �����ڸ� ������� �ʾ��� �� �����Ϸ��� �ڵ����� ������ �ش�.
	// �����Ϸ��� �ڵ����� ������ �� �⺻ �����ڿ��� �ƹ��� �ڵ尡 ���� �� �������̴�.
	public Test7(int n) {
		a = n;
		System.out.println("���ڰ� �ִ� ������ ȣ���");
	}

	public void write() {
		System.out.println(a);
	}
}