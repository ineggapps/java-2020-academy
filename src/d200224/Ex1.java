package d200224;

public class Ex1 {
	public static void main(String[] args) {
		Object[] t = new Object[3];

		t[0] = new Integer(100);
		t[1] = new Integer(20);
		t[2] = new String("Korea");

//		Arrays.sort(t); 런타임 오류
//		배열에 여러 타입들이 혼재하고 있으므로 캐스팅을 할 때 오류가 발생한다.
//		//Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String

		for (Object o : t) {
//			String s= (String)o;
//			System.out.println(s.length());
			if (o instanceof String) {
				String s = (String) o;
				System.out.println(s + ":" + s.length());
			} else if (o instanceof Integer) {
				Integer s = (Integer) o;
				System.out.println("정수: " + s);
			}
//			System.out.println(o);
		}
	}
}