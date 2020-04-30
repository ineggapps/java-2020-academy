package d200129;

public class OperEx3 {
	public static void main(String[] args) {
		int a = 10, b = 7, c;
		c = a + b;
		System.out.format("합: %d%n", c);
		c = a - b;
		System.out.format("차: %d%n", c);
		c = a * b;
		System.out.format("곱: %d%n", c);
		c = a / b;
		System.out.format("몫: %d%n", c);
		c = a % b;
		System.out.format("나머지: %d%n", c);

		double x, y, z;
		x = 10.5;
		y = 5.1;

//		z=x/y;
		z = x % y;
		System.out.println(z);
		
		int aa;
		aa=1/2+1/2+3/2;
		System.out.println(aa);
		
		double bb;
		bb=1/2+1/2+3/2;
		System.out.println(bb);

		double cc;
		cc=1/2+1/2+3/2.0;
		System.out.println(cc);
	}
}
