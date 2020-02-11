package d200211;

public class Ex4 {
	public static void main(String[] args) {
		Test4 t1;
		t1=new Test4();//new Test4() 객체를 생성하지 않으면 메서드나 변수를 사용할 수 없다는 것에 유의한다.
		//객체를 생성한다 == 생성자를 호출한다
		t1.print();//메서드 호출
		t1.b=5;
		t1.print();
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
