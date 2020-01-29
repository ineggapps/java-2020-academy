package d200129;

public class OperEx4 {
	public static void main(String[] args) {
		int a = 10, b = 4;
		double c;
		c = a / b;
		System.out.println(c);// 결괏값: 2.0

		c = (double) a / b;// 변수 a를 강제로 double형으로 변환하였다. (강제 casting)
		System.out.println(c);// 결괏값: 2.5
	}
}
