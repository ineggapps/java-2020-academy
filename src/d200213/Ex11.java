package d200213;

public class Ex11 {
	public static void main(String[] args) {
		Test11 t = new Test11();
		t.write();
		Test11 t2 = new Test11();
		t2.write();
	}
}

class Test11 {
	private int a;
	private int b = 20;
	/*
		 ��ü ���� ����
		 1) new => ��ü ���� ����: a,b �ν��Ͻ� ���� �޸𸮿� �Ҵ��Ѵ�.
		 2) a,b�� �⺻������ �ʱ�ȭ�� ����ȴ� (int���̴ϱ� 0���� �ʱ�ȭ�ȴ�.)
		 3) �ʱ�ȭ ���� �����Ѵ� : b=20;
		 4) �ʱ�ȭ ����� �����Ѵ�.
		 5) ������ �ȿ� ���Ե� �ʱ�ȭ �۾��� �����Ѵ�.
	 */
	// a=10; //������ ���� ... ���๮�� �� �� ���� ����. ������ �ν��Ͻ� ������ �����ϴ� ������ ���̴�.

	{
		// �ν��Ͻ� �ʱ�ȭ ���
		a = 10;
		System.out.println("�ν��Ͻ� �ʱ�ȭ ����Դϴ�.");
		// ������ �� ���� ���� ����.
	}

	public Test11() {// ������
		System.out.println("�����ڰ� ����Ǿ����ϴ�.");
	}

	public void write() {// �ν��Ͻ� �޼���
		System.out.println(a + ":" + b);
	}
}