package r200217;


public class ShallowCopyTest {
	public static void main(String[] args) {
		Car c = new Car();
		c.setName("È«±æµ¿");
		c.p.setPassword(0303);
		Car c2;
		try {
			c2 = c.clone();
			c2.setName("±è±æµ¿");
			c2.p.setPassword(1234);
			System.out.println(c.getName());
			System.out.println(c2.getName());
			System.out.println(c.p.getPassword());
			System.out.println(c2.p.getPassword());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}

class Car  implements Cloneable{
	private int price;
	private String name;
	Door p = new Door();
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Door getP() {
		return p;
	}

	public void setP(Door p) {
		this.p = p;
	}

	@Override
	protected Car clone() throws CloneNotSupportedException {
		return (Car) super.clone();
	}
	
}

class Door{
	private int password;

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}
	
}