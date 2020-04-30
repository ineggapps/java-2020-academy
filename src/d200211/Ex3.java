package d200211;

public class Ex3 {
	public static void main(String[] args) {
		//클래스 변수는 클래스가 로딩되면서 단 한 번만 메모리 할당을 받는다.
		//클래스 변수는 객체 생성과 관계없이 클래스 이름으로 접근이 가능함
		System.out.println(Test3.PI);
		Test3 t1;
//		System.out.println(t1.b);//메모리 할당이 되지 않았음.
		t1 = new Test3();//생성자를 불러야만 인스턴스가 메모리에 로드된다.
//		System.out.println(t1.a);//private이므로 컴파일 오류 발생
		System.out.println(t1.b);
		System.out.println(t1.name);
		Test3 t2 = new Test3();
		t2.b=50;
		System.out.println(t1.b +":"+t2.b);
		//클래스변수를 접근할 때는 일반적으로 객체로 접근하지 않는다. (<- a warning message)
		t1.PI=70;
		System.out.println(t1.PI+":"+t2.PI+":"+Test3.PI);
	}
}

class Test3 {
	/*
	 	인스턴스 변수
	 	객체를 생성한 이후에 접근할 수 있음.
	 */
	private int a = 10;//선언과 동시에 초기화. private은 해당 클래스 내에서만 접근할 수 있음.
	int b;//선언과 동시에 초기화 (int => 0)
	String name;// 선언과 동시에 초기화(참조자료형 => null)
	
	/* 
	 	static
	 	클래스 변수: 객체를 생성하지 않아도 접근 가능하며
		객체가 동일한 값을 가진다.
		클래스 변수는 객체로 접근하지 않고 클래스 명으로 접근한다.
	 */
	public static double PI=3.141592;
	
}