package d200219;

public class Ex1 {
	public static void main(String[] args) { 
		Demo1 d = new Demo1();
		System.out.println(d.b);
		//d.print(); //����. ���� Ŭ������ �޼���, �ʵ�� ������ �� ����. (��� ���� �翬�� �̾߱�)
		Test1 t = new Test1();
		t.write();
		//t.a; //������ ���� super class�� ������ private�̹Ƿ� ����� ���� �ʾƼ� ��ȸ�� �� ����.
		System.out.println(t.b+":"+t.c);
		t.print();
	}
}

class Demo1 {
	private int a = 10;
	protected int b=20;
	public int c= 30;
	
	public void write() {
		System.out.println(a+":"+b+":"+c);
	}
}

class Test1 extends Demo1{
	int x=100;
	
	public void print() {
		System.out.println(x+":"+b+":"+c);
//		System.out.println(a);//������ ���� super class�� private�� ��ӹ��� �� ����
	}

}