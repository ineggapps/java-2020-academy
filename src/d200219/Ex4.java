package d200219;

public class Ex4 {
	public static void main(String[] args) {
//		Demo4 dd = new Demo4();//���ڰ� ���� �����ڰ� �����Ƿ� ȣ���� �� ����..
		Demo4 dd = new Demo4(5);
		dd.print();
		Test4 tt = new Test4();
		tt.print();
	}
}

class Demo4 {
	int a;

	public Demo4(int a) {
		this.a = a;
		System.out.println("Demo4 ���� �ִ� ������...");
	}

	public void print() {
		System.out.println(a);
	}
}

class Test4 extends Demo4 {
	//�����ڸ� ������ ������ ����: ����Ŭ������ ���ڰ� 1���� �����ڸ��� ���� �ִ�.
	//�ݵ�� �����ڸ� ����� super(��);���� ȣ���� �ؾ�
	//����Ŭ������ ��ü�� �����ȴ�.
	public Test4() {
		super(78978);
		System.out.println("���� Test4 �����ڸ� ������ �ž�");
	}

	
}