package d200220;

public class Ex1 {
	public static void main(String[] args) {
		
	}
}


//final class Sam{//finalŬ������ ���� Ŭ������ ���� �� ����.
//	int a;
//}

//class Ex extends Sam{//������ ����}

class Demo1{
	int a;
	public final void print() {//���� Ŭ�������� �޼��带 �������̵��� �� ����
		System.out.println(a);
	}
}

class Demo1Child extends Demo1{
	final int x; //(������, �ʱ�ȭ��Ͽ��� �ʱ�ȭ���� ���� ���) ������ ���� (final ������ �ʱ�ȭ�� ���� �ʾ����Ƿ�)
	final int y=10;//�ݵ�� �� �� �ʱ�ȭ�� �̷������ �Ѵ�.
	//�ν��Ͻ� final������ ���� �� ������, �ʱ�ȭ ��Ͽ��� �ʱ�ȭ�� �����ϴ�.
	
	static final int A=20;//static ����� ������ ���� �빮���̸� ����� ���ÿ� ������ �� ����
	static final int B;
	static {
		//static final ������ ���� �� Ȥ�� static �ʱ�ȭ ��Ͽ����� �����ϴ�.
		//static final ������ �����ڿ��� �ʱ�ȭ �Ұ���.
		B=10;
	}
	
	Demo1Child(){
//		B=5;//static����� ��ü �����ڿ����� �ʱ갪 ������ �� �� ����.
		x=10;//�����ڳ� �ʱ�ȭ ��Ͽ��� �����ϸ� ������ �߻����� �ʴ´�.
//		x=11;�� �� ������ ��Ͽ��� �����ϸ� ���� ���� �ٲ� �� ����.
	}
	//	public void print() {//cannot override the final method from Demo1
//		//������ ������ �߻��Ѵ�.
//	}
	
	public void write() {
		final int n;
		n=10;
//		n=20;//n�� ���� ��� ������ �� �� ���� �����ϴ�. (������ ����)
//		x=25;//������ ����(����� ��� �ٲ�)
		System.out.println(x+":"+y+":"+n);
	}

}