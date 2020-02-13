package d200213;

public class Ex8 {
	public static void main(String[] args) {
		Test8 t = new Test8();
		t.write();
//		Test8 tt= new Test8(55);
//		tt.write();
	}
}

class Test8 {
	private int a;

	public Test8() {
		//다른 생성자를 부르는 것은 단 한 번 최상단에서만 가능하다.
		//		this();//컴파일 오류 (Recursive constructor invocation Test8());
		this(999);//인수가다른 자신의 다른 생성자를 호출하고자 한다면 가장 먼저 실행해야 한다.
		//=> 다른 생성자의 코드를 실행하고 돌아온다.
		//Test8(999); 이것도 마찬가지로 메서드를 부르는 것이므로 컴파일 오류가 발생한다.
		System.out.println("인자 없는 생성자");
//		this(999);//Constructor call must be the first statement in a constructor
	}

	public Test8(int n) {
		a = n;
		System.out.println("인자가 있는 생성자");
	}
	
	public void write() {
		System.out.println(a);
	}
}
