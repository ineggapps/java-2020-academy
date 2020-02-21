package d200221;

public class Ex9 {
	public static void main(String[] args) {
		User9 ob = new User9();
		ob.setValue(-3);
		int n = ob.getValue();
		System.out.println(n);
	}
}

//肋给 累己等 版快
class User9 {
	private int value;

	public void setValue(int value) {
		if (value < 0) {
			return;
		}
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}