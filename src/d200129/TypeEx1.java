package d200129;

public class TypeEx1 {
	public static void main(String[] args) {
		float a, b;
		double c, d;
//		a = 0.5;//Type mismatch; cannot convert from double to float (0.5�� �������� ���ͷ��̴�. 0.5f�� �����Ͽ� ���������� �����ؾ� ��)
		a = 0.5f;// �������� ���ͷ��� �Է��Ͽ����Ƿ� ������ ���� �ʴ´�.
		b = 'A';// char(2) < int(4) < long(8) < float (4) < double(8) �̹Ƿ� char���� �����߾ �ƹ��� ������
				// ������ �ʴ´�.
		c = 0.5;
		d = 0.5d;// d�� �������� literal�� �ǹ��ϴ� ���̳� �����Ͽ��� �����ϴ�.
		System.out.println(a + ", " + b + ", " + c + ", " + d);
	}
}
