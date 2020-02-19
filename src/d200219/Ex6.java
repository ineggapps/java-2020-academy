package d200219;

public class Ex6 {
	public static void main(String[] args) {
		Test6 ob = new Test6();
		ob.print();

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
	public void print() {
		System.out.println(a + ":" + x);
	}
}