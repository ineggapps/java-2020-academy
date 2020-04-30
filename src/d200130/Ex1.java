package d200130;

public class Ex1 {
	public static void main(String[] args) {
		/*
			자바의 정석에 등장하는 구문
		*/
		int a = 34;
		String s;
		s = Integer.toBinaryString(a);
		//Integer클래스를 이용하여 10진수를 2진수로 변환할 수 있다.
		//Returns a string representation of the integer argument as an unsigned integer in base 2. 
		System.out.println(s);
	}
}
