package d200220;

public class Ex8 {
	public static void main(String[] args) {
//		Demo8 d = new Demo8();//������ ����. �߻�Ŭ������ ������ �� �Ǿ� �ִٰ� �ϴ��� ��ü ������ �Ұ����ϴ�.
		Test8 ob = new User8();// ��ĳ����
		ob.print();
	}
}

interface Test8 {
	public void print();

	public void write();
}

abstract class Demo8 implements Test8 {
	@Override
	public void print() {
		System.out.println("print...");
	}
}

class User8 extends Demo8 {

	@Override
	public void write() {
		System.out.println("write...");
	}

}