package d200203;

public class SwitchEx6 {
	public static void main(String[] args) {
		int n = 4;
		switch (n) {
		case 3:
			System.out.println("CBA");
			break;
		case 2:
			System.out.println("BA");
			break;
		case 1:
			System.out.println("A");
			break;
		default://default�� ��ġ�� ��� �ֵ��� �����ϳ� ���� �帧���� �̷�� �� �� ���� �������� ��ġ�ϴ� ���� �ڵ带 ���캸�⿡ ����.
			System.out.println("�Է� ����");
			break;
		}
	}
}
