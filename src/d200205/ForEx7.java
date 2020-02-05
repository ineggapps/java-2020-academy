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
		//for문의 범위 설정이 다를 수도 있음
		for(int i=0;i<5;i++) {
			for(int j=5;j<0;j--) {
				System.out.println(j<=i+1?"*":"a");
			}
		}
		
		//for문 범위 설정을 달리 한 예
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				//삼항연산자로 간단하게 해결이 가능하다.
				System.out.print(j>=6-i?"*":"a");
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
