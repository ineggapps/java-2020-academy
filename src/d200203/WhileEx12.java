package d200203;

public class WhileEx12 {
	public static void main(String[] args) {
		int n = 1, s = 0;
		// 1~100������ Ȧ���� ���� ���ϱ�
		/*
		 * �տ��� 2���� ������ 2���� �����ϰ� ������ϱ�.
		 1+3+��+97+99=2500
		 * */
		while (n < 100) {
			s += n;
			n += 2;
		}
		System.out.println("Ȧ���� ��: " + s);
	}
}