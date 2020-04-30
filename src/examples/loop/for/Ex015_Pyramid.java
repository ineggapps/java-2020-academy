public class Ex015_Pyramid {
	public static void main(String[] args) {
		// 숫자 피라미드
/*		
		for(int i=1; i<=10; i++) {
			for(int j=i; j<=i+9; j++) {
				System.out.printf("%3d", j);
			}
			System.out.println();
		}
*/
		
		int i, j;
		
		i=1;
		while(i<=10) {
			j = i;
			while(j<=i+9) {
				System.out.printf("%3d", j);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
