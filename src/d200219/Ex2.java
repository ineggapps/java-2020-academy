package d200219;

public class Ex2 {
	public static void main(String[] args) {
		Test2 tt = new Test2();
		tt.print();

		System.out.printf("%d %d %d %d\n", tt.a, tt.b, tt.c, tt.d);
		// 10 20 299 399
		// tt.super.c 와 같은 구문은 사용할 수 없다. super나 this는 클래스 안에서만 사용이 가능하다. (컴파일 오류)
		System.out.println(((Demo2) tt).c);// 다운캐스팅이 필요하다.
	}
}

class Demo2 {
	int a = 10;
	int b = 20;
	int c = 30;

	public void write() {
		System.out.println(a + ":" + b + ":" + c);
	}
}

class Test2 extends Demo2 {
	int c = 299;
	int d = 399;

//	public Test2() {
//		super();//Constructor call must be the first statement in a constructor
//	}
	
	public void print() {
		int a=1;
		// super class에 겹치는 변수가 있다고 하더라도 자신의 클래스에 중복되는 변수가 정의된 경우 자신의 것을 더 우선한다.
		System.out.println(a + ":" + b + ":" + c + ":" + d);// 10:20:299:399
		System.out.println(this.a + ":" + this.b + ":" + this.c + ":" + this.d);// 10:20:299:399
		// a와 b는 이미 상속받았으므로 자신의 클래스의 것이라고 보아도 무방하다.
		// 따라서 this.a, this.b도 마찬가지로 10, 20 결괏값이 나타난다.
		System.out.println(super.a + ":" + super.b + ":" + super.c + ":" + this.c);// 10:20:30:299

	}
}
