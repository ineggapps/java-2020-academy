package d200219;

public class Ex9 {
	public static void main(String[] args) {
		Demo9 dd1 = new Demo9(); // 업캐스팅
		System.out.println(dd1);// ~Demo9@15db9742 (진짜 Demo9객체)
		Demo9 dd2 = new Test9(); // 업캐스팅
		System.out.println(dd2);// ~Test9@16진수해시코드 (진짜 Test9객체)
		int x = ((Test9)dd2).b;//괄호를 이용하여 우선순위를 조절하는 것에 유의한다.(Test9)dd2.b의 경우에는 (Test9)정수라는 의미로 인식하므로 오류가 발생한다.
		
		// 업캐스팅은 언제나 가능하다.
		dd1.print();
		dd2.print();// 오버라이딩된 메서드 호출(super클래스의 print메서드 호출은 외부에서 절대 불!가!능! 외부에서 직접 접근하는 방법 자체가 없다)
		// 컴파일할 때가 아니라 실행할 당시에 어떤 메서드를 호출할지 결정된다. (동적 바인딩, 다형성)
		System.out.println(dd2.b);// 필드 변수의 경우에는 겹치는 경우 참조변수형의 것을 가져온다.

		System.out.println("다운캐스팅 시작");
		// 다운캐스팅
//		Test9 tt = (Test9) dd1; // 다운캐스팅 불가능 (본디 Demo9객체이니까) // 런타임 오류
		// Demo9 cannot be cast to Test9 라는 오류메시지가 발생한다.
//		Test9 tt2 = (Test9) dd2; // 다운캐스팅
		// 다운 캐스팅은 업 캐스팅을 한 것만 가능하고, 반드시 캐스팅해야 한다.
//		dd2.sub(); // 컴파일 오류
//		int x = dd2.c; // 컴파일 오류

		// 1. 객체 간의 캐스팅은 상하관계에서만 가능하다.
//			Test9 tt3 = (Test9)new String();//이런 거 절대 불가능
		// 2. 업 캐스팅은 언제나 가능하다.
//			Object tt3 = (Object)new Demo9();
		// 3. 다운 캐스팅은 업캐스팅을 수행한 것만 가능하고, 반드시 캐스팅이 필요하다.
//			Demo9 ddd = new Test9();
//			Test9 fff =(Test9)ddd;
//			fff.sub();

		// instanceof 해당 클래스의 객체인지를 판별하는 예약어
		System.out.println(dd1 instanceof Demo9);// true
		System.out.println(dd1 instanceof Test9);// false
		System.out.println(dd2 instanceof Demo9);// true
		System.out.println(dd2 instanceof Test9);// true

		if (dd2 instanceof Test9) {
			Test9 tt2 = (Test9) dd2;
			tt2.sub();
		}

	}
}

class Demo9 {
	int a = 10;
	int b = 20;

	public void print() {// 1
		System.out.println(a + ":" + b);
	}
}

class Test9 extends Demo9 {
	int b = 200;
	int c = 300;

	@Override
	public void print() {// 2
		System.out.println(a + ":" + b + ":" + c);
	}

	public void sub() {
		System.out.println(a + ":" + super.b + ":" + c);
		super.print();// 1번 호출
		// print();//2번 호출
	}

}