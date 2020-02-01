package r200201;

public class OperatorEx1 {
	public static void main(String[] args) {
		int a;
		a = (+-+-+-((5 % 3) * (4 / 2)));// 여기서 +는 있으나 마나 똑같은 부호이며, -는 부호는 음수를 양수로 양수를 음수로 바꾼다.
		// 마이너스(-)부호가 홀수 개이므로 최종적인 부호는 음수가 된다.
		System.out.println(a);

		int x = 2, y = 5, z = 0;
		x += 3 + 2;// 일반적으로 배정연산과 대입연산은 우선순위가 가장 낮다.
		System.out.println(x + "," + y + "," + z);
		x += y -= z = 4;// 일반적인 연산과 다르게 대입과 배정 연산에서는 우변에서 좌변 방향으로 오면서 연산을 수행한다.
		System.out.println(x + "," + y + "," + z);

		/*
		 * 강제 형 변환없이 byte형과 char형과의 크기는 비교할 수 없다. ∵ char는 음수를 표현하지 않기 떄문에
		 */
	}
}
