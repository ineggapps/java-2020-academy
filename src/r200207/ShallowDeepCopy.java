package r200207;

class Circle implements Cloneable {
	// clone 메서드를 사용하기 위해서는 반드시 Cloneable 인터페이스를 구현해야 한다.
	Point p;
	double r;

	Circle(Point p, double r) {
		this.p = p;
		this.r = r;
	}

	public Circle shallowCopy() {// 얕은 복사
		Object obj = null;
		try {
			/*
			 * 얕은 복사는 원본과 복제본이 같은 객체를 공유한다. Circle클래스에서 사용하는 객체는 Point이다. (객체를 생성할 때
			 * Point객체까지 반환 받음) 얕은 복사에서는 사용하고 있는 Point객체를 별도로 복사하지 않는다.
			 */
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			// 복사 구문은 항상 try-catch구문으로 감싸야 한다.
		}
		return (Circle) obj;
	}

	public Circle deepCopy() {// 깊은 복사
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
		}
		Circle c = (Circle) obj;
		// 깊은 복사에서는 형변환뿐만 아니라 참조하는 객체까지도 새롭게 생성한다.
		c.p = new Point(this.p.x, this.p.y);
		return c;

	}

	public String toString() {
		return "[p=" + p + ", r=" + r + "]";
	}
}

class Point implements Cloneable {
	int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
//	public Object clone()  {
	public Point clone()  {//공변 반환타입(covariant return type; 共變  하나로 변하여 반환하는 타입?)
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
		}
		return (Point) obj;
	}

	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}

public class ShallowDeepCopy {
	public static void main(String[] args) {
		Point p1 = new Point(1,2);
//		Point p2 = (Point)p1.clone();
		Point p2 = p1.clone();
		
		Circle c1 = new Circle(new Point(1, 1), 2.0);
		Circle c2 = c1.shallowCopy();
		Circle c3 = c1.deepCopy();

		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);
		System.out.println("c3=" + c3);

		c1.p.x = 9;
		c1.p.y = 9;

		System.out.println("=c1의 변경 후 =");
		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);
		System.out.println("c3=" + c3);

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
