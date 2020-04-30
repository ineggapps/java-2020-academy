public class Ex019_Star {
	public static void main(String[] args) {
/*
*****
 ****
  ***
   **
    *
 */
		for (int i=5; i>=1; i--) {
	        for (int j=1; j<=5-i; j++) {
	            System.out.print(" ");
	        }
	        for (int j=1; j<=i; j++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
		
/*		
		int s = 5;
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                System.out.print(i <= j ? "*" : " ");
            }
            System.out.println();
        }
*/        
	}
}
