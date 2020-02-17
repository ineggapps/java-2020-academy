package r200217;

public class DeepCopyTest {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.setValue(10000);
		p.getDisplay().setSize(9.5);
		try {
			Phone p2 = p.clone();
			p2.setValue(20000);
			p2.getDisplay().setSize(10.5);
			System.out.println(p);
			System.out.println(p2);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}


class Phone implements Cloneable{
	private int value;
	private Display display= new Display();
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Display getDisplay() {
		return display;
	}
	public void setDisplay(Display display) {
		this.display = display;
	}
	@Override
	protected Phone clone() throws CloneNotSupportedException {
		Phone p = (Phone) super.clone();
		double size = p.display.getSize();
		p.display = new Display();
		p.display.setSize(size);
		return p;
	}
	@Override
	public String toString() {
		return "Phone [value=" + value + ", display=" + display + "]";
	}
	
	
}

class Display{
	private double size;

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Display [size=" + size + "]";
	}
	
	
	
	
}