package d200205;

public class ForEx7 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print("a");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("================");
		//
		// for문의 범위 설정이 다를 수도 있음
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j < 0; j--) {
				// i가 0일 때 공백이 4개, * 1개
				// i가 1일 때 공백이 3개, * 2개
				// i가 2일 때 공백이 2개, * 3개
				// i가 3일 때 공백이 1개, * 4개
				// i가 4일 때 공백이 0개, * 5개
				System.out.println(j <= i + 1 ? "*" : "a");
				// i가 0일 때 의 값
				// 5<=1
				// 4<=1
				// 3<=1
				// 2<=1
				// 1<=1 (o)
				// i가 1일 때 의 값
				// 5<=2
				// 4<=2
				// 3<=2
				// 2<=2 (o)
				// 1<=2 (o)
				// ...
			}
		}

		// for문 범위 설정을 달리 한 예
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				// 삼항연산자로 간단하게 해결이 가능하다.
				System.out.print(j >= 6 - i ? "*" : "a");
//				if(j>=6-i){
//					/*
//					 j==5 *
//					 j==4, 5 **
//					 j==3, 4, 5 ***
//					 j==2,3,4,5 ****
//					 * */
//					System.out.print("*");
//				}else {
//					System.out.print("a");
//				}
			}
			System.out.println();
		}
	}
}
