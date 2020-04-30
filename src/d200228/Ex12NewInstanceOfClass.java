package d200228;

public class Ex12NewInstanceOfClass {
	public static void main(String[] args) {
		String clsName = "d200228.User12";// 패키지명.클래스명 일치시켜야 함! <<< 각자 패키지명과 클래스명에 맞게 작성한 후 실행
		try {
			Class<?> cls = Class.forName(clsName);
			// 객체 생성 또 다른 방법 (new 쓰지 않고)
			Object oo = cls.newInstance();

			// 다운 캐스팅하여 사용하기
			User12 uu = (User12) oo;
			int s = uu.add(10, 5);
			uu.print("합", s);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class User12 {
	public int add(int a, int b) {
		return a + b;
	}

	public void print(String title, int s) {
		System.out.println(title + ":" + s);
	}

}