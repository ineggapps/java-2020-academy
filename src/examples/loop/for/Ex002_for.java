public class Ex002_for {
	public static void main(String[] args) {
/*
		10~1 까지 정수를 역으로 출력하는 프로그램
*/	
		
		int n;
		for(n=10; n>=1; n--) {
			System.out.print(n+"  ");
		}
		System.out.println();
		// System.out.println(n); // 0

/*		
		int n;
		for(n=10; n<=1; n--) { // 조건을 만족하지 않으면 한번도 실행하지 않는다.
			System.out.print(n+"  ");
		}
		System.out.println();
*/
	}
}
