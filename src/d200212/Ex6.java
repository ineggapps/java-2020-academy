package d200212;

public class Ex6 {
	private int a = 10;
	private int b = 20;

	static int c = 30;

	public void print() {
		System.out.println(a + ":" + b);
	}

	public void write() {
		print();
		System.out.println(c);
	}

	public static void fun() {
		System.out.println("static �޼���: " + c);
		Ex6 e = new Ex6();
		e.print();// static �޼��忡�� �ν��Ͻ� �ż���� ��ü ���� �� ȣ��
	}

	public static void main(String[] args) {
		// static ������ �޼���� Ŭ���� �̸��� �Ἥ �����ϴ� ���� ��Ģ�̳� �ڽ��̶�� �����Ͽ��� �����ϴ�.
		// ��, Ex6.c ��ſ� c��� ����Ͽ��� �ȴ�.
		System.out.println("main: " + c);
		System.out.println("fun �޼��� ȣ�� (����)");
		fun();
		
		//print(); //������ ����.�ν��Ͻ� �޼���� ��ü ���� �� �θ� �� ����.
		Ex6 ee = new Ex6();
		ee.a = 200;
		ee.print();
	}
}
