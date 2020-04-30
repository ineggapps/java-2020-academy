package d200129;

public class TypeEx1 {
	public static void main(String[] args) {
		float a, b;
		double c, d;
//		a = 0.5;//Type mismatch; cannot convert from double to float (0.5는 배정도형 리터럴이다. 0.5f로 지정하여 단정도형을 대입해야 함)
		a = 0.5f;// 단정도형 리터럴을 입력하였으므로 오류가 나지 않는다.
		b = 'A';// char(2) < int(4) < long(8) < float (4) < double(8) 이므로 char형을 대입했어도 아무런 문제가
				// 생기지 않는다.
		c = 0.5;
		d = 0.5d;// d는 배정도형 literal을 의미하는 것이나 생략하여도 무방하다.
		System.out.println(a + ", " + b + ", " + c + ", " + d);
	}
}
