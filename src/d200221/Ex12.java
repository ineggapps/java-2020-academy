package d200221;

public class Ex12 {
	public static void main(String[] args) {
		User12 ob = new User12();
		ob.setValue(-3);
		int n = ob.getValue();
		System.out.println(n);
		System.out.println("------------------------");
	}
}

//잘못 작성된 경우
class User12 {
	private int value;

	public void setValue(int value) {
		try {
			if (value < 0) {
				throw new Exception("0보다 작잖아!");
			}
			this.value = value;
		}
		catch(Exception e) {// throw new Exception("~") 한 것을 catch함.
			//메서드를 호출한 곳에서는 예외가 있는지 알지 못한다. (호출한 곳에서는 예외를 잡을 수 없다는 이야기임)
			//잘못 작성된 코드
			//예외를 적절한 시기에 발생시키는 것도 중요하지만, 이 예외를 어디서 처리해야 하는지 정하는 것 또한 매우 중요하다. 
			System.out.println(e.toString());
		}
	}

	public int getValue() {
		return value;
	}
}