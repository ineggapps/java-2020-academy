package d200219;

public class Ex1 {
	public static void main(String[] args) { 
		Demo1 d = new Demo1();
		System.out.println(d.b);
		//d.print(); //오류. 하위 클래스의 메서드, 필드는 접근할 수 없다. (어떻게 보면 당연한 이야기)
		Test1 t = new Test1();
		t.write();
		//t.a; //컴파일 오류 super class의 변수가 private이므로 상속이 되지 않아서 조회할 수 없음.
		System.out.println(t.b+":"+t.c);
		t.print();
	}
}

class Demo1 {
	private int a = 10;
	protected int b=20;
	public int c= 30;
	
	public void write() {
		System.out.println(a+":"+b+":"+c);
	}
}

class Test1 extends Demo1{
	int x=100;
	
	public void print() {
		System.out.println(x+":"+b+":"+c);
//		System.out.println(a);//컴파일 오류 super class의 private은 상속받을 수 없음
	}

}