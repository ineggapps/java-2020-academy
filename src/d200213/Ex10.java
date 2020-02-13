package d200213;

public class Ex10 {
	public static void main(String[] args) {
		Test10 t = new Test10();
		t.set(999);
		t.print();
		System.out.println("====");
		Test10.write();
	}
}

class Test10 { 
	private int a;
	
	public void set(int a) {
		this.a=a;
	}
	
	public void fun() {
		System.out.println("fun...");
	}
	
	public void print() {
		this.fun();//this 생략이 가능하다.
		System.out.println(this.a);//지역변수에서 a라는 이름이 사용되지 않았기 때문에 여기서도 this키워드는 생략해도 된다.
	}
	
	public static void write() {
//		System.out.println(this.a);//컴파일오류: static에서는 인스턴스 메서드나 변수를 참조할 수 없음에 유의한다.
	//클래스 메서드는 객체 생성과 무관하므로 호출한 객체를 나타내는 this를 사용할 수 없다.
		Test10 t = new Test10();
		t.a=10;//클래스 메서드에서는 인스턴스변수는 객체를 생성한 뒤에만 접근이 가능하다.
		t.print();
	}
}