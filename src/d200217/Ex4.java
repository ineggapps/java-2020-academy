package d200217;

import java.math.BigDecimal;

public class Ex4 {
	public static void main(String[] args) {
		BigDecimal a = new BigDecimal("1234512341523123123"); //실수 처리까지 가능
		
		System.out.println(a.toString());
		
		BigDecimal b = a.movePointLeft(3);//소숫점 왼쪽으로 3칸 이동
		System.out.println(b);
		
		BigDecimal c = a.divide(b);
		System.out.println(c);

		c = a.divide(b, BigDecimal.ROUND_DOWN);
		System.out.println(c);
		
		c = a.divide(b,5, BigDecimal.ROUND_DOWN);//5는 유효자릿수를 5개로 하겠다는 의미
		System.out.println(c);
	}
}
