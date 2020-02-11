package d200211;

public class Ex6 {
	public static void main(String[] args) {
		int result;
		Test6 t = new Test6();
		result = t.getEvenSum();//result는 메서드의 반환형보다 크거나 같은 자료형이어야만 한다.
		System.out.println(result);
		
		//t.even(); //대입연산자가 없이도 메서드의 호출이 가능하다.
	}
}

class Test6 {
	private int a;// 인스턴스 변수. 힙 메모리 공간에 객체가 생성되는 수만큼 메모리에 저장된다.
	// 1~100까지의 짝수의 합 구하기

	// 클래스 메서드
	private static int test() {
		return 0;
	}

	// 인스턴스 메서드
	public int getEvenSum() {
		int s = 0;// 지역 변수, 메서드 안에서만 사용이 가능하다.
		// 초기화가 반드시 필요하다.
		// 메서드를 호출할 때 메모리에 할당된다.
		// 메서드를 벗어나면 저장된 값이 사라진다.
		// 스택 메모리 공간에 저장된다.
		for (int i = 2; i <= 100; i += 2) {
			s += i;
		}
		/*
		 * 현재의 경우 int형이 return type이므로 반드시 변수의 반환형에 맞추어 결괏값을 반환하도록 한다.
		 * 단, int형이 포괄할 수 있는 byte, short, char형의 값 역시 결괏값을 그대로 반환하여도 자동으로 캐스팅되므로
		 * 값이 부정확할지언정 프로그램의 실행에는 오류가 없다는 것도 참고한다.
		 */
		return s;
		// 리턴 타입이 void의 경우에는 생략하여도 무방하다.
		// 왜? 컴파일러가 자동으로 return;구문을 맨 마지막에 삽입해 준다.
//		System.out.println();//컴파일오류 (Unreachable code) ← return 밑에는 어떠한 구문도 작성할 수 없음.
	}
}