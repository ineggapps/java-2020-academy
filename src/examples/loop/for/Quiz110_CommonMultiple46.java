public class Quiz110_CommonMultiple46 {
	public static void main(String[] args) {
/*		
		1~100���� ���� 4�� 6�� ����� ���
*/
		for(int i=1; i<=100; i++) {
			if(i%4==0 && i%6==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
}
