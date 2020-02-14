package d200214;

public class Ex11 {
	public static final int RANGE=99000;
	public static void stringBufferTime() {
		long start = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("a");
		
		for(int i=1;i<RANGE;i++) {
			sb.append("a");
		}
		
		long end=System.currentTimeMillis();
		
		System.out.println("���ڿ� ����:"+sb.length());
		System.out.println("����ð�:"+(end-start)+"ms");
	}
	
	public static void stringBuilderTime() {
		long start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder("a");
		
		for(int i=1;i<RANGE;i++) {
			sb.append("a");
		}
		
		long end=System.currentTimeMillis();
		
		System.out.println("���ڿ� ����:"+sb.length());
		System.out.println("����ð�:"+(end-start)+"ms");
	}
	
	public static void stringTime() {
		long start = System.currentTimeMillis();
		String s= "a";
		for(int i=1;i<RANGE;i++) {
			s+="a";
		}
		long end = System.currentTimeMillis();
		System.out.println("���ڿ� ����:"+s.length());
		System.out.println("����ð�:"+(end-start)+"ms");
	}
	
	public static void main(String[] args) {
		//���� ���� �� StringBuilder�� ��ȯ�Ͽ� ���ڿ��� ���ϸ� ������ ��������.
//		String s ="����";
//		s+="�λ�";
//		s+="�뱸";
//		s+="��õ";
//		s+="����";
//		System.out.println(s);
		
		//StringBuilder, StringBuffer�� ����ؾ� �� ���� �׷��� ���� ���� ������.
		//StringBuilder�� StringBuffer�� �ñ����� ���̴� ���ü��� ���������̴�.
		//���ü��� �����ϸ� �ӵ��� ���������� ��Ȯ���� ��������.
		//���ü��� �����ϴ� Ŭ������ StringBuffer�̴�.
		//�ݸ�, StringBuilder�� ���ü��� �������� �����Ƿ� ���Ͻ����� ȯ�濡�� ����� �� �����ϴ�. 
		//(StringBuilder�� �ӵ��� �� �� ������)
		
		stringBufferTime();
		stringBuilderTime();
		stringTime();
		
	}
}
