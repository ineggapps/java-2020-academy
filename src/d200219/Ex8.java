package d200219;

public class Ex8 {
	public static void main(String[] args) {
		Test8 tt = new Test8();
		Demo8 dd = tt;
		//���� Ŭ���� ��ü�� ���� Ŭ���� ��ü�� ����Ŵ
		//�� ĳ����(up casting). ������ �����ϴ�.
		System.out.println(tt.b + ":" + tt.c);//200:300
		System.out.println(dd.b);//20
		System.out.println(((Test8)dd).b);//200
		dd.print();//�ڰᱣ���� �ǿܳ�  //10:200:300
		//� �޼��带 ���������� ���� ������ �����Ѵ� (���� ���ε�)
		//���� Ŭ������ �޼��带 ���� Ŭ�������� �������ϸ� ���� Ŭ������ �޼���� ���´�.
		//�ܺο����� �̹� �������̵��� Demo8�� print()�޼��带 �ҷ��� �� ����. (�� ĳ������ �Ͽ��� ����� �Ȱ���)
		//���� Ŭ������ ��ü�� ���� Ŭ������ ��ü�� ����Ű�� �����Ƿ�
		//�޼��忡���� �������̵��� ���� Ŭ������ �޼��尡 ȣ��ȴ�.
		//��, �޼��尡 �������̵��� ��� �ܺο����� ���� Ŭ������ �޼��带 ����� �θ� �� ����.
		//���ο����� super.�޼����()���� ȣ���� �����ϴ�.
		System.out.println();
//		System.out.println(dd.c);
//		tt.sub();
	}
}

class Demo8 {
	int a = 10;
	int b = 20;

	public void print() {
		System.out.println(a + ":" + b);
	}
}

class Test8 extends Demo8 {
	int b = 200;
	int c = 300;

	public void print() {
		System.out.println(a + ":" + b + ":" + c);
	}

	public void sub() {
		System.out.println(b + ":" + c);
	}
}