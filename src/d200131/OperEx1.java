package d200131;

public class OperEx1 {
	/*
	 * a+=b; //byte, short, char ���� �� ��ȯ�� �Ͼ�� �ʴ´ٴ� ������ �ִ�. (�񿬻� �ӵ��� ����)
	 * a=a+b; // byte, short, char���� int ������ ��ȯ�� �Ͼ �ڿ� ������ �����Ѵ�.
	 * 
	 * a-=b;
	 * a=a-b;
	 */
	public static void main(String[] args) {
		short a, b;
//		a+=b;//The local variable a may not have been initialized error.
		a = 10;
		b = 5;
		a = (short) (a + b);
//		a=a+b;//int�� �� ��ȯ�� �Ͼ�Ƿ� ������ �߻��Ѵ�
		System.out.println(a);
		a += b;// ���������ڿ����� �� ��ȯ�� �Ͼ�� �����Ƿ� ���� �ӵ��� �� ������.
		System.out.println(a);

		char c = 'A';
		c += 10;
		System.out.println(c);

		float f = 3.5f;
		char ch = 'A';
		ch+=f; //float������ ���������� �����Ͽ�� ����ȯ�� �Ͼ�� �ʴ´�.
		//65+3.5=68.5��� ������ �������� �����Ϸ����� ������ �Ҽ����� �����Ͽ� 68�� �ᱣ���� D�� ��µǵ��� �Ѵ�.
		System.out.println(ch);
		f=3.5f;
		ch='A';
		f+=ch;
		System.out.println(f);
	}
}