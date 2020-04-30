package d200219;

public class Ex4 {
	public static void main(String[] args) {
//		Demo4 dd = new Demo4();//인자가 없는 생성자가 없으므로 호출할 수 없음..
		Demo4 dd = new Demo4(5);
		dd.print();
		Test4 tt = new Test4();
		tt.print();
	}
}

class Demo4 {
	int a;

	public Demo4(int a) {
		this.a = a;
		System.out.println("Demo4 인자 있는 생성자...");
	}

	public void print() {
		System.out.println(a);
	}
}

class Test4 extends Demo4 {
	//생성자를 만들지 않으면 오류: 상위클래스가 인자가 1개인 생성자만을 갖고 있다.
	//반드시 생성자를 만들고 super(값);으로 호출을 해야
	//상위클래스의 객체가 생성된다.
	public Test4() {
		super(78978);
		System.out.println("이제 Test4 생성자를 실행할 거야");
	}

	
}