package d200219;

public class Ex3 {
	public static void main(String[] args) {
		Test3 tt1 = new Test3();
		//1) new 연산자로 Demo3의 a를 0으로 초기화하고 Test의 x의 메모리에 초깃값을 할당한다.
		//2) Test3의 생성자의 첫 줄을 실행: this(100) => Test3(int x) 생성자 코드를 실행한다.
		//3) Test3(int x)의 생성자의 첫 줄을 실행 => 생략된 super() 생성자를 부르는 메서드 호출
		//4) Demo3의 생성자인 Demo3()을 실행한다. => 생략된 Object클래스의 super() 생성자를 부르는 메서드 호출
		//4-1) Object의 생성자인 Object()을 실행한다. (but Object 생성자 코드는 비어 있음)
		//5) Demo3() 생성자의 나머지 코드를 실행한다
		//6) Test3(int x) 생성자의 나머지 코드를 실행한다.
		//7) Test3() 생성자 나머지 실행
		
		tt1.write();
	}
}

class Demo3 {
	int a;

	public Demo3() {
		//super() 가 생략되어 있음.
		System.out.println("인자 없는 Demo3 생성자");
		a = 10;
	}

	public Demo3(int a) {
		System.out.println("인자가 있는 Demo3 생성자");
		this.a = a;
	}

	public void print() {
		System.out.println(a);
	}
}

class Test3 extends Demo3 {
	int x = 100;

	public Test3() {
		//초기화작업에서는 자신의 다른 생성자나 부모의 생성자를 최초에 한 번만 부를 수 있다.
		//생성자의 실행 맨 윗줄에 있어야 하며 && 다른 생성자를 이후에 또 호출할 수 없음.
		//이 생성자에서는 자신의 다른 생성자를 호출하였으므로 여기서 super()를 부르지 않고
		//대신 Test3(int x)생성자의 맨 위에서 super() 생성자를 호출하게 된다.
		this(10);
		System.out.println("Test3 인자가 없는 생성자");
	}

	public Test3(int x) {
		//(첫 줄은) super(); 생략되어 있음.
		this.x = x;
		System.out.println("Test3 인자가 하나인 생성자");
	}

	public Test3(int a, int x) {
		super(a);
		this.x = x;
		System.out.println("Test3 인자가 두 개인 생성자");
	}

	public void write() {
		System.out.println(a + ":" + x);
	}
}