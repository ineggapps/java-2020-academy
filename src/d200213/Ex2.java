package d200213;

public class Ex2 {
	public static void main(String[] args) {
		Test2 ob = new Test2();

		short a=10;
		Short b = 10;
		int c=10;
		Integer d = 10;//int�� Ŭ������ ���� ��
		long e = 10;
		Long f=10L; // Long f=10; //����
		
		/*
		 * �޼��带 ã�� ���� ���ϱ�
			�޼����� �Ķ���ͷ� �޼��带 �����Ѵ�.
			1. �ǸŰ������� �ڷ����� 100% ������ �� �˻� (Ŭ������ Ŭ����, �⺻�ڷ����� �⺻�ڷ���)
			2. �⺻���� �⺻�� �� ���� �����鼭 ū �ڷ����� ã�´�.
			3. ������ �ڷ����� ���� �⺻�� �� ū �ڷ����� ������ ���� ũ���� Wrapper class�� ã�´�.
		 * */
		
		ob.write();
		ob.write(a);
		ob.write(b);
		ob.write(c);
		ob.write(d);//IntegerŬ������ü�ӿ��� �ұ��ϰ� int�� �޼��带 ȣ���� ����� ���Դ�.
		//�Ű������� Integer�� ������ int�� �Ѱ� ���� �� �ִ�.
		ob.write(a,b);//��(int, int)�޼��带 ȣ���� ����� ���Դ�.
		//int���� short(�Ǵ� Short�� �� ��)���� ũ�� ������ �ڵ����� �Ű������� �´� �޼��带 ȣ���Ѵ�.
		ob.write(e);//long �ڷ����� LongŬ������ �Ű������� �� Ÿ���� ��Ҵ�.
		ob.write(f);//long �ڷ����� LongŬ������ �Ű������� �� Ÿ���� ��Ҵ�.
	
		short s=10;
		//Test2Ŭ�������� short���� �޴� �Ű������� �ּ�ó���Ͽ� �����ϸ� int�� �Ű������� �޴� �޼��带 ȣ���Ѵ�.
		System.out.println("short���� ������ � �޼��尡 ȣ��ɱ�?");
		ob.write(s);
	
	}
}

class Test2 {
	public void write() {
		System.out.println("���� ���� �޼���");
	}

//	//������ ���� (�޼��� �����ε��� �Ű������θ� �����ϱ� ������)
//	public int write() {
//		return 0;
//	}
//
//	public void write(short a) {
//		System.out.println("short..." + a);
//	}

	public void write(int a) {
		System.out.println("int..." + a);
	}

	public void write(int a, int b) {
		System.out.println("int�� 2��!..." + a + "," + b);
	}

//	short�� Ŭ������ ���� ��
	public void write(Short a) {
		System.out.println("Short....." + a);
	}

	//Long�� Ŭ������ ���� ��
	public void write(Long a) {
		System.out.println("Long....." + a);
	}

//	public void print(Short a) {
//		System.out.println("Short...");
//	}
	
	
	public void print(int b) {
		System.out.println(b);
	}
	
	
}