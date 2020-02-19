package d200219;

public class Ex3 {
	public static void main(String[] args) {
		Test3 tt1 = new Test3();
		//1) new �����ڷ� Demo3�� a�� 0���� �ʱ�ȭ�ϰ� Test�� x�� �޸𸮿� �ʱ갪�� �Ҵ��Ѵ�.
		//2) Test3�� �������� ù ���� ����: this(100) => Test3(int x) ������ �ڵ带 �����Ѵ�.
		//3) Test3(int x)�� �������� ù ���� ���� => ������ super() �����ڸ� �θ��� �޼��� ȣ��
		//4) Demo3�� �������� Demo3()�� �����Ѵ�. => ������ ObjectŬ������ super() �����ڸ� �θ��� �޼��� ȣ��
		//4-1) Object�� �������� Object()�� �����Ѵ�. (but Object ������ �ڵ�� ��� ����)
		//5) Demo3() �������� ������ �ڵ带 �����Ѵ�
		//6) Test3(int x) �������� ������ �ڵ带 �����Ѵ�.
		//7) Test3() ������ ������ ����
		
		tt1.write();
	}
}

class Demo3 {
	int a;

	public Demo3() {
		//super() �� �����Ǿ� ����.
		System.out.println("���� ���� Demo3 ������");
		a = 10;
	}

	public Demo3(int a) {
		System.out.println("���ڰ� �ִ� Demo3 ������");
		this.a = a;
	}

	public void print() {
		System.out.println(a);
	}
}

class Test3 extends Demo3 {
	int x = 100;

	public Test3() {
		//�ʱ�ȭ�۾������� �ڽ��� �ٸ� �����ڳ� �θ��� �����ڸ� ���ʿ� �� ���� �θ� �� �ִ�.
		//�������� ���� �� ���ٿ� �־�� �ϸ� && �ٸ� �����ڸ� ���Ŀ� �� ȣ���� �� ����.
		//�� �����ڿ����� �ڽ��� �ٸ� �����ڸ� ȣ���Ͽ����Ƿ� ���⼭ super()�� �θ��� �ʰ�
		//��� Test3(int x)�������� �� ������ super() �����ڸ� ȣ���ϰ� �ȴ�.
		this(10);
		System.out.println("Test3 ���ڰ� ���� ������");
	}

	public Test3(int x) {
		//(ù ����) super(); �����Ǿ� ����.
		this.x = x;
		System.out.println("Test3 ���ڰ� �ϳ��� ������");
	}

	public Test3(int a, int x) {
		super(a);
		this.x = x;
		System.out.println("Test3 ���ڰ� �� ���� ������");
	}

	public void write() {
		System.out.println(a + ":" + x);
	}
}