package d200211;

public class Ex4 {
	public static void main(String[] args) {
		Test4 t1;//비어 있는 상태가 아니라 쓰레깃값을 참조하고 있는 상태라고 받아들이자!
		//레퍼런스 변수는 객체의 "주솟값"을 가지고 있다. 객체 그 자체를 가지는 것이 아니다.
		t1=new Test4();//new Test4() 객체를 생성하지 않으면 인스턴스 메서드나 인스턴스 변수를 사용할 수 없다는 것에 유의한다.
		//객체를 생성한다 == 생성자를 호출한다
		//★ t1=new Test4(); 구문을 실행하지 않은 채 t1의 메서드를 호출하면 "컴파일"오류가 발생한다.
		//컴파일 오류가 발생하는지, 런타임 오류가 발생하는지의 차이점을 명확히 구별하자!
		t1.print();//메서드 호출
		t1.b=5;
		t1.print();
//		t1 = null;//t1은 null을 지정하여 gc에 의해 수집되도록 한다.
		//↑ 참조변수에 null값을 대입하면 한참동안 사용하지 않을 때 gc에 빨리 수집될 가능성이 올라감.
		
		//가장 흔한 런타임 오류 NullPointerException
		Test4 t2  = null;//null은 객체가 생성되지 않은 비어있는 상태를 의미한다.
		//객체가 생성되지 않은 상태에서 "인스턴스"의 변수나 "인스턴스"의 메서드를 참조할 경우 오류가 발생한다.
		t2.print();
		//오류가 발생한 시점에서 프로그램이 중단된다.
		System.out.println("end...");
	}
}

class Test4 {
	private int a = 10;// 인스턴스 변수. private 이므로 클래스 내부에서만 접근이 가능하다.
	int b;

	// 인스턴스 메서드
	public void print() {
		++a;
		System.out.println(a+":"+b);
	}
}
