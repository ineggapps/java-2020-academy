package d200219;

public class Ex6 {
	public static void main(String[] args) {
		Test6 ob = new Test6();
//		ob.print();
		
		ob.fun();
	}
}

class Demo6 {
	int a = 10;

	public void print() {
		System.out.println(a);
	}
	
}

class Test6 extends Demo6 {
	int x = 100;

	@Override // 실행 시까지 생명주기를 나타낼 수 있음.
	public void print() {// 2)
		System.out.println(a + ":" + x);
	}

	public void fun() {
		print(); // 2) 주석이 있는 print() 메서드를 호출한다.
		super.print();
	}
}