package d200213;

public class Ex7 {
	public static void main(String[] args) {
//		Test7 t = new Test7();// 컴파일 오류. 인자가 없는 생성자가 존재하지 않음. The constructor Test7() is not undefined.
		Test7 t = new Test7(10);
		t.write();
	}
}

class Test7 {
	private int a;

	// 이미 생성자를 선언하였기 때문에 컴파일러가 기본 생성자를 만들지 않는다.
	// 기본 생성자(디폴트 생성자)는 생성자를 언급하지 않았을 때 컴파일러가 자동으로 생성해 준다.
	// 컴파일러가 자동으로 생성해 준 기본 생성자에는 아무런 코드가 없는 빈 생성자이다.
	public Test7(int n) {
		a = n;
		System.out.println("인자가 있는 생성자 호출됨");
	}

	public void write() {
		System.out.println(a);
	}
}