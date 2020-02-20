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

//인터페이스는 다은 인터페이스를 2개 이상 상속받을 수 있음. (interface끼리는 extends를 이용하여)
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