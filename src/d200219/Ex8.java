package d200219;

public class Ex8 {
	public static void main(String[] args) {
		Test8 tt = new Test8();
		Demo8 dd = tt;
		//상위 클래스 객체가 하위 클래스 객체를 가리킴
		//업 캐스팅(up casting). 언제나 가능하다.
		System.out.println(tt.b + ":" + tt.c);//200:300
		System.out.println(dd.b);//20
		System.out.println(((Test8)dd).b);//200
		dd.print();//★결괏값이 의외네  //10:200:300
		//어떤 메서드를 실행할지는 실행 시점에 결정한다 (동적 바인딩)
		//상위 클래스의 메서드를 하위 클래스에서 재정의하면 상위 클래스의 메서드는 숨는다.
		//외부에서는 이미 오버라이딩된 Demo8의 print()메서드를 불러올 수 없다. (업 캐스팅을 하여도 결과는 똑같다)
		//상위 클래스의 객체가 하위 클래스의 객체를 가리키고 있으므로
		//메서드에서는 오버라이딩된 하위 클래스의 메서드가 호출된다.
		//즉, 메서드가 오버라이딩된 경우 외부에서는 상위 클래스의 메서드를 절대로 부를 수 없음.
		//내부에서만 super.메서드명()으로 호출이 가능하다.
		System.out.println();
//		System.out.println(dd.c);
//		tt.sub();
	}
}

class Demo8 {
	int a = 10;
	int b = 20;

	public void print() {
		System.out.println(a + ":" + b);
	}
}

class Test8 extends Demo8 {
	int b = 200;
	int c = 300;

	public void print() {
		System.out.println(a + ":" + b + ":" + c);
	}

	public void sub() {
		System.out.println(b + ":" + c);
	}
}