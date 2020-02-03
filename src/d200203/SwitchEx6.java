package d200203;

public class SwitchEx6 {
	public static void main(String[] args) {
		int n = 4;
		switch (n) {
		case 3:
			System.out.println("CBA");
			break;
		case 2:
			System.out.println("BA");
			break;
		case 1:
			System.out.println("A");
			break;
		default://default의 위치는 어디 있든지 무방하나 논리적 흐름으로 미루어 볼 때 가장 마지막에 배치하는 것이 코드를 살펴보기에 좋다.
			System.out.println("입력 오류");
			break;
		}
	}
}
