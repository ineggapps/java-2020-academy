package d200203;

public class WhileEx13 {
	public static void main(String[] args) {
		// 1~100������ Ȧ���� ���� ���ϱ�
		// Ʋ�� ���̽�
		int n = -1, s = 0;
		/*
		 * �տ��� 2���� ������ 2���� �����ϰ� ������ϱ�.
		 1+3+��+97+99=2500
		 * */
		while (n < 100) {
			n += 2;
			s += n;
		}
		System.out.println("Ȧ���� ��: " + s);
	}
}