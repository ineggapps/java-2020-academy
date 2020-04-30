package d200213;

public class Ex1 {
	// return type
	public static void main(String[] args) {
		Test1 t = new Test1();
		int x;
		x = t.sub2(10);//1) 메서드 호출, 4) 반환한 값을 x에 대입한다.
		
//		System.out.println(t.sub1(3));컴파일 오류 void형은 아무 값도 반환하지 않기 때문이다.
//		x = t.sub1(10);//이것도 오류
		t.sub1(3);//리턴타입이 없는 void형은 어떠한 변수에 대입하거나 매개변수로 넘길 수가 없다. (그러니까 void겠지)
		
		x=t.sub3(10);
		if(x==1) {
			System.out.println("성공");
		}
		
		t.sub3(5);//리턴타입이 있어도 단독으로 코드 작성이 가능하다.
		
		
	}
}

class Test1 {
	public void sub1(int n) {
		n += 10;
		System.out.println(n);
	}

	public int sub2(int n) {
		// 2) 코드 실행
		int s = 0;
		for (int i = 1; i <= n; i++) {
			s += i;
		}
		// 3) 결과를 반환
		return s;
	}

	public int sub3(int n) {
		if (n < 0) {
			return 0;
		}
		System.out.println(n);
		return 1;
	}
}
