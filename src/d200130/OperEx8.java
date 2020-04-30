package d200130;

public class OperEx8 {
	public static void main(String[] args) {
		int a,b;
		a=1658;
		b=1234;
		
		//암호화를 위한 기본적인 연산은 XOR이다.
		
		a=a^b;//암호화에 응용될 수 있다.
		System.out.println(a);// 680
		
		a=a^b;//복호화에 응용될 수 있다.
		System.out.println(a);// 1658
	}
}
