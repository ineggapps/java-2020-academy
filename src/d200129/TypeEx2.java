package d200129;

public class TypeEx2 {
	public static void main(String[] args) {
		float a = 2000000000;
		float b = 2000000050;
		// float������ 2�������� 0.2�� ���ѼҼ��̴�. ���� float�� �������� �ʰ��ϹǷ� �߸��� �Ǿ� a�� b�� ���� ���� ������ �ȴ�.

		double c = 2000000000;
		double d = 2000000050;
		System.out.println(a + ", " + b);
		System.out.println(c + ", " + d);

		System.out.printf("%.2f, %.2f\n", a, b);//2000000000.00,2000000000.00 ���
		System.out.printf("%.2f, %.2f\n", c, d);//2000000000.00,2000000050.00 ���

		// float���� ����� ���� ũ���� ������ �����ϸ鼭 ����ؾ� �Ѵ�.
		System.out.println(a == b);// ���е��� ���� ������ b�� 2000000000���� ����Ǿ� true�� �ᱣ���� ���´�.
		System.out.println(c == d);
		
		c=0.015;
		d=0.0000072;
		System.out.println(c+", "+d);
	}
}