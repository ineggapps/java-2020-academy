package d200213;

public class Ex6 {
	//������ this �ǽ�
	public static void main(String[] args) {
		Test6 t = new Test6();
		t.write();
	}
}

class Test6{
	private int n;
	
	//�����ڴ� ����Ÿ���� ������� �ʴ´� .
	//����Ÿ���� ����ϴ� ���� �Ϲ����� ��ü�� �޼��尡 �Ǿ� ������.
	//�����ڴ� new�� �̿��Ͽ� ��ü�� ������ �� ȣ��ȴ�.
	//������ �ȿ��� �ʱ�ȭ�� �����Ѵ�.
	Test6(){
		n=10;
		n++;
		System.out.println("���� ���� ������ ȣ��");
	}
	
	public void write() {
		System.out.println(n);
	}
}
