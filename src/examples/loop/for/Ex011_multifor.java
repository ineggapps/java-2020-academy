public class Ex011_multifor {
	public static void main(String[] args) {
/*
		다중 for문 예제 프로그램
*/	
	for(int i=1; i<=3; i++) {
			System.out.println("i:"+i);
			for(int j=1; j<=2; j++) {
				System.out.println("i:"+i+", j:"+j);
			}
			System.out.println("--------");
		}
	}
}
