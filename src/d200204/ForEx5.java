package d200204;

public class ForEx5 {
	public static void main(String[] args) {
//		int n;
//		for (n = 10; n <= 1; n++) {// 조건을 만족하지 않으면 단 한 번도 실행하지 않는다.
//			System.out.println("안: " + n);
//		}
//		System.out.println("밖: " + n);

		int n;
		for (n = 10; n >= 1; n--) {
			System.out.println("안: " + n);//10 9 ... 2 1
		}
		//증감식에서 n--이 실행되고 조건식에서 false가 되어 반복문을 종료한다.
		//반복문이 종료된 상태에서 n의 값은 0이다.
		System.out.println("밖: " + n);//0
	}
}
