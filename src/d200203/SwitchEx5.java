package d200203;

public class SwitchEx5 {
	// switch�� �ȿ� switch���� ����� �� �ִٴ� ���� �����ִ� ���� (but, �������� ����)
	public static void main(String[] args) {
		int a = 12;
		switch (a % 2) {
		case 0:
			System.out.println("2�� ���");
			switch (a % 3) {
			case 0:
				System.out.println("3�� ���");
				break;
			case 1:
			case 2:
				System.out.println("3�� ����� �ƴ�");
				break; // ��� ������ ������ ������ ��������δ� ��Ȳ�� ���� ��� case ���� �ȿ� break;���� �����δ�.
			}
			break;
		case 1:
			System.out.println("2�� ����� �ƴ�");
			switch (a % 3) {
			case 0:
				System.out.println("3�� ���");
				break;
			case 1:
			case 2:
				System.out.println("3�� ����� �ƴ�");
				break; 
			}
			break;
		}
	}
}
