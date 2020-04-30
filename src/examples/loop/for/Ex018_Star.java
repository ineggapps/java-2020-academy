public class Ex018_Star {
	public static void main(String[] args) {
/*
    *
   **
  ***
 ****
*****
*/
		for (int i=1; i<=5; i++) {
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
        for(int i = 0; i < s; i++) {
            for(int j = s; j > 0; j--) {
                System.out.print(j <= i + 1 ? "*" : " ");
            }
            System.out.println();
        }
*/        
	}
}
