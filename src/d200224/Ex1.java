package d200224;

public class Ex1 {
	public static void main(String[] args) {
		Object[] t = new Object[3];

		t[0] = new Integer(100);
		t[1] = new Integer(20);
		t[2] = new String("Korea");

//		Arrays.sort(t); ��Ÿ�� ����
//		�迭�� ���� Ÿ�Ե��� ȥ���ϰ� �����Ƿ� ĳ������ �� �� ������ �߻��Ѵ�.
//		//Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String

		for (Object o : t) {
//			String s= (String)o;
//			System.out.println(s.length());
			if (o instanceof String) {
				String s = (String) o;
				System.out.println(s + ":" + s.length());
			} else if (o instanceof Integer) {
				Integer s = (Integer) o;
				System.out.println("����: " + s);
			}
//			System.out.println(o);
		}
	}
}