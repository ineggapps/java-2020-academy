package d200203;

public class WhileEx12 {
	public static void main(String[] args) {
		int n = 1, s = 0;
		// 1~100까지의 홀수의 합을 구하기
		/*
		 * 앞엣것 2개와 끝엣것 2개만 생각하고 디버깅하기.
		 1+3+…+97+99=2500
		 * */
		while (n < 100) {
			s += n;
			n += 2;
		}
		System.out.println("홀수의 합: " + s);
	}
}