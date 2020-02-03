package d200203;

public class WhileEx5 {
	public static void main(String[] args) {
		int n;
		n = 0;
		while (n++ < 10) {// while(조건) { //조건: true또는 false만 가능하다
			System.out.println("안:" + n);
			/*
				 n=0일 때 n<10비교 → n++(1) → 출력
				 n=1일 때 n<10비교 → n++(2) → 출력
				 n=2일 때 n<10비교 → n++(3) → 출력
				 n=3일 때 n<10비교 → n++(4) → 출력
				 n=4일 때 n<10비교 → n++(5) → 출력
				 n=5일 때 n<10비교 → n++(6) → 출력
				 n=6일 때 n<10비교 → n++(7) → 출력
				 n=7일 때 n<10비교 → n++(8) → 출력
				 n=8일 때 n<10비교 → n++(9) → 출력
				 n=9일 때 n<10비교 → n++(10) → 출력
				 n=10일 때 n<10비교 → n++(11) 조건만족하지않음X
			 */
		}
		//★ while문에서 n=10일 때도 n++<10 비교구문을 지나치기 때문에 n은 증가하여 11이 출력된다 
		System.out.println("밖:" + n);
	}
}