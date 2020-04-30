package d200220;

public class Ex5 {
	public static void main(String[] args) {
//		Demo5 ob = new Demo5(); //인터페이스는 객체생성 불가능
		
		Demo5 ob = new Test5();//업캐스팅 (가능)
		ob.print();
		
//		ob.sub();//호출 불가능, 컴파일 오류
		((Test5)ob).sub();//다운 캐스팅
	}
}

//선언만 있고 정의가 없는 추상클래스의 일종
interface Demo5 {
	public static final double PI = 3.141592;// 작성은 이렇게 할 것을 권장...
	public int A = 10;// static final 없어도 static final로 선언된 것 같은 효과

	// JDK8버전 이전에서는 메소드 시그니처 선언까지만 가능하다(내용 기술 불가)
	public abstract void print();

	void fun();// public이 없어도 public,
	// abstract가 없어도 abstract키워드를 지정한 것이나 마찬가지이다.

	// JDK8버전부터는 default 메서드와 static 메서드를 만들 수 있다.
}

class Test5 implements Demo5 {
	int a = 10;

	@Override
	public void print() {
		System.out.println("print...");
	}

	@Override
	public void fun() {
		System.out.println("fun...");
	}
	
	public void sub() {
		System.out.println("sub...");
	}

}