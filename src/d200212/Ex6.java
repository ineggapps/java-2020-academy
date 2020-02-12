package d200212;

public class Ex6 {
	private int a = 10;
	private int b = 20;

	static int c = 30;

	public void print() {
		System.out.println(a + ":" + b);
	}

	public void write() {
		print();
		System.out.println(c);
	}

	public static void fun() {
		System.out.println("static 메서드: " + c);
		Ex6 e = new Ex6();
		e.print();// static 메서드에서 인스턴스 매서드는 객체 생성 후 호출
	}

	public static void main(String[] args) {
		// static 변수나 메서드는 클래스 이름을 써서 접근하는 것이 원칙이나 자신이라면 생략하여도 무방하다.
		// 즉, Ex6.c 대신에 c라고만 명기하여도 된다.
		System.out.println("main: " + c);
		System.out.println("fun 메서드 호출 (이하)");
		fun();
		
		//print(); //컴파일 오류.인스턴스 메서드는 객체 생성 후 부를 수 있음.
		Ex6 ee = new Ex6();
		ee.a = 200;
		ee.print();
	}
}
