package d200131;

public class OperEx3 {
	public static void main(String[] args) {
		short a;
		byte b;
		int c;
		long d;

		a = 10;
		c = a;// 자동으로 컴파일러가 a변수의 short 타입을 int형으로 변환을 시도한다.
//		b=a;//컴파일 오류 / cannot convert from byte to short 큰 것을 작은 것에 대입할 수 없다
		b = (byte) a;// 강제로 형을 변환한다
		System.out.println(b);// 10 (오버플로가 일어나지 않음)

		a = 200;
		b = (byte) a;
		System.out.println(b);// 200은 byte형에서 표현할 수 없다 -128~127까지만 표현이 가능하다. 따라서 오버플로가 발생하여 전혀 다른 값인 -56이 출력된다.
		
		c='A'+10;//char+int => int + int 형으로 변환하여 연산을 수행한다. ('A'=65)
		System.out.println(c);
	
		c=1_000_000;
		d=c*c;//int * int => int형으로 나오는데, 이것을 long형 변수인d에 대입한 것이므로 최종적으로는 d에 대입되면서 long형으로 캐스팅이 되었다
		System.out.println(d);//하지만 곱하면서 연산의 결과가 int형의 범위를 초과하였으므로 잘림현상이 발생하였고 발생한 뒤에 long형 변수에 대입되었다.
		d=(long)c*c;// 캐스팅된 long * int => long * long => long형의 결괏값이 나온다.
		System.out.println(d);//곱셈 연산을 하기 전에 long형으로 이미 변환을 시도하였으므로 원하는 결괏값이 출력이 된다.		
	}
}
