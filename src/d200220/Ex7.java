package d200220;

public class Ex7 {
	public static void main(String[] args) {
		User7 ob = new User7();
		Demo7 dd = ob; //��ĳ����
		dd.print();
		
		System.out.println();
		Test7 tt= new User7();//��ĳ����
		tt.write();
		((Demo7)tt).print(); //User7Ŭ������ Demo7 �������̷� �����Ǿ� �����Ƿ�
	}
}

interface Demo7{
	public void print();
}

interface Test7{
	public void write();
}

//�� �� �̻��� �������̽� ������ �����ϴ�
class User7 implements Demo7, Test7{

	@Override
	public void write() {
		System.out.println("write");
	}

	@Override
	public void print() {
		System.out.println("print");
	}
	
}
