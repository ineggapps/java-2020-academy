package d200220;

public class Ex10 {
	public static void main(String[] args) {
		Demo10 d = new Test10();
		d.write();
		System.out.println(d.max(10, 3));
		System.out.println(Demo10.sum(100));
	}
}

//JDK 8 이상에서만 지원한다.
//static 메서드, default 메서드 사용 가능
interface Demo10 {
	public void write();

	public static int sum(int n) {
		int s = 0;
		for (int i = 1; i <= n; i++) {
			s += i;
		}
		return s;
	}

	// default메서드
	// default메서드에서는 구현 가능. 즉 default 메서드가 아니면 구현 불가능하다.
	public default int max(int m, int n) {
		return m > n ? m : n;
	}
}

interface Demo102{
	public default int max(int m, int n) {
		return m;
	}
}
//차이점: interface는 다중상속이 가능하고 추상클래스는 클래스로 보니까 다중 상속이 불가능하다!


class Test10 implements Demo10, Demo102 {

	//아하~ 오버라이딩을 할 때 메서드가 겹치면 클래스명.super을 쓰는구나!
	//이것이 바로 다중상속?
	@Override
	public int max(int m, int n) {
		return Demo10.super.max(m, n);
	}

	@Override
	public void write() {
		System.out.println("ㅇㅇㅇ");
	}

}