package d200220;

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
	Demo1Child(){
		x=10;//생성자나 초기화 블록에서 선언하면 오류가 발생하지 않는다.
//		x=11;한 번 생성자 블록에서 선언하면 더는 값을 바꿀 수 없다.
	}
	//	public void print() {//cannot override the final method from Demo1
//		//컴파일 오류가 발생한다.
//	}

}