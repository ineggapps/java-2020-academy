package d200131;

public class OperEx3 {
	public static void main(String[] args) {
		short a;
		byte b;
		int c;
		long d;

		a = 10;
		c = a;// �ڵ����� �����Ϸ��� a������ short Ÿ���� int������ ��ȯ�� �õ��Ѵ�.
//		b=a;//������ ���� / cannot convert from byte to short ū ���� ���� �Ϳ� ������ �� ����
		b = (byte) a;// ������ ���� ��ȯ�Ѵ�
		System.out.println(b);// 10 (�����÷ΰ� �Ͼ�� ����)

		a = 200;
		b = (byte) a;
		System.out.println(b);// 200�� byte������ ǥ���� �� ���� -128~127������ ǥ���� �����ϴ�. ���� �����÷ΰ� �߻��Ͽ� ���� �ٸ� ���� -56�� ��µȴ�.
		
		c='A'+10;//char+int => int + int ������ ��ȯ�Ͽ� ������ �����Ѵ�. ('A'=65)
		System.out.println(c);
	
		c=1_000_000;
		d=c*c;//int * int => int������ �����µ�, �̰��� long�� ������d�� ������ ���̹Ƿ� ���������δ� d�� ���ԵǸ鼭 long������ ĳ������ �Ǿ���
		System.out.println(d);//������ ���ϸ鼭 ������ ����� int���� ������ �ʰ��Ͽ����Ƿ� �߸������� �߻��Ͽ��� �߻��� �ڿ� long�� ������ ���ԵǾ���.
		d=(long)c*c;// ĳ���õ� long * int => long * long => long���� �ᱣ���� ���´�.
		System.out.println(d);//���� ������ �ϱ� ���� long������ �̹� ��ȯ�� �õ��Ͽ����Ƿ� ���ϴ� �ᱣ���� ����� �ȴ�.		
	}
}
