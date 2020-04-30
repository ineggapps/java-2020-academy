package d200129;

public class OperEx2 {
	public static void main(String[] args) {
		byte b1 = 5, b2 = 10, b3;
//		b3=b1+b2; 컴파일 오류
		b3 = (byte) (b1 + b2);
		System.out.println(b3);
//		b1=200;//컴파일 오류. overflow가 발생한다.
		b1 = 100;
		b2 = 120;
		b3 = (byte) (b1 + b2);
		System.out.println(b3);// 오류는 발생하지 않지만 overflow가 발생하여 숫자가 잘린다. (-36)

		int x, y, z;
		x=2000000000;
		y=2000000000;
		z=x+y;
		System.out.format("int형에서의 연산 결과: %d\n",z);//오류는 발생하지 않지만 overflow가 발생한다. (int가 표현할 수 있는 정수의 범위를 초과함)
		
		z=b1+b2;
		System.out.format("byte형 변수에 담긴 값을 계산하여 int형 변수에 대입 %d\n",z);
		
		long s;
//		s=x+y; //(int+int);//여전히 피연산자의 형태가 int이기 때문에 int를 기준으로 연산이 수행되었다(==이미 overflow가 발생한 상황임)
		s=(long)x+y; //또는
		s=2000000000+2000000000L;
		System.out.format("long형 변수에 담기 위한 연산: %d\n",s);//4000000000 10^9=10억
	}
}
