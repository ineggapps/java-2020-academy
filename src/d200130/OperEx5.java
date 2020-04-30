package d200130;

public class OperEx5 {
	public static void main(String[] args) {
		//논리곱 예제
		int a, b;
		boolean c;
		a = 10;
		b = 5;
		// c = a&& b; 컴파일오류 &&(논리곱)은 피연산자가 boolean type이어야 한다.
		c = a > b && false;// => true && false
		System.out.println(c);// false
		c = a > b && true;// => true && true
		System.out.println(c);// true

	}
}
