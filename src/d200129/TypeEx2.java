package d200129;

public class TypeEx2 {
	public static void main(String[] args) {
		float a = 2000000000;
		float b = 2000000050;
		// float에서는 2진수에서 0.2가 무한소수이다. 따라서 float의 범위보다 초과하므로 잘리게 되어 a와 b가 같은 값이 나오게 된다.

		double c = 2000000000;
		double d = 2000000050;
		System.out.println(a + ", " + b);
		System.out.println(c + ", " + d);

		System.out.printf("%.2f, %.2f\n", a, b);//2000000000.00,2000000000.00 출력
		System.out.printf("%.2f, %.2f\n", c, d);//2000000000.00,2000000050.00 출력

		// float형을 사용할 때는 크기의 범위를 생각하면서 사용해야 한다.
		System.out.println(a == b);// 정밀도가 낮기 때문에 b가 2000000000으로 저장되어 true의 결괏값이 나온다.
		System.out.println(c == d);
		
		c=0.015;
		d=0.0000072;
		System.out.println(c+", "+d);
	}
}