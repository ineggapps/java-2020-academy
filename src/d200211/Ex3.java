package d200211;

public class Ex3 {
	public static void main(String[] args) {
		//Ŭ���� ������ Ŭ������ �ε��Ǹ鼭 �� �� ���� �޸� �Ҵ��� �޴´�.
		//Ŭ���� ������ ��ü ������ ������� Ŭ���� �̸����� ������ ������
		System.out.println(Test3.PI);
		Test3 t1;
//		System.out.println(t1.b);//�޸� �Ҵ��� ���� �ʾ���.
		t1 = new Test3();//�����ڸ� �ҷ��߸� �ν��Ͻ��� �޸𸮿� �ε�ȴ�.
//		System.out.println(t1.a);//private�̹Ƿ� ������ ���� �߻�
		System.out.println(t1.b);
		System.out.println(t1.name);
		Test3 t2 = new Test3();
		t2.b=50;
		System.out.println(t1.b +":"+t2.b);
		//Ŭ���������� ������ ���� �Ϲ������� ��ü�� �������� �ʴ´�. (<- a warning message)
		t1.PI=70;
		System.out.println(t1.PI+":"+t2.PI+":"+Test3.PI);
	}
}

class Test3 {
	/*
	 	�ν��Ͻ� ����
	 	��ü�� ������ ���Ŀ� ������ �� ����.
	 */
	private int a = 10;//����� ���ÿ� �ʱ�ȭ. private�� �ش� Ŭ���� �������� ������ �� ����.
	int b;//����� ���ÿ� �ʱ�ȭ (int => 0)
	String name;// ����� ���ÿ� �ʱ�ȭ(�����ڷ��� => null)
	
	/* 
	 	static
	 	Ŭ���� ����: ��ü�� �������� �ʾƵ� ���� �����ϸ�
		��ü�� ������ ���� ������.
		Ŭ���� ������ ��ü�� �������� �ʰ� Ŭ���� ������ �����Ѵ�.
	 */
	public static double PI=3.141592;
	
}