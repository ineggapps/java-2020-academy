package d200130;

public class OperEx6 {
	public static void main(String[] args) {
		int a, b;
		boolean c;

		// 연산의 우선순위에 따라 연산을 수행한다.
		a = 20;
		b = 20;
		c = ++a > 20 && b++ > 20;// true && false
		// ++(1)a>(2)20 &&(5) b++(3)>(4)20;
		System.out.println(a + ", " + b + ", " + c);// 21, 21, false

		// 연산의 우선순위에 따라 연산을 수행한다.
		a = 20;
		b = 20;
		c = ++a > 20 && ++b > 20;// true && true
		System.out.println(a + ", " + b + ", " + c);// 21, 21, true

		// 연산의 우선순위에 따라 연산을 수행한다.
		// b의 값 변화에 유의한다
		// ★ 논리곱 연산(&&)에서 좌변에서 false값이 나오면 우변의 연산을 중단한다. (JAVA 기준)
		a = 20;
		b = 20;
		c = a++ > 20 && ++b > 20;// 이미 좌변의 a++>20에서 false가 나왔으므로 우변의 연산을 진행하지 않고 다음 구문으로 넘어간다.
		System.out.println(a + ", " + b + ", " + c);// 21, 20, false

		//논리합 연산
		a=20;
		b=20;
		c=a++>20 || ++b>20;
		System.out.println(a + ", " + b + ", " + c);// 21, 21, false
		
		//논리합 연산
		//★논리합 연산(||)에서는 좌변에서 true값이 나오면 우변의 연산을 중단한다. (JAVA 기준)
		a=20;
		b=20;
		c=++a>20 || ++b>20;
		System.out.println(a + ", " + b + ", " + c);// 21, 20, true
		
	}
}
