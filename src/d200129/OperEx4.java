package d200129;

public class OperEx4 {
	public static void main(String[] args) {
		int a = 10, b = 4;
		double c;
		c = a / b;
		System.out.println(c);// �ᱣ��: 2.0

		c = (double) a / b;// ���� a�� ������ double������ ��ȯ�Ͽ���. (���� casting)
		System.out.println(c);// �ᱣ��: 2.5
	}
}
