public class Ex022_Star {
	public static void main(String[] args) {
/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
/*
		for (int i=1; i<=9; i++) {
			if(i<=5) {
				for (int j=1; j<=5-i; j++) {
		            System.out.print(" ");
		        }
		        for (int j=1; j<=i*2-1; j++) {
		            System.out.print("*");
		        }
		        System.out.println();
			} else {
				for (int j=1; j<=i-5; j++) {
		            System.out.print(" ");
		        }
		        for (int j=1; j<=(10-i)*2-1; j++) {
		            System.out.print("*");
		        }
		        System.out.println();
			}
	    }
*/
	}
}
