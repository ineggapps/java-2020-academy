package d200219;

public class Ex2 {
	public static void main(String[] args) {
		Test2 tt = new Test2();
		tt.print();

		System.out.printf("%d %d %d %d\n", tt.a, tt.b, tt.c, tt.d);
		// 10 20 299 399
		// tt.super.c �� ���� ������ ����� �� ����. super�� this�� Ŭ���� �ȿ����� ����� �����ϴ�. (������ ����)
		System.out.println(((Demo2) tt).c);// �ٿ�ĳ������ �ʿ��ϴ�.
	}
}

class Demo2 {
	int a = 10;
	int b = 20;
	int c = 30;

	public void write() {
		System.out.println(a + ":" + b + ":" + c);
	}
}

class Test2 extends Demo2 {
	int c = 299;
	int d = 399;

//	public Test2() {
//		super();//Constructor call must be the first statement in a constructor
//	}
	
	public void print() {
		int a=1;
		// super class�� ��ġ�� ������ �ִٰ� �ϴ��� �ڽ��� Ŭ������ �ߺ��Ǵ� ������ ���ǵ� ��� �ڽ��� ���� �� �켱�Ѵ�.
		System.out.println(a + ":" + b + ":" + c + ":" + d);// 10:20:299:399
		System.out.println(this.a + ":" + this.b + ":" + this.c + ":" + this.d);// 10:20:299:399
		// a�� b�� �̹� ��ӹ޾����Ƿ� �ڽ��� Ŭ������ ���̶�� ���Ƶ� �����ϴ�.
		// ���� this.a, this.b�� ���������� 10, 20 �ᱣ���� ��Ÿ����.
		System.out.println(super.a + ":" + super.b + ":" + super.c + ":" + this.c);// 10:20:30:299

	}
}
