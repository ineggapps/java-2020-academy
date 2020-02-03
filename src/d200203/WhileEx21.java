package d200203;

public class WhileEx21 {
	public static void main(String[] args) {
		// 1/2 + 2/3 + ... + 9/10ÀÇ °á±£°ª ±¸ÇÏ±â
		int n=0;
		double s=0;
		while(n<9) {
			n++;
			s += (double)n/(n+1);
		}
		System.out.printf("°á±£°ª: %.2f",s);
	}
}
