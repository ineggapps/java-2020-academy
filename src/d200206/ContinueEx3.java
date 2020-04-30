package d200206;

public class ContinueEx3 {
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i + j == 4) {
					continue;// for (int j = 1; j <= 3; j++)의 증감식으로 돌아간다.
				}
				System.out.println(i + ", " + j);
			}
		}
		System.out.println("=====");
		//continue labelName (레이블 이름은 보통 대문자를 많이 쓰는 편)
		AAA:
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i + j == 4) {
					continue AAA; //for (int i = 1; i <= 3; i++) 의 증감식으로 돌아간다.
				}
				System.out.println(i + ", " + j);
			}
		}
	}
}
