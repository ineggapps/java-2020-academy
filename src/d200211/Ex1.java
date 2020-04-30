package d200211;

//파일명과 같은 클래스만 public 선언이 가능하다
public class Ex1 {
	public static void main(String[] args) {
		//참조변수(Reference Type Variables)
		Rectangle r;//선언만
		r = new Rectangle();//생성자를 이용하여 메모리에 할당한다. 생성자 → 메모리 할당과 초기화 작업을 담당한다.
		r.width=57; r.height=128;
		int a,b;
		a=r.area();
		b=r.length();
		System.out.println("넓이: " + a );
		System.out.println("둘레: " + b );
	}
}
//접근제한자 private은 자식도 상속받을 수 없다.
//class TestParent{
//	private int a;
//	public int b;
//}
//class TestChild extends TestParent{
//	void test() {
//		System.out.println(a); //a 사용 불가 (not visible)
//	}
//}
/*
- 사각형
	- 필드
		- 가로
		- 세로
	- 메서드
		- 넓이
		- 둘레
 */
class Rectangle {
	// 필드(인스턴스 변수)
	int width;
	int height;

	// 메서드(인스턴스 행위)
	// 넓이 메서드
	public int area() {
		int result;
		result = width * height;
		return result;
	}

	// 둘레 메서드
	public int length() {
		int result;
		result = (width + height) * 2;
		return result;
	}
}
/*
 * 1. 추상화(객체 모델링)
 * 2. 코딩 
 * 3. 객체 생성하여 이용
 */
