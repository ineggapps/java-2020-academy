package d200214;

public class Ex1 {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		Test1 t2 = new Test1();
		Test1 t3 = t2;

		boolean b = t1.equals(t2);
		System.out.println(b);
		System.out.println(t1 == t2);

		b = t2.equals(t3);
		System.out.println(b);

		String s ;
		s=t1.toString();//클래스 정보: 패키지명.클래스명@해시주소16진수로출력
		System.out.println(s);
		
		System.out.println(t2);
		System.out.println(t3.toString());
		System.out.println(t3);
		
		System.out.println("==해시코드==");
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());
	}
}

class Test1 {
	private int a = 10;

	public void print() {
		System.out.println(a);
	}
}
