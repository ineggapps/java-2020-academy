package d200221;

public class Ex11 {
	public static void main(String[] args) throws Exception{//main에 throws를 할 경우 JVM에게 오류가 발생할 수 있다고 떠넘긴다. (비권장)
		User11 ob = new User11();
		ob.setValue(-3);
		int n = ob.getValue();
		System.out.println(n);
		System.out.println("------------------------");
	}
}

//잘못 작성된 경우
class User11 {
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