package d200213;

public class Ex11 {
	public static void main(String[] args) {
		Test11 t = new Test11();
		t.write();
		Test11 t2 = new Test11();
		t2.write();
	}
}

class Test11 {
	private int a;
	private int b = 20;
	/*
		 객체 생성 과정
		 1) new => 객체 생성 수행: a,b 인스턴스 변수 메모리에 할당한다.
		 2) a,b는 기본값으로 초기화가 진행된다 (int형이니까 0으로 초기화된다.)
		 3) 초기화 식을 실행한다 : b=20;
		 4) 초기화 블록을 실행한다.
		 5) 생성자 안에 기입된 초기화 작업을 수행한다.
	 */
	// a=10; //컴파일 오류 ... 실행문이 올 수 없는 영역. 오로지 인스턴스 변수를 선언하는 영역일 뿐이다.

	{
		// 인스턴스 초기화 블록
		a = 10;
		System.out.println("인스턴스 초기화 블록입니다.");
		// 하지만 쓸 일은 거의 없다.
	}

	public Test11() {// 생성자
		System.out.println("생성자가 실행되었습니다.");
	}

	public void write() {// 인스턴스 메서드
		System.out.println(a + ":" + b);
	}
}