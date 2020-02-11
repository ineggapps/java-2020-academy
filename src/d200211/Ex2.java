package d200211;

public class Ex2 {
	public static void main(String[] args) {
		Bank b1; // 참조변수 선언
		b1 = new Bank();// 이 구문을 빼먹으면 Null Pointer (컴파일 오류)가 발생한다.
		// 인스턴스 변수나 인스턴스 메서드는 객체가 생성되어야 접근할 수 있다.
		b1.name = "홍길동";// Default접근제어자이고 동일 패키지 안에 있으므로 접근할 수 있음.
//		b1.money=1000;private은 외부에서 접근할 수 없다.
		b1.saving(1000);

		Bank b2 = new Bank();// 참조변수 선언과 동시에 메모리 할당하는 것이 가능하다.
		b2.name = "이순신";
		b2.saving(500);

		System.out.println(b1.name + ": " + b1.getMoney());
		System.out.println(b2.name + ": " + b2.getMoney());
	}
}

class Bank {
	// 인스턴스 변수나 인스턴스 메서드는 객체가 생성되어야 호출할 수 있다.
	// 인스턴스 변수, 변수 선언 시 초기화 가능
	// private: 클래스 내에서만 사용이 가능한 변수. 외부 접근 불가.
	private int money;
	// 인스턴스 변수는 자동으로 누적하여 
//	money = 100;//메서드 밖에서는 실행문이 올 수 없다. 
	
	// 인스턴스 변수.
	// 접근제어자가 디폴트(생략한 경우)인 경우 동일한 패키지에서만 접근이 가능하다.
	String name;

	// 인스턴스 메서드
	public int getMoney() {
		return money;
	}

	// 인스턴스 메서드
	public int draw(int m) {// m: 매개변수
		// 인출금이 현재 자본보다 크면?
		// 인출에 관련된 메서드
		if (m > money) {
			return 0;
		}
		int s;// 지역 변수
		s = money - m;
		money = s;
		return m;
	}

	// 인스턴스 메서드
	public void saving(int m) {
		// 입금
		money += m;
	}
}