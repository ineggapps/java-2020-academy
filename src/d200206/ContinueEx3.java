package d200206;

public class ContinueEx3 {
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i + j == 4) {
					continue;// for (int j = 1; j <= 3; j++)�� ���������� ���ư���.
				}
				System.out.println(i + ", " + j);
			}
		}
		System.out.println("=====");
		//continue labelName (���̺� �̸��� ���� �빮�ڸ� ���� ���� ��)
		AAA:
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i + j == 4) {
					continue AAA; //for (int i = 1; i <= 3; i++) �� ���������� ���ư���.
				}
				System.out.println(i + ", " + j);
			}
		}
	}
}
