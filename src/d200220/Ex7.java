package d200220;

public class Ex7 {
	public static void main(String[] args) {
		User7 ob = new User7();
		Demo7 dd = ob; //업캐스팅
		dd.print();
		
		System.out.println();
		Test7 tt= new User7();//업캐스팅
		tt.write();
		((Demo7)tt).print(); //User7클래스가 Demo7 인터페이로 구현되어 있으므로
	}
}

interface Demo7{
	public void print();
}

interface Test7{
	public void write();
}

//두 개 이상의 인터페이스 구현이 가능하다
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
