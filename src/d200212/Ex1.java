package d200212;

public class Ex1 {
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.print();
		t.add();
		t.print();
		
		t.write(1010);
	}
}

class Test1 {
	int a = 10;//인스턴스 변수 => 클래스 안에서 필드는 전역변수 개념이라고 인식하면 된다.

	public void add() {
		a++;
	}

	public void print() {
		System.out.println(a);
	}

	public void write(int a) {//여기서 매개변수 a는 지역변수라고 받아들여도 무방하다.
//		int a; << 지역변수의 일부인 매개변수 a가 이미 선언되었으므로 매개변수명과 겹치는 지역변수명을 또 선언할 수는 없다.
//		필드와 지역변수의 이름이 동일할 수는 있음. 단, 동일할 경우에는 지역변수의 우선순위가 높다.
		System.out.println(a);//매개변수 a값을 의미함.
	}
}