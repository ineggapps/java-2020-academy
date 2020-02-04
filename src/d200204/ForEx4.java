package d200204;

public class ForEx4 {
	public static void main(String[] args) {
//		//For문 사용의 정석
//		int s = 0;
//		for (int n = 1; n <= 100; n++) {
//			s += n;
//		}
//		System.out.println("결과: " + s);

//		int s = 0;
//		for (int n = 1; n <= 100; n += 2) {
//			s += n;
//		}
//		System.out.println("홀수의 합: " + s);

//		int s, n;
//		for (n = 2, s = 0; n <= 100; n += 2, n += 1, n -= 1) { 
//			// 초기식과 증감식은 ","를 이용하여 여러 실행문을 사용할 수 있음.
//			// (권장하지 않음)
//			s += n;
//		}
//		System.out.println("짝수의 합: " + s);

		int s, n;
		//반복문을 한 줄로 표현할 수도 있음. (권장하지 않음)
		for (n = 1, s = 0; n <= 100; s+=n,n++);
		System.out.println("짝수의 합: " + s);
	}
}
