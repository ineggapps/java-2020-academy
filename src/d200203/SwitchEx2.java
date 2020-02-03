package d200203;

public class SwitchEx2 {
	public static void main(String[] args) {
		int a = 13;
		// a%3으로 연산한 값은 0,1,2가 나올 수 있다.
		switch (a % 3) {
		case 0:
			System.out.println(a + "는 3의 배수입니다.");
			break;
		case 1:
		case 2:
			System.out.println(a + "는 3의 배수가 아닙니다.");
			break;
		}
	}
}
