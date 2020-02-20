package d200220;

public class Ex5 {
	public static void main(String[] args) {
//		Demo5 ob = new Demo5(); //�������̽��� ��ü���� �Ұ���
		
		Demo5 ob = new Test5();//��ĳ���� (����)
		ob.print();
		
//		ob.sub();//ȣ�� �Ұ���, ������ ����
		((Test5)ob).sub();//�ٿ� ĳ����
	}
}

//���� �ְ� ���ǰ� ���� �߻�Ŭ������ ����
interface Demo5 {
	public static final double PI = 3.141592;// �ۼ��� �̷��� �� ���� ����...
	public int A = 10;// static final ��� static final�� ����� �� ���� ȿ��

	// JDK8���� ���������� �޼ҵ� �ñ״�ó ��������� �����ϴ�(���� ��� �Ұ�)
	public abstract void print();

	void fun();// public�� ��� public,
	// abstract�� ��� abstractŰ���带 ������ ���̳� ���������̴�.

	// JDK8�������ʹ� default �޼���� static �޼��带 ���� �� �ִ�.
}

class Test5 implements Demo5 {
	int a = 10;

	@Override
	public void print() {
		System.out.println("print...");
	}

	@Override
	public void fun() {
		System.out.println("fun...");
	}
	
	public void sub() {
		System.out.println("sub...");
	}

}