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
	Demo1Child(){
		x=10;//�����ڳ� �ʱ�ȭ ��Ͽ��� �����ϸ� ������ �߻����� �ʴ´�.
//		x=11;�� �� ������ ��Ͽ��� �����ϸ� ���� ���� �ٲ� �� ����.
	}
	//	public void print() {//cannot override the final method from Demo1
//		//������ ������ �߻��Ѵ�.
//	}

}