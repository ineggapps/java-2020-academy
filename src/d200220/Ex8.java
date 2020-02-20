package d200220;

public class Ex8 {
	public static void main(String[] args) {
//		Demo8 d = new Demo8();//컴파일 오류. 추상클래스는 구현이 다 되어 있다고 하더라도 객체 생성이 불가능하다.
		Test8 ob = new User8();// 업캐스팅
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