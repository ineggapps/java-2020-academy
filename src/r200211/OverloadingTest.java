package r200211;

public class OverloadingTest {
	public static void main(String[] args) {
		MyMath3 mm = new MyMath3();
		System.out.println("mm.add(3, 3) 결과:  "+ mm.add(3,3));
		System.out.println("mm.add(3, 3) 결과:  "+ mm.add(3L,3));
		System.out.println("mm.add(3, 3) 결과:  "+ mm.add(3,3L));
		System.out.println("mm.add(3, 3) 결과:  "+ mm.add(3L,3L));
		int[] a = {100, 200, 300};
		System.out.println("mm.add(3, 3) 결과:  "+ mm.add(a));
	}
}

/*
 	오버로딩의 조건
 	1. 메서드의 이름이 같아야 한다.
 	2. 매개변수의 개수 또는 타입이 달라야 한다.
 	
 	★단, 반환 타입은 오버로딩을 구현하는 데 아무런 영향을 주지 못한다는 것에 주의할 것!
 */

class MyMath3 {
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a + b;
	}

	long add(int a, long b) {
		System.out.print("int add(int a, long b) - ");
		return a + b;
	}

	long add(long a, int b) {
		System.out.print("int add(long a, int b) - ");
		return a + b;
	}

	long add(long a, long b) {
		System.out.print("int add(long a, long b) - ");
		return a + b;
	}

	int add(int[] a) {
		System.out.print("int add(int[] a) - ");
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			result += a[i];
		}
		return result;
	}
}