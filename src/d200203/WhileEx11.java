package d200203;

public class WhileEx11 {
	public static void main(String[] args) {
		int n = 0, s = 0;
		// 1~100������ ¦���� ���� ���ϱ�
		while (n < 100) {
			n += 2;
			s += n;
		}
		System.out.println("¦���� ��: " + s);
	}
}
