package d200220;

public class Ex9 {
	public static void main(String[] args) {
		
	}
}

interface ADemo9 {
	public void write();
}

interface BDemo9 {
	public void print();
}

//�������̽��� ���� �������̽��� 2�� �̻� ��ӹ��� �� ����. (interface������ extends�� �̿��Ͽ�)
interface Demo9 extends ADemo9, BDemo9{
	public void sub();
}

class Test9 implements Demo9{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}
	
}