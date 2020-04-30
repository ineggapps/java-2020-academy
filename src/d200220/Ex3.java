package d200220;

public class Ex3 {
	public static void main(String[] args) {
//		SingletonEx2 ob = new SingletonEx2();//컴파일 오류
		SingletonEx2 ob = SingletonEx2.getInstance();
		SingletonEx2 ob2 = SingletonEx2.getInstance();
		System.out.println(ob==ob2);
		System.out.println(ob.hashCode()+"=="+ob2.hashCode());
	}
}


class SingletonEx2{//Real 싱글톤패턴 구조 (동시성 문제 해결)
	
	private SingletonEx2() {
	}
	
	//static 중첩 클래스
	//SingletonEx2가 로드될 때 멀티스레드 환경에서도 단 한 번만 실행이 되는 구조이다.
	private static class Holder{
		public static final SingletonEx2 INSTANCE= new SingletonEx2();
	}
	
	public static SingletonEx2 getInstance() {
		return Holder.INSTANCE;
	}
}