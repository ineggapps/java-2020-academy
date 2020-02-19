package d200219;

public class Ex5 {
	public static void main(String[] args) {
		Rect rr = new Rect(10,5);
		rr.rectArea();
		rr.rectLen();
		rr.write("사각형");
		Circle c = new Circle();
		c.set(44);
		c.circleArea();
		c.circleLen();
		c.write("원");
	}
}

class Shape {
	protected double area;
	protected double len;

	public void write(String title) {
		System.out.println(title + " 넓이: " + area + ", 둘레: " + len);
	}
}

class Circle extends Shape {
	private int r;

	public void set(int r) {
		this.r = r;
	}

	public void circleArea() {
		area = r * r * Math.PI;
	}

	public void circleLen() {
		len = 2 * r * Math.PI;
	}
}

class Rect extends Shape {
	private int width;
	private int height;

	public Rect() {
	}

	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void rectArea() {
		area = width * height;
	}

	public void rectLen() {
		len = (width + height) * 2;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}