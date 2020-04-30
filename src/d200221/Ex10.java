package d200221;

public class Ex10 {
	public static void main(String[] args) {
		User10 ob = new User10();
		try {
			ob.setValue(-3);
			int n = ob.getValue();
			System.out.println(n);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("------------------------");
	}
}

//잘못 작성된 경우
class User10 {
	private int value;

	public void setValue(int value) throws Exception {// 메서드를 호출하는 곳에서 예외를 catch하도록 설정
		if (value < 0) {
			throw new Exception("0보다 작잖아!");// 강제로 checked 예외를 발생(Exception 예외 발생)
		}
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}