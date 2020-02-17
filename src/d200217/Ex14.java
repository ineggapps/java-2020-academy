package d200217;

public class Ex14 {
	public static void main(String[] args) {
		double a;
		
		System.out.println(Math.PI);
		a = Math.sin(30.0/180*Math.PI);
		System.out.println(a);

		
		System.out.println(Math.sqrt(2));//루트2
		System.out.println(Math.floor(12.77));//소수점 이하 절삭 (많이 씀)
		System.out.println(Math.floor(-12.77));//소수점 이하 절삭 (많이 씀)
		System.out.println(Math.ceil(12.10));//소수점 이하 올림
		System.out.println(Math.ceil(-12.10));//소수점 이하 올림
		System.out.println(Math.rint(12.10));//이 수보다 가까운 정수
		System.out.println(Math.rint(-12.10));//이 수보다 가까운 정수
		
		System.out.println(Math.pow(2, 10));
		System.out.println(Math.random());
		
	}
}
