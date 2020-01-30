package d200130;

public class ChangeTest {
	public static void main(String[] args) {
		// 두 변수의 값을 바꾸기
		int a = 10, b = 5;
		int c;
		c = a; // c에 10을 대입한다. a는 여전히 10인 상태이다.
		a = b;// a에 b의 값인 5를 대입한다. b는 여전히 5인 상태이다.
		b = c;// b에 c의 값인 10을 대입한다. 
		//결국 a는 5가 되었고 b는 10이 되었다. (c는 쌍방간의 값을 맞바꾸기 위한 임시 기억 공간이다.)
		System.out.println(a + ", " + b);
		
		//비트연산으로 값을 교환하는 방법. 
		//정수에 한해 값 교환이 가능하다
		a = a^b;
		b = b^a;
		a = a^b;
		System.out.println(a + ", " + b);
	}
}
