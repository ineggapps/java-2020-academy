package variables;

public class TypeEx {
	public static void main(String[] args) {
		int a; // a 변수를 정수형으로 선언, a는 초기화가 되어있지 않은 상태
//		System.out.println(a);//a가 초기화가 되어 있지 않으면 출력할 수 없다.
		a = 30;// 10진수 입력
		System.out.println(a);// 30

		a = 030;// 8진수 입력
		System.out.println(a);// 24

		a = 0x30;// 16진수 입력
		System.out.println(a);// 48

		a = 0b101;// 2진수 입력
		System.out.println(a);// 5
		
//		Error case
//		#1. a=080;//the literal 080 of type int is out of range. 8진수에는 8이 없다.
//		#2. a= 2200000000;//마찬가지로 int 범위를 초과하여 오류가 발생한다.
		
		long b;
//		b=2200000000;//컴파일 오류, int형 literal은(int 상수) 22억을 표현할 수 없다.
		b=2200000000L;//long형 literal(long형 상수)을 선언함.
		System.out.println(b);
		
//		a=10L;//Type mismatch: cannot convert from long to int (Long형 상수를 int형 변수에 대입할 수 없다)
//		a=2_0_1;//==201 (언더바를 빼고 생각하면 된다)
		
	}
}
