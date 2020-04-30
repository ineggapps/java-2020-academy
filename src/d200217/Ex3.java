package d200217;

import java.math.BigInteger;

public class Ex3 {
	public static void main(String[] args) {
		BigInteger a = new BigInteger("900000000000000000000000000000000");
		BigInteger b = new BigInteger("10000000000000000000000000000000000000000000000000000");
		
		BigInteger c = a.add(b);
		System.out.println(c);
		
		BigInteger d= a.subtract(b);
		System.out.println(d);
		
		BigInteger e = a.multiply(b);
		System.out.println(e);
		
		BigInteger f = a.divide(b);
		System.out.println(f);
	}
}
