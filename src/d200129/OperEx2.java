package d200129;

public class OperEx2 {
	public static void main(String[] args) {
		byte b1 = 5, b2 = 10, b3;
//		b3=b1+b2; ������ ����
		b3 = (byte) (b1 + b2);
		System.out.println(b3);
//		b1=200;//������ ����. overflow�� �߻��Ѵ�.
		b1 = 100;
		b2 = 120;
		b3 = (byte) (b1 + b2);
		System.out.println(b3);// ������ �߻����� ������ overflow�� �߻��Ͽ� ���ڰ� �߸���. (-36)

		int x, y, z;
		x=2000000000;
		y=2000000000;
		z=x+y;
		System.out.format("int�������� ���� ���: %d\n",z);//������ �߻����� ������ overflow�� �߻��Ѵ�. (int�� ǥ���� �� �ִ� ������ ������ �ʰ���)
		
		z=b1+b2;
		System.out.format("byte�� ������ ��� ���� ����Ͽ� int�� ������ ���� %d\n",z);
		
		long s;
//		s=x+y; //(int+int);//������ �ǿ������� ���°� int�̱� ������ int�� �������� ������ ����Ǿ���(==�̹� overflow�� �߻��� ��Ȳ��)
		s=(long)x+y; //�Ǵ�
		s=2000000000+2000000000L;
		System.out.format("long�� ������ ��� ���� ����: %d\n",s);//4000000000 10^9=10��
	}
}
