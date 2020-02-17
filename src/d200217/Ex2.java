package d200217;

public class Ex2 {
	public static void main(String[] args) {
//		Long ob1=10;//컴파일 오류. 
		// 원래는 기본자료형과 클래스 간의 변환은 불가능하다.
		// 따라서 Long형에 기본자료형을 대입하고 싶으면 10L을 입력한다.
		Long ob1 = 10L;
		ob1 = new Long(10); // 이 방법은 가능하다. 기본자료형 long은 int형 값을 포괄할 수 있으니까.
		long lll = 10; // <- 가능하니까 new Long(10)도 가능하단 말씀! 생성자는 Long(long value)이다.
		Integer ob2 = 10;

		Long ob3;
//		ob3=ob2;//컴파일 오류 Long과 Integer는 다른 클래스이므로 이와 같은 객체 간의 형변환은 절대 불가능하다
//		ob3=(Long)ob2; //컴파일 오류 (당연히 형변환 안 됨)
		long a;
		a=ob2;//Integer객체가 auto unboxing되어 int형으로 변환되었고 long형이 받아들일 수 있다.
		//a = ob2.intValue(); 컴파일러가 이 구문을 자동으로 실행하여 long형으로 캐스팅되어 들어간 것이다.
 		ob3= new Long(ob2);
 		
 		System.out.println(ob1);
 		System.out.println(ob2);
 		System.out.println(a);
 		
 		System.out.println(Long.MAX_VALUE);
 		System.out.println(Long.MIN_VALUE);
 		System.out.println(Double.MAX_VALUE);
 		System.out.println(Double.MIN_VALUE);
	}
}
