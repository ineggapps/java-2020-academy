package d200130;

public class OperEx10 {
	public static void main(String[] args) {
		byte a = 0x0a;
		byte b = 0x48;
		byte c = (byte) 0xcc;
		int d = 0xcc;
		System.out.println(d);

		System.out.println(a + "," + b + "," + c);
		//�������� �켱�������� ��Ʈ���� ���꿡���� ����(&)�� �켱������ �� ����.
		//a=					0000 1010
		//b=					0100 1000
		//c=					1100 1100		
		// b & c = 			0100 1000
		// b & ~c = 		0000 0000
		// a | (b & c) = 0000 1010 (==a)
		// a ^ (b & c)= 0000 1010 (==a)
		System.out.println((byte) (a | b & c));
		System.out.println((byte) (a | b & ~c));
		System.out.println((byte) (a ^ b & ~c));
	}
}
