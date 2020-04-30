package d200130;

public class OperEx1 {
	public static void main(String[] args) {
		// 증감연산자
		int a, b;

		/*
		a = a + 1;
		b = a;
		*/
		a = 10;
		b = ++a;//++전위: 1 증가 후 대입
		System.out.println(a+","+b);

		/*
		b = a;
		a = a + 1;
		 */
		a = 10;
		b = a++;//후위--: 대입 후 1 증가
		System.out.println(a+","+b);

		/*
		a = a - 1;
		b = a;
		 */
		a = 10;
		b = --a;//--전위: 1 감소 후 대입
		System.out.println(a+","+b);
		
		/*
		b = a;
		a = a - 1;
		 */
		a = 10;
		b = a--;//후위--: 대입 후 1 감소
		System.out.println(a+","+b);
		
		
		/*
		단독으로 증감 연산을 하는 경우에는 ++/--부호를 앞이나 뒤 어느쪽에 붙이건 결괏값은 같다.
		*/
		
		a=10;
		++a;
		System.out.println(a);
		
		a=10;
		a++;
		System.out.println(a);
	}
}
