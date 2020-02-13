package d200213;

public class Ex3 {
	public static void main(String[] args) {
		Test3 t = new Test3();
		t.print(5);
		int s = t.sum(5);
		System.out.println(s);
		System.out.println("t.pow()");
		System.out.println(t.pow(2, 0));
	}
}

class Test3 {
	public void print(int n) {
		// stack을 활용
		/*
		 * 아래의 내용이 스택 공간에 담긴 메서드라면...
		 * 5. print(1) 호출 => 6. 1 출력
		 * 4. print(2) 호출 => 7. 2 출력
		 * 3. print(3) 호출 => 8. 3 출력
		 * 2. print(4) 호출 => 9. 4 출력
		 * 1. print(5) 호출 => 10. 5 출력
		 * 
		 * 단, 끊임없이 호출되면 java.lang.StackOverflowError가 발생한다.
		 */
		if (n > 1) {
			print(n - 1);// 재귀호출
		}
		System.out.println(n);
	}

	public int sum(int n) {
		/*
		 * 재귀호출의 예
		 *												◀◀◀ 연산 방향
		 * sum(5) 호출 시 => 5+sum(4) 호출
		 * sum(4) 호출 시 => 5+4+sum(3) 호출
		 * sum(3) 호출 시 => 5+4+3+sum(2) 호출
		 * sum(2) 호출 시 => 5+4+3+2+sum(1) 호출
		 * sum(1) 호출 시 => 5+4+3+2+1 결괏값 반환
		 * */
		return n > 1 ? n + sum(n - 1) : n;
	}

	// Quiz. 단, y는 0이상
	// x의 y승 계산하기
	public int pow(int x, int y) {
		// ex: 2의 3승이면 pow(2,3)=8이 반환되어야 한다.
		return y > 0 ? x * pow(x, y - 1) : 1;//모든 수의 0승을 생각하면 범위는 0일 때 1을 반환해주어야 한다는 것을 감안해야 한다.
	}
	
	public int factorial(int n) {
		return n > 0 ? n * factorial(n - 1) : 1;
	}
}