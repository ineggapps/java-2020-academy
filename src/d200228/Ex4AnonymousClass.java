package d200228;

public class Ex4AnonymousClass {
	// 오버라이딩의 예
	// 1. 상속받고 toString() 메서드를 재정의
	// 2. 아래의 예제와 같이 익명의 클래스를 구현한다.
	public static void main(String[] args) {
		Object ob0 = new Object();
		System.out.println(ob0.toString());
		Object ob1 = new Object() {
			// 아무것도 재정의하지 않았음
		};
		System.out.println(ob1.toString());
		Object ob2 = new Object() {
			// 클래스의 일부 메서드를 오버라이딩을 할 수 있음.
			@Override
			public String toString() {
				return "방가방가.";
			}
		};
		System.out.println(ob2.toString());
	}
}
