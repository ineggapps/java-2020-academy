package d200228;

public class Ex1StaticNestedClass {
	public static void main(String[] args) {
		// static ��ø Ŭ���� �ǽ�
		// User1�� ��ü�� ������ �ʿ� ���� �ٷ� User1 �ȿ� �ִ� ��ø Ŭ������ Test1Ŭ������ ��ü�� �����Ͽ���.
		// �� �ܺο��� ��ø Ŭ������ ��ü�� �����ϴ� �� �ƹ��� ������ ����.
		User1.Test1 tt = new User1.Test1();
		tt.write();
		tt.sub(); // Test1�� User1Ŭ���� ���ο� ������ Test1Ŭ���� �� �޼��忡�� User1�� ��ü�� ������ �� �ִ�.
	}
}

class User1 {
	int a = 10;// ��ü�� �����Ǳ� ������(new ~)�� �޸𸮿� �Ҵ���� �ʴ´ٴ� ���� �������.
	static int b = 20;

	/* private */ static class Test1 {// private ���������ڸ� �����ϸ� User1Ŭ���� ���ο����� ����� �� �ִ�.
		//��, private ���������ڸ� �����ϸ� Ex1Ŭ���� ���� �ܺ� Ŭ���������� ���� Test1Ŭ������ ������ �Ұ����ϴ�.
		// NestedClass(��ø Ŭ����)
		// ��ø Ŭ������ Ŭ���� �ȿ� �� �ۼ��ϴ� ���̶�� �����ϸ� �˴ϴ�.
		// static class�� Test1�� User1Ŭ������ ��ü�� �������� �ʾƵ� Test1�� ��ü�� �ܵ����� ������ �� ����.
		int x = 100;

		public void write() {
			System.out.println(x);
//			System.out.println(a);//������ ����: User1�� ��ü�� ������ �Ŀ� ȣ���� �� �ִ�.
//			print(); �����Ͽ���: User1�� ��ü�� ������ �Ŀ� ȣ���� �� �ִ�.
			System.out.println(b);
		}

		public void sub() {// ����Ŭ����
			User1 uu = new User1();
			System.out.println(uu.a);// ��ü�� �����Ǿ����Ƿ� User1 uu�� a������ ���� �� ����.
			uu.print(); // ����: uu�� User1�� ��ü�� �ּڰ��� ��� �ִ�. ���� uu�� ����Ű�� ���� ��ü�̴�.
		}
	}

	public void print() {
		System.out.println(a + ":" + b);
	}

	public static void fun() {
//		System.out.println(a);// �����Ͽ���: �ֳ��ϸ� �ʵ��� a������ �ν��Ͻ�(��ü�� ������ �� ����� �� �ִ�) �����̴�.
		// static�� �޸��Ҵ��� ���� ���������� ��ü�� �� ������ ������ �Ǳ� ������ ��������� �޶�
		// a ��ü������ static�� Ȱ���� �� ���ٰ� �����ϸ� �˴ϴ�.
		// (�׸��� a��ü�� ���� �������� static�� �� �� ����. ������ �ٵ� ��)
		// �ٸ�, ��ü�� static�� ������ Ȱ���� �� �ֽ��ϴ�. (��ü ���� ������ Ŭ������ �ε��ϰ� static������ �̸� �ҷ��� �״ϱ�!)
		System.out.println(b);
	}
}
