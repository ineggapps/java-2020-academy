package d200213;

public class Ex9 {
	public static void main(String[] args) {
		Test9 t1 = new Test9();
		///��ü ��ü�� ����ϸ� ��Ű����.Ŭ������@�ؽ��ڵ�(16����)�� ��µȴ�.
		System.out.println("main: "+t1);
		t1.print();
		System.out.println("==========");
		Test9 t2 = new Test9();
		t2.set(200);
		System.out.println("main: "+t2);
		t2.print();
	}
}

class Test9 {
	private int a=10;
	
	public void set(int a) {
		this.a=a;//�ν��Ͻ������� ���� �����ϰ��� �ϴ� �ǵ���� this.a���� this�� ������ �� ����
		//�ֳ��ϸ� ���������� a��� �������� ������ �־ a=a; �� ������ ������ �������� a���� �������� a���� �����ϴ� ������ �����ϱ� �����̴�.
	}
	
	public int get() {
		return a;
//		return this.a;
	}
	
	public void print() {
		System.out.println(this);
//		System.out.println(this.a);
		System.out.println(a);//this�� �����ص� �˾Ƽ� �ν��Ͻ� ������ ã���ֳ�!
		//���� �ν��Ͻ� ������ ������ ���� ��ü��.a ������ �����ϴϱ�!
		//�׷��� �� �ڽ��� ��ü�� ������ ���� this.a�� �����Ͽ� �����Ѵ�.
		
	}
}