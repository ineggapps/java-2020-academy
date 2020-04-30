package d200213;

public class Ex2 {
	public static void main(String[] args) {
		Test2 ob = new Test2();

		short a=10;
		Short b = 10;
		int c=10;
		Integer d = 10;//int를 클래스로 만든 것
		long e = 10;
		Long f=10L; // Long f=10; //오류
		
		/*
		 * 메서드를 찾는 순서 정하기
			메서드명과 파라미터로 메서드를 결정한다.
			1. 실매개변수와 자료형이 100% 동일한 것 검색 (클래스는 클래스, 기본자료형은 기본자료형)
			2. 기본형은 기본형 중 가장 가까우면서 큰 자료형을 찾는다.
			3. 동일한 자료형이 없고 기본형 중 큰 자료형이 없으면 같은 크기의 Wrapper class를 찾는다.
		 * */
		
		ob.write();
		ob.write(a);
		ob.write(b);
		ob.write(c);
		ob.write(d);//Integer클래스객체임에도 불구하고 int형 메서드를 호출한 결과가 나왔다.
		//매개변수에 Integer가 없지만 int를 넘겨 받을 수 있다.
		ob.write(a,b);//★(int, int)메서드를 호출한 결과가 나왔다.
		//int형은 short(또는 Short에 든 값)보다 크기 때문에 자동으로 매개변수가 맞는 메서드를 호출한다.
		ob.write(e);//long 자료형은 Long클래스를 매개변수로 한 타입이 잡았다.
		ob.write(f);//long 자료형은 Long클래스를 매개변수로 한 타입이 잡았다.
	
		short s=10;
		//Test2클래스에서 short형을 받는 매개변수를 주석처리하여 실행하면 int형 매개변수를 받는 메서드를 호출한다.
		System.out.println("short형을 보내면 어떤 메서드가 호출될까?");
		ob.write(s);
	
	}
}

class Test2 {
	public void write() {
		System.out.println("인자 없는 메서드");
	}

//	//컴파일 오류 (메서드 오버로딩은 매개변수로만 구분하기 때문에)
//	public int write() {
//		return 0;
//	}
//
//	public void write(short a) {
//		System.out.println("short..." + a);
//	}

	public void write(int a) {
		System.out.println("int..." + a);
	}

	public void write(int a, int b) {
		System.out.println("int가 2개!..." + a + "," + b);
	}

//	short를 클래스로 만든 것
	public void write(Short a) {
		System.out.println("Short....." + a);
	}

	//Long을 클래스로 만든 것
	public void write(Long a) {
		System.out.println("Long....." + a);
	}

//	public void print(Short a) {
//		System.out.println("Short...");
//	}
	
	
	public void print(int b) {
		System.out.println(b);
	}
	
	
}