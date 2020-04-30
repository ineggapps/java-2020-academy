﻿package d200220;

public class Ex1 {
	public static void main(String[] args) {
		
	}
}


//final class Sam{//final클래스는 하위 클래스를 가질 수 없다.
//	int a;
//}

//class Ex extends Sam{//컴파일 오류}

class Demo1{
	int a;
	public final void print() {//하위 클래스에서 메서드를 오버라이딩할 수 없음
		System.out.println(a);
	}
}

class Demo1Child extends Demo1{
	final int x; //(생성자, 초기화블록에서 초기화하지 않을 경우) 컴파일 오류 (final 변수가 초기화가 되지 않았으므로)
	final int y=10;//반드시 한 번 초기화가 이루어져야 한다.
	//인스턴스 final변수는 선언 시 생성자, 초기화 블록에서 초기화가 가능하다.
	
	static final int A=20;//static 상수를 지정할 때는 대문자이며 선언과 동시에 지정할 수 있음
	static final int B;
	static {
		//static final 변수는 선언 시 혹은 static 초기화 블록에서만 가능하다.
		//static final 변수는 생성자에서 초기화 불가능.
		B=10;
	}
	
	Demo1Child(){
//		B=5;//static상수는 객체 생성자에서는 초깃값 지정을 할 수 없다.
		x=10;//생성자나 초기화 블록에서 선언하면 오류가 발생하지 않는다.
//		x=11;한 번 생성자 블록에서 선언하면 더는 값을 바꿀 수 없다.
	}
	//	public void print() {//cannot override the final method from Demo1
//		//컴파일 오류가 발생한다.
//	}
	
	public void write() {
		final int n;
		n=10;
//		n=20;//n의 로컬 상수 지정은 단 한 번만 가능하다. (컴파일 오류)
//		x=25;//컴파일 오류(상수를 어떻게 바꿔)
		System.out.println(x+":"+y+":"+n);
	}

}