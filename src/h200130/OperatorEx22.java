package h200130;

public class OperatorEx22 {
	public static void main(String[] args) {
		float f = 0.1f; // float 실수형 변수에 float형 실숫값인 0.1을 대입한다.
		double d = 0.1;// double 실수형 변수에 double형 실숫값인 0.1을 대입한다.
		double d2 = (double) f;// float실수형 변수를 double형으로 강제 형변환하여 d2에 대입한다.

		System.out.printf("10.0==10.0f	%b%n", 10.0 == 10.0f);//true
		/*
			float형 실수 == double형 실수는 같을까? 항상 참은 아니다.
			10.0의 경우에는 오차가 없이 저장할 수 있는 값이기 때문에 (가수부 1다음 모두 0) 같다고 판별하지만,
			에 따라서는 거짓이 나올 수도 있다 (다음 구문 참조)
		 * */
		System.out.printf("0.1==0.1f	%b%n", 0.1 == 0.1f);//false
		/* 
			0.1f == 0.1의 경우에는 float과 double의 정밀도가 다르므로 가수부에 각기 다른 값이 저장된다.
			0.1f => 0.10000000149011612
			0.1d =>0.10000000000000000
			따라서 false값을 반환하게 된다.
		 * */
		/*
		 %19.17f (총 19자리에서 소숫점은 17째 자리까지만 나타내되 소숫점 18번째 자리에서 반올림하여 나타낸다) 
		 */
		System.out.printf("f=%19.17f%n", f );//f 값에 대입된 0.1f값인 0.10000000149011612 값이 형식에 맞추어 반환된다.
		System.out.printf("d=%19.17f%n", d );//d 값에 대입된 0.1d값인  =>0.10000000000000000 값이 형식에 맞추어 반환된다.
		System.out.printf("d2=%19.17f%n", d2 );//d2는 f값이 double 형식에 맞추어 저장된 값인 0.10000000149011612d가 반환된다.
		System.out.printf("d==f		%b%n", d == f);//false
		/*
		 d==f의 연산은 앞의 구문인 0.1==0.1f의 연산과 동일하다. 
		 따라서 false를 반환한다.
		 * */
		System.out.printf("d==d2	%b%n", d == d2);
		/*
		 * ★true일 것 같지만 false값을 반환한다.
		 d2는 float형태의 변수인 f의 값이 강제로 double형태로 변환되어 저장된 값이다.
		 float형태의 변수의 값인 f가 double 형태로 변환되어 저장되는 과정을 전개하면 다음과 같다.
		 f =0.10000000149011612f;
		 d2= (double)0.10000000149011612; 
		 그러나 d의 값은 0.10000000000000000이므로 값이 일치하지 않는다.
		 */
		System.out.printf("d2==f		%b%n", d2 == f);
		/*
		★false일 것 같지만 true값을 반환한다.
		앞에서 d2는 float형태의 변수인 f의 값이 강제로 double형태로 변환되어 저장되었다.
		가수부의 길이가 더 길 뿐 정밀도의 표현은 동일하다. 따라서 d2==f의 값은 true를 반환한다.
		 * */
		System.out.printf("(float)d==f	%b%n", (float) d == f);
		/*
		 	d => 0.10000000000000000 이었다.
		 	하지만 double형이었는데 강제로 형변환을 하면 float형식에 맞추어야 한다.
			(float)0.1d를 수행하면  0.10000000149011612로 변환된다.
			따라서 d==(float)0.1d==0.10000000149011612이다.
			f 또한 0.10000000149011612를 의미하므로 d==f는 true를 반환한다.
		 */
		System.out.printf("%19.17f%n",(float)0.1d);
	}
}
