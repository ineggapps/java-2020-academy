package d200219;

public class Ex7 {
	public static void main(String[] args) {
		Demo7 dd1 = new Demo7();
		Demo7 dd2 = new Demo7();
		System.out.println(dd1.equals(dd2));// 주솟값 비교. false 반환
		//Object의 equals() 호출한다.
		System.out.println(dd1);//패키지이름.클래스이름@해시16진숫값
		
		Test7 tt1 = new Test7();
		Test7 tt2 = new Test7();
		System.out.println(tt1.equals(tt2));// 1) tt1
		//Test7에 재정의된 equals() 메서드를 호출한다.
		System.out.println(tt1);//패키지이름.클래스이름@해시16진숫값
		System.out.println(tt1.toString());//패키지이름.클래스이름@해시16진숫값
		
	}
}

class Demo7 {
	int a = 10;

	public void print() {
		System.out.println(a);
	}


}

class Test7 extends Demo7 {
	int a = 999;

	public void write() {
		System.out.println(a);
	}

	@Override
	public boolean equals(Object obj) {
		Test7 t = (Test7) obj; // obj는 1)의 tt2를 받는다.
		return this.a == t.a;// 1)에서 호출된 것으로 미루어 볼 때 여기서 this는 tt1을 의미한다.
//		if (obj instanceof Test7) {
//			Test7 tobj = (Test7) obj;
//			return a == tobj.a;
//		}
//		return false;
	}

	@Override
	public String toString() {
		return "a:" + a;
	}
}
