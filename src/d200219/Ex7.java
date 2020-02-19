package d200219;

public class Ex7 {
	public static void main(String[] args) {
		Demo7 dd1 = new Demo7();
		Demo7 dd2 = new Demo7();
		System.out.println(dd1.equals(dd2));// �ּڰ� ��. false ��ȯ
		//Object�� equals() ȣ���Ѵ�.
		System.out.println(dd1);//��Ű���̸�.Ŭ�����̸�@�ؽ�16������
		
		Test7 tt1 = new Test7();
		Test7 tt2 = new Test7();
		System.out.println(tt1.equals(tt2));// 1) tt1
		//Test7�� �����ǵ� equals() �޼��带 ȣ���Ѵ�.
		System.out.println(tt1);//��Ű���̸�.Ŭ�����̸�@�ؽ�16������
		System.out.println(tt1.toString());//��Ű���̸�.Ŭ�����̸�@�ؽ�16������
		
	}
}

class Demo7 {
	int a = 10;

	public void print() {
		System.out.println(a);
	}


}

class Test7 extends Demo7 {
	int a = 999;

	public void write() {
		System.out.println(a);
	}

	@Override
	public boolean equals(Object obj) {
		Test7 t = (Test7) obj; // obj�� 1)�� tt2�� �޴´�.
		return this.a == t.a;// 1)���� ȣ��� ������ �̷�� �� �� ���⼭ this�� tt1�� �ǹ��Ѵ�.
//		if (obj instanceof Test7) {
//			Test7 tobj = (Test7) obj;
//			return a == tobj.a;
//		}
//		return false;
	}

	@Override
	public String toString() {
		return "a:" + a;
	}
}
