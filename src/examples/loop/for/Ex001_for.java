public class Ex001_for {
	public static void main(String[] args) {
/*
		1~10 까지 정수를 출력하는 프로그램
*/	
		int n;
		for(n=1; n<=10; n++) {
			System.out.print(n+"  ");
		}
		System.out.println();
		// System.out.println(n); // 11
		
/*		
		for(int n=1; n<=10; n++) { // for 문에서 변수 선언 가능
			System.out.print(n+"  ");
		}
		System.out.println();
		// System.out.println(n); // 컴파일 오류.
		//			for() 문에서 선언한 변수는 for() 문 밖에서는 사용 할 수 없다.
*/
	}
}
