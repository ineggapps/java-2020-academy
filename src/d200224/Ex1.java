package d200224;

public class Ex1 {
	public static void main(String[] args) {
		Object[] t = new Object[3];

		t[0] = new Integer(10);
		t[1] = new Integer(20);
		t[2] = new String("Korea");

		for (Object o : t) {
			System.out.println(o);
		}
	}
}