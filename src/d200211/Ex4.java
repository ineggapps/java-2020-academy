package d200211;

public class Ex4 {
	public static void main(String[] args) {
		Test4 t1;
		t1=new Test4();//new Test4() ��ü�� �������� ������ �޼��峪 ������ ����� �� ���ٴ� �Ϳ� �����Ѵ�.
		//��ü�� �����Ѵ� == �����ڸ� ȣ���Ѵ�
		t1.print();//�޼��� ȣ��
		t1.b=5;
		t1.print();
	}
}

class Test4 {
	private int a = 10;// �ν��Ͻ� ����. private �̹Ƿ� Ŭ���� ���ο����� ������ �����ϴ�.
	int b;

	// �ν��Ͻ� �޼���
	public void print() {
		++a;
		System.out.println(a+":"+b);
	}
}
