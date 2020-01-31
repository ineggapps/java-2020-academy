package d200131;

public class IfEx1 {
	public static void main(String[] args) {
		// 정수에 대한 절댓값 구하기
		int n;
		n = -10;
		if (n < 0)
			n = -n;
		System.out.println("절댓값: " + n);
	}
}
