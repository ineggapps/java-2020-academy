package d200220;

public class Ex2 {
	public static void main(String[] args) {
//		SingletonEx1 ob = new SingletonEx1(); //컴파일 오류, 생성자가 private이다.
		SingletonEx1 ob = SingletonEx1.getInstance();
		SingletonEx1 ob2 = SingletonEx1.getInstance();
		System.out.println(ob.hashCode());
		System.out.println(ob2.hashCode());
		System.out.println(ob == ob2);
		ob.print();
	}
}

class SingletonEx1 {//객체를 1개만 생성하는 디자인 패턴 (ex: DB연동)
	//1) 생성자와 인스턴스 변수를 private으로 선언한다
	//인스턴스 변수에서는 해당 클래스의 객체 주솟값을 담거나 null을 담고 있을 것임.
	private static SingletonEx1 instance = null;
	private SingletonEx1() {
	}

	//2) 클래스 메서드로 해당 클래스의 객체를 반환하는 메서드를 만들어야 한다.
	//but, 멀티 쓰레드 환경에서는 문제가 생길 수 있다.
	public static SingletonEx1 getInstance() {
		if (instance == null) {
			instance = new SingletonEx1();
		}
		return instance;
	}
	
	public void print() {
		System.out.println("Singleton 패턴 예제");
	}
}