package d200212;

public class Ex5 {
	//JVM이 불러야하므로 접근제한자는 public으로 예약어를 붙어야 한다.
	public static void main(String[] args) {
		Test5.write();
		//JAVA는 static키워드가 있어야(클래스 메서드) 바로 불러와서 실행할 수 있다.
		Test5 tt = new Test5();
		tt.print();
	}
}

class Test5 {
	// 인스턴스변수: 객체를 생성해야 사용할 수 있음, 객체 생성 수만큼 메모리에 할당된다.
	// 인스턴스 변수와 메서드는 객체로 접근(객체를 참조하는 변수로 접근)해야 한다.
	int a = 10;
	int b = 20;
	// 클래스 변수: 객체 생성과 관계없이 바로 사용할 수 있음
	// 프로그램 실행 시 객체 생성 개수와 관계없이 단 한 번만 메모리에 할당된다.
	// 클래스명으로 접근한다.
	static int c = 30;

	// 인스턴스 메서드: 객체를 생성해야 호출할 수 있음
	public void print() {
		int n = 5;//지역변수: 한 번도 할당하지 않고 해당 메서드를 실행할 때에만 메모리를 "스택" 영역에 할당한다.
		System.out.println(a + ":" + b + ":" + c);
		//메서드 실행을 마친 이후에는 사라진다.
	}

	// 클래스 메서드: 객체 생성과 관계 없이 바로 사용할 수 있음
	//클래스이름으로 호출한다.
	public static void write() {
//		System.out.println(a+":"+b+":"+c);//컴파일 오류 발생 Cannot make a static reference to the non-static field variables.
		//클래스메서드에서는 인스턴스 변수를 객체 생성 없이 호출할 수 없다.
		System.out.println(c);
		
		//자신의 클래스에서 자신의 객체를 생성하여 참조할 수 있다.
		//심지어 클래스 메서드에서도 객체를 생성하여 인스턴스 변수를 참조할 수 있다.
		Test5 tt = new Test5();
		System.out.println(tt.a + ":" + tt.b);
	}
}