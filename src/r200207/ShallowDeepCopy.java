package r200207;

class Circle implements Cloneable {
	// clone �޼��带 ����ϱ� ���ؼ��� �ݵ�� Cloneable �������̽��� �����ؾ� �Ѵ�.
	Point p;
	double r;

	Circle(Point p, double r) {
		this.p = p;
		this.r = r;
	}

	public Circle shallowCopy() {// ���� ����
		Object obj = null;
		try {
			/*
			 * ���� ����� ������ �������� ���� ��ü�� �����Ѵ�. CircleŬ�������� ����ϴ� ��ü�� Point�̴�. (��ü�� ������ ��
			 * Point��ü���� ��ȯ ����) ���� ���翡���� ����ϰ� �ִ� Point��ü�� ������ �������� �ʴ´�.
			 */
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			// ���� ������ �׻� try-catch�������� ���ξ� �Ѵ�.
		}
		return (Circle) obj;
	}

	public Circle deepCopy() {// ���� ����
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
		}
		Circle c = (Circle) obj;
		// ���� ���翡���� ����ȯ�Ӹ� �ƴ϶� �����ϴ� ��ü������ ���Ӱ� �����Ѵ�.
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
	public Point clone()  {//���� ��ȯŸ��(covariant return type; ��ܨ  �ϳ��� ���Ͽ� ��ȯ�ϴ� Ÿ��?)
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

		System.out.println("=c1�� ���� �� =");
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
