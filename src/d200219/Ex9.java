package d200219;

public class Ex9 {
	public static void main(String[] args) {
		Demo9 dd1 = new Demo9(); // ��ĳ����
		System.out.println(dd1);// ~Demo9@15db9742 (��¥ Demo9��ü)
		Demo9 dd2 = new Test9(); // ��ĳ����
		System.out.println(dd2);// ~Test9@16�����ؽ��ڵ� (��¥ Test9��ü)
		int x = ((Test9)dd2).b;//��ȣ�� �̿��Ͽ� �켱������ �����ϴ� �Ϳ� �����Ѵ�.(Test9)dd2.b�� ��쿡�� (Test9)������� �ǹ̷� �ν��ϹǷ� ������ �߻��Ѵ�.
		
		// ��ĳ������ ������ �����ϴ�.
		dd1.print();
		dd2.print();// �������̵��� �޼��� ȣ��(superŬ������ print�޼��� ȣ���� �ܺο��� ���� ��!��!��! �ܺο��� ���� �����ϴ� ��� ��ü�� ����)
		// �������� ���� �ƴ϶� ������ ��ÿ� � �޼��带 ȣ������ �����ȴ�. (���� ���ε�, ������)
		System.out.println(dd2.b);// �ʵ� ������ ��쿡�� ��ġ�� ��� ������������ ���� �����´�.

		System.out.println("�ٿ�ĳ���� ����");
		// �ٿ�ĳ����
//		Test9 tt = (Test9) dd1; // �ٿ�ĳ���� �Ұ��� (���� Demo9��ü�̴ϱ�) // ��Ÿ�� ����
		// Demo9 cannot be cast to Test9 ��� �����޽����� �߻��Ѵ�.
//		Test9 tt2 = (Test9) dd2; // �ٿ�ĳ����
		// �ٿ� ĳ������ �� ĳ������ �� �͸� �����ϰ�, �ݵ�� ĳ�����ؾ� �Ѵ�.
//		dd2.sub(); // ������ ����
//		int x = dd2.c; // ������ ����

		// 1. ��ü ���� ĳ������ ���ϰ��迡���� �����ϴ�.
//			Test9 tt3 = (Test9)new String();//�̷� �� ���� �Ұ���
		// 2. �� ĳ������ ������ �����ϴ�.
//			Object tt3 = (Object)new Demo9();
		// 3. �ٿ� ĳ������ ��ĳ������ ������ �͸� �����ϰ�, �ݵ�� ĳ������ �ʿ��ϴ�.
//			Demo9 ddd = new Test9();
//			Test9 fff =(Test9)ddd;
//			fff.sub();

		// instanceof �ش� Ŭ������ ��ü������ �Ǻ��ϴ� �����
		System.out.println(dd1 instanceof Demo9);// true
		System.out.println(dd1 instanceof Test9);// false
		System.out.println(dd2 instanceof Demo9);// true
		System.out.println(dd2 instanceof Test9);// true

		if (dd2 instanceof Test9) {
			Test9 tt2 = (Test9) dd2;
			tt2.sub();
		}

	}
}

class Demo9 {
	int a = 10;
	int b = 20;

	public void print() {// 1
		System.out.println(a + ":" + b);
	}
}

class Test9 extends Demo9 {
	int b = 200;
	int c = 300;

	@Override
	public void print() {// 2
		System.out.println(a + ":" + b + ":" + c);
	}

	public void sub() {
		System.out.println(a + ":" + super.b + ":" + c);
		super.print();// 1�� ȣ��
		// print();//2�� ȣ��
	}

}