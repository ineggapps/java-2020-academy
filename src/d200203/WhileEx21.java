package d200203;

public class WhileEx21 {
	public static void main(String[] args) {
		// 1/2 + 2/3 + ... + 9/10의 결괏값 구하기
		int n=0;
		double s=0;
		while(n<9) {
			n++;
			s += (double)n/(n+1);
		}
		System.out.printf("결괏값: %.2f",s);
	}
}
