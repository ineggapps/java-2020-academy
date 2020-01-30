package d200130;

public class OperEx9 {
	public static void main(String[] args) {
		int a=13, b=28;
		int c;
		
		//#1. 홀짝을 판별하는 일반적인 방법
		//but, 컴퓨터는 나눗셈 연산이 가장 느리다.
		System.out.println(a%2==1); // true (홀수이다)
		System.out.println(b%2==0); // true (짝수이다)
		
		//#2. 비트연산을 이용하여 홀짝을 판별하는 빠른 방법 (2진수 2^0이 1인 경우)
		//모든 홀수는 2진수의 가장 마지막 자리가 1이다.
		//모든 짝수는 2진수의 가장 마지막 자리가 0이다.
		//따라서 가장 마지막 자리가 0인지 1인지를 판별하면 홀짝 판별이 가능하다.
		// (가장 마지막 비트와 and연산을 하면 된다)
		//System.out.println(a&1==1); //Error, 연산자 우선순위에 따른 오류가 발생한다. 
		//(∵ 산술 > 관계 > 논리 연산 순서대로 수행함, int형인 a와 boolean형인 1==1는 & 연산을 수행할 수 없다. 자료형이 다르니까.)
		c=a&1;
		System.out.println(c);
		System.out.println((a&1)==1);
		c=b&1;
		System.out.println(c);
		System.out.println((b&1)==0);
		
		/*
		 * 모든 짝수는 &1 연산을 하면 0이 나온다.
		 * int a=10일 때 10은 2진수로 1010이다.
		 * &연산으로 1을 계산하면
		 * 1010
		 & 0001
		 * ------
		 * 0000 => 10진수로 변환하면 0이다.
		 * 
		 * 모든 홀수는 &1 연산을 하면 1이 나온다.
		 * int a=11일 때 10은 2진수로 1011이다.
		 * &연산으로 1을 계산하면
		 * 1010
		 * 0001
		 * ------
		 * 0001 => 10진수로 변환하면 1이다.
		 * */
	}
}
