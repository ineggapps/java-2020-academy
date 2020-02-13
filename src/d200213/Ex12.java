package d200213;

public class Ex12 {
	public static void main(String[] args) {
		Test12 t = new Test12();
		Test12 t2 = new Test12();
		t.print();
		t2.print();
		
		/*
		 클래스 로딩할 때(==객체를 생성하거나 Test12.b=33와 같이 class를 로드를 유발할 때)
		 1) ★ static 변수 메모리 할당 초기화 (b=0)
		 2) ★ static 초기화 블록 실행문 수행
		 단, 1) 2) 과정은 클래스가 로딩되면 단 한 번만 실행된다.
		 객체를 로딩할 때 
		 1) new => 객체 생성 수행: a 인스턴스 변수 메모리에 할당한다.
		 2) a는 기본값으로 초기화가 진행된다 (int형이니까 0으로 초기화된다.)
		 3) 초기화 식을 실행한다 (현재는 a에 대한 초깃값을 명시하지 않았으므로 건너뛴다)
		 4) 초기화 블록을 실행한다.
		 5) 생성자 안에 기입된 초기화 작업을 수행한다.
		 */
	}
}

class Test12 {
	private int a;
	static int b;

	static {
		// 클래스 초기화 블록
		// 클래스니까 당연히 프로그램 실행 이후 클래스가 로딩될 때 단 한 번만 수행된다.
//		a=20;//static초기화 블록에서도 마찬가지로 인스턴스 변수를 이용할 수 없다!
		b = 100;
		System.out.println("static 초기화 블록. 클래스가 로드될 때 단 한 번 수행!");
	}

	{
		// 인스턴스 초기화 블록
		// 객체가 생성될 때마다 실행된다.
		a = 88;
		System.out.println("인스턴스 초기화 블록");
	}

	public Test12() {
		System.out.println("생성자...");
	}

	public void print() {
		a++;
		b++;
		System.out.println(a + ":" + b);
	}
}
