package d200129;

public class OperEx3 {
	public static void main(String[] args) {
		int a = 10, b = 7, c;
		c = a + b;
		System.out.format("ÇÕ: %d%n", c);
		c = a - b;
		System.out.format("Â÷: %d%n", c);
		c = a * b;
		System.out.format("°ö: %d%n", c);
		c = a / b;
		System.out.format("¸ò: %d%n", c);
		c = a % b;
		System.out.format("³ª¸ÓÁö: %d%n", c);

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
