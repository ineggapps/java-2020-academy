package d200129;

public class OperEx1 {
	public static void main(String[] args) {
		short a=10, b=5,c;
//		c=a+b;//Type mismatch: cannot convert int to short
		//����� int������ ��ȯ�ȴ�. int�� short�� ������ �� �����Ƿ� ������ ������ �߻��Ѵ�
		c=(short)(a+b);
		System.out.println(c);
		
//		int x,y;
//		x=y+'A';//(y�� �ʱ�ȭ���� ���� ���) The local variable y may not been initialized
//		y�� �ʱ�ȭ���� ���� ���¿����� ������ ������ �� ����. �׷��Ƿ� ������ ������ �߻��Ѵ�
		
		int x,y;
		y=10;
		x=y+'A';	
		System.out.println(x);//75��� �ᱣ���� ��µȴ�.
	}
}
