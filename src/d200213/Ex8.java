package d200213;

public class Ex8 {
	public static void main(String[] args) {
		Test8 t = new Test8();
		t.write();
//		Test8 tt= new Test8(55);
//		tt.write();
	}
}

class Test8 {
	private int a;

	public Test8() {
		//�ٸ� �����ڸ� �θ��� ���� �� �� �� �ֻ�ܿ����� �����ϴ�.
		//		this();//������ ���� (Recursive constructor invocation Test8());
		this(999);//�μ����ٸ� �ڽ��� �ٸ� �����ڸ� ȣ���ϰ��� �Ѵٸ� ���� ���� �����ؾ� �Ѵ�.
		//=> �ٸ� �������� �ڵ带 �����ϰ� ���ƿ´�.
		//Test8(999); �̰͵� ���������� �޼��带 �θ��� ���̹Ƿ� ������ ������ �߻��Ѵ�.
		System.out.println("���� ���� ������");
//		this(999);//Constructor call must be the first statement in a constructor
	}

	public Test8(int n) {
		a = n;
		System.out.println("���ڰ� �ִ� ������");
	}
	
	public void write() {
		System.out.println(a);
	}
}
