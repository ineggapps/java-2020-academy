package d200213;

public class Ex10 {
	public static void main(String[] args) {
		Test10 t = new Test10();
		t.set(999);
		t.print();
		System.out.println("====");
		Test10.write();
	}
}

class Test10 { 
	private int a;
	
	public void set(int a) {
		this.a=a;
	}
	
	public void fun() {
		System.out.println("fun...");
	}
	
	public void print() {
		this.fun();//this ������ �����ϴ�.
		System.out.println(this.a);//������������ a��� �̸��� ������ �ʾұ� ������ ���⼭�� thisŰ����� �����ص� �ȴ�.
	}
	
	public static void write() {
//		System.out.println(this.a);//�����Ͽ���: static������ �ν��Ͻ� �޼��峪 ������ ������ �� ������ �����Ѵ�.
	//Ŭ���� �޼���� ��ü ������ �����ϹǷ� ȣ���� ��ü�� ��Ÿ���� this�� ����� �� ����.
		Test10 t = new Test10();
		t.a=10;//Ŭ���� �޼��忡���� �ν��Ͻ������� ��ü�� ������ �ڿ��� ������ �����ϴ�.
		t.print();
	}
}