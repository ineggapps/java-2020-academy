package variables;

public class TypeEx {
	public static void main(String[] args) {
		int a; // a ������ ���������� ����, a�� �ʱ�ȭ�� �Ǿ����� ���� ����
//		System.out.println(a);//a�� �ʱ�ȭ�� �Ǿ� ���� ������ ����� �� ����.
		a = 30;// 10���� �Է�
		System.out.println(a);// 30

		a = 030;// 8���� �Է�
		System.out.println(a);// 24

		a = 0x30;// 16���� �Է�
		System.out.println(a);// 48

		a = 0b101;// 2���� �Է�
		System.out.println(a);// 5
		
//		Error case
//		#1. a=080;//the literal 080 of type int is out of range. 8�������� 8�� ����.
//		#2. a= 2200000000;//���������� int ������ �ʰ��Ͽ� ������ �߻��Ѵ�.
		
		long b;
//		b=2200000000;//������ ����, int�� literal��(int ���) 22���� ǥ���� �� ����.
		b=2200000000L;//long�� literal(long�� ���)�� ������.
		System.out.println(b);
		
//		a=10L;//Type mismatch: cannot convert from long to int (Long�� ����� int�� ������ ������ �� ����)
//		a=2_0_1;//==201 (����ٸ� ���� �����ϸ� �ȴ�)
		
	}
}
