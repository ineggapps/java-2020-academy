package d200217;

public class Ex2 {
	public static void main(String[] args) {
//		Long ob1=10;//������ ����. 
		// ������ �⺻�ڷ����� Ŭ���� ���� ��ȯ�� �Ұ����ϴ�.
		// ���� Long���� �⺻�ڷ����� �����ϰ� ������ 10L�� �Է��Ѵ�.
		Long ob1 = 10L;
		ob1 = new Long(10); // �� ����� �����ϴ�. �⺻�ڷ��� long�� int�� ���� ������ �� �����ϱ�.
		long lll = 10; // <- �����ϴϱ� new Long(10)�� �����ϴ� ����! �����ڴ� Long(long value)�̴�.
		Integer ob2 = 10;

		Long ob3;
//		ob3=ob2;//������ ���� Long�� Integer�� �ٸ� Ŭ�����̹Ƿ� �̿� ���� ��ü ���� ����ȯ�� ���� �Ұ����ϴ�
//		ob3=(Long)ob2; //������ ���� (�翬�� ����ȯ �� ��)
		long a;
		a=ob2;//Integer��ü�� auto unboxing�Ǿ� int������ ��ȯ�Ǿ��� long���� �޾Ƶ��� �� �ִ�.
		//a = ob2.intValue(); �����Ϸ��� �� ������ �ڵ����� �����Ͽ� long������ ĳ���õǾ� �� ���̴�.
 		ob3= new Long(ob2);
 		
 		System.out.println(ob1);
 		System.out.println(ob2);
 		System.out.println(a);
 		
 		System.out.println(Long.MAX_VALUE);
 		System.out.println(Long.MIN_VALUE);
 		System.out.println(Double.MAX_VALUE);
 		System.out.println(Double.MIN_VALUE);
	}
}
