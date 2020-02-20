package d200220;

public class Ex11 {
	public static void main(String[] args) {
//		Demo11 ob = new Demo11();//컴파일 오류
		Demo11 ob = new Demo11() {//컴파일 시 Ex11$1.class로 파일이 만들어진 것을 확인할 수 있다.
			//익명의 구현 객체
			@Override
			public void print() {
				System.out.println("우와...");
			}
		};
		ob.print();
	}
}


interface Demo11{
	public void print();
}

