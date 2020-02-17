package d200217;

public class Ex1 {
	public static void main(String[] args) {
		int a=10,b;
		Integer ob;
		String str;
		double d;
		
		
		//객체와 기본자료형은 기본적으로 형변환이 불가능하다.
		//상하관계가 아닌 경우 객체간에는 형변환이 불가능하다.
		
		// JDK 5.0부터 Autoboxing, Autounboxing을 지원한다.
		
		ob=a;
		//기본 자료형 int가 Integer로 형이 자동으로 변환되었다.
		//실제로는 ob = new Integer(a);의 명령구문을 컴파일할 때 변환한 것이다.
		//이를 Auto boxing이라고 한다.
		
		b=ob;
		//Integer 객체의 값이 자동으로 기본자료형인 int형으로 변환되었다.
		//실제로는 b = ob.intValue();의 명령구문을 컴파일할 때 변환한 것이다.
		//이를 Auto unboxing이라고 한다.
	}
}
