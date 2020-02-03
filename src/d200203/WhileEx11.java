package d200203;

public class WhileEx11 {
	public static void main(String[] args) {
		int n = 0, s = 0;
		// 1~100까지의 짝수의 합을 구하기
		while (n < 100) {
			n += 2;
			s += n;
		}
		System.out.println("짝수의 합: " + s);
	}
}
