package d200228;

public class Ex4AnonymousClass {
	// �������̵��� ��
	// 1. ��ӹް� toString() �޼��带 ������
	// 2. �Ʒ��� ������ ���� �͸��� Ŭ������ �����Ѵ�.
	public static void main(String[] args) {
		Object ob0 = new Object();
		System.out.println(ob0.toString());
		Object ob1 = new Object() {
			// �ƹ��͵� ���������� �ʾ���
		};
		System.out.println(ob1.toString());
		Object ob2 = new Object() {
			// Ŭ������ �Ϻ� �޼��带 �������̵��� �� �� ����.
			@Override
			public String toString() {
				return "�氡�氡.";
			}
		};
		System.out.println(ob2.toString());
	}
}
