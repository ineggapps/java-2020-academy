package d200213;

public class Ex9 {
	public static void main(String[] args) {
		Test9 t1 = new Test9();
		///객체 자체를 출력하면 패키지명.클래스명@해시코드(16진수)가 출력된다.
		System.out.println("main: "+t1);
		t1.print();
		System.out.println("==========");
		Test9 t2 = new Test9();
		t2.set(200);
		System.out.println("main: "+t2);
		t2.print();
	}
}

class Test9 {
	private int a=10;
	
	public void set(int a) {
		this.a=a;//인스턴스변수의 값을 수정하고자 하는 의도라면 this.a에서 this를 생략할 수 없다
		//왜냐하면 지역변수도 a라는 변수명을 가지고 있어서 a=a; 로 선언해 버리면 지역변수 a값에 지역변수 a값을 대입하는 연산을 수행하기 때문이다.
	}
	
	public int get() {
		return a;
//		return this.a;
	}
	
	public void print() {
		System.out.println(this);
//		System.out.println(this.a);
		System.out.println(a);//this를 생략해도 알아서 인스턴스 변수를 찾아주네!
		//원래 인스턴스 변수를 접근할 때는 객체명.a 따위로 접근하니까!
		//그런데 나 자신의 객체를 참조할 때는 this.a로 지정하여 접근한다.
		
	}
}