package d200203;

public class SwitchEx5 {
	// switch문 안에 switch문을 사용할 수 있다는 것을 보여주는 예제 (but, 권장하지 않음)
	public static void main(String[] args) {
		int a = 12;
		switch (a % 2) {
		case 0:
			System.out.println("2의 배수");
			switch (a % 3) {
			case 0:
				System.out.println("3의 배수");
				break;
			case 1:
			case 2:
				System.out.println("3의 배수가 아님");
				break; // 없어도 문제가 생기지 않으나 통상적으로는 상황에 따라 모든 case 구문 안에 break;문을 덧붙인다.
			}
			break;
		case 1:
			System.out.println("2의 배수가 아님");
			switch (a % 3) {
			case 0:
				System.out.println("3의 배수");
				break;
			case 1:
			case 2:
				System.out.println("3의 배수가 아님");
				break; 
			}
			break;
		}
	}
}
