public class Ex021_Star {
	public static void main(String[] args) {
/*
*********
 *******
  *****
   ***
    *
*/
		for (int i=5; i>=1; i--) {
	        for (int j=1; j<=5-i; j++) {
	            System.out.print(" ");
	        }
	        for (int j=1; j<=i*2-1; j++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
		
/*		
		int s = 9;
        for (int i = s; i > s/2; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print((s - i) <= j ? "*" : " ");
            }
            System.out.println();
        }
*/
	}
}
