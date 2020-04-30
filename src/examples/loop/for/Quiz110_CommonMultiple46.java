public class Quiz110_CommonMultiple46 {
	public static void main(String[] args) {
/*		
		1~100까지 수중 4와 6의 공배수 출력
*/
		for(int i=1; i<=100; i++) {
			if(i%4==0 && i%6==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
}
