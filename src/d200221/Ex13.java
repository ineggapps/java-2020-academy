package d200221;

public class Ex13 {
	//unchecked Exception 관련된 예제
	public static void main(String[] args) {
		User13 uu = new User13();
		uu.setValue(-1);// setValue 메서드를 호출한 뒤 RuntimeException 예외가 발생한다.
		//하지만 예외처리를 하지 않아서 프로그램이 강제로 종료된다.
		int n = uu.getValue();
		System.out.println(n);
		System.out.println("end....");
	}
}

class User13{
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		if(value<0) {
			//unchecked Exception 종류인 RuntimeException은 메서드에 throws를 반드시 명시할 필요가 없다.
			//따라서 반드시 이 메서드를 부른 메서드에서도 try-catch 구문을 사용할 필요가 없다.
			throw new RuntimeException("0 이상만 가능합니다. ");
		}
		this.value = value;
	}
	
}
