package d200217;

public class Ex1 {
	public static void main(String[] args) {
		int a = 10, b;
		Integer ob;
		String s, s1, s2;
		double d;

		// 객체와 기본자료형은 기본적으로 형변환이 불가능하다.
		// 상하관계가 아닌 경우 객체간에는 형변환이 불가능하다.

		// JDK 5.0부터 Autoboxing, Autounboxing을 지원한다.

		ob = a;
		// 기본 자료형 int가 Integer로 형이 자동으로 변환되었다.
		// 실제로는 ob = new Integer(a);의 명령구문을 컴파일할 때 변환한 것이다.
		// 이를 Auto boxing이라고 한다.

		b = ob;
		// Integer 객체의 값이 자동으로 기본자료형인 int형으로 변환되었다.
		// 실제로는 b = ob.intValue();의 명령구문을 컴파일할 때 변환한 것이다.
		// 이를 Auto unboxing이라고 한다.

		System.out.println(a + ":" + ob + ":" + b);

		s1 = "123";
		s2 = "456";
		// a=s1+s2; //당연히 컴파일 오류가 발생한다.

		// 문자형임에도 불구하고 Integer의 static method를 사용하면 int형으로 변환하여 연산이 가능하다.
		a = Integer.parseInt(s1) + Integer.parseInt(s2);
		System.out.println(a);

//		a = Integer.parseInt("123.5");// 런타임 오류 java.lang.NumberFormatException
		// 소숫점이 있는 숫자는 정수로 변환이 불가능하므로 오류를 발생시킨다.

//		a = Integer.parseInt("1,234");//런타임 오류 java.lang.NumberFormatException
		// 숫자로 변환할 수 없는 모든 문자열이 삽입되어 있는 경우에는 위와 같은 오류가 발생한다.

		a = 10;
		s = 'A' + a + "Korea";
		System.out.println(s);// 75Korea

		// Integer클래스의 문자열로 바꾸는 메서드가 존재한다.
		s = 'A' + Integer.toString(a) + "Korea";
		System.out.println(s);// A10Korea

		a = Integer.parseInt("101");
		System.out.println(a);// 101

		a = Integer.parseInt("101", 2);// 2진수로 101...
		System.out.println(a);// 5

		a = Integer.parseInt("A1", 16);// 16진수로 A1
		System.out.println(a);// 10진수로 변환된 결괏값인 161이 반환된다.

		a = 123;
		s = Integer.toBinaryString(a);
		System.out.println(s);// 2진수로 변환된 1111011

		s = Integer.toHexString(a);
		System.out.println(s);// 16진수로 변환된 7b

	}
}
