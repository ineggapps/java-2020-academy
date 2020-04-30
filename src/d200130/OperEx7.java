package d200130;

public class OperEx7 {
	//formatter 금지
	public static void main(String[] args) {
		int a, b, c;
		a = 12;
		b = 6;

		c = a & b;// 각 자릿숫값이 1과 1인 경우만 1이다.
		/*
		 	0000 1100
		 &	0000 0110
		----------------------
		 	0000 0100 (==4)
		 * */
		System.out.println("a & b = "+c);

		c= ~a; //a(32bit)를 반전한 숫잣값(2의 보수=> 음수의 절대치로 변환하면 -13이 나온다.)
		System.out.println("~a = " + c);
		
		c = a | b;// 각 자릿숫값 중 하나라도 1이면 1이다.
		/*
		 	0000 1100
		 |	0000 0110
		----------------------
		 	0000 1110 (==14)
		 * */
		System.out.println("a | b ="+c);

		c = a ^ b;// 각 자릿숫값이 서로 같으면 0 다르면 1이다.
		/*
		 	0000 1100
		 ^	0000 0110
		----------------------
		 	0000 1010 (==10)
		 * */
		System.out.println("a ^ b = " + c);

	}
}
