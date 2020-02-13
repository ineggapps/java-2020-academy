package d200213;

public class Ex6 {
	//생성자 this 실습
	public static void main(String[] args) {
		Test6 t = new Test6();
		t.write();
	}
}

class Test6{
	private int n;
	
	//생성자는 리턴타입을 언급하지 않는다 .
	//리턴타입을 언급하는 순간 일반적인 객체의 메서드가 되어 버린다.
	//생성자는 new를 이용하여 객체를 생성할 떄 호출된다.
	//생성자 안에서 초기화를 수행한다.
	Test6(){
		n=10;
		n++;
		System.out.println("인자 없는 생성자 호출");
	}
	
	public void write() {
		System.out.println(n);
	}
}
