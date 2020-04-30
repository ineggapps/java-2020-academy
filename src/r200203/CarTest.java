package r200203;

public class CarTest {

	public static void main(String[] args) {
		Car c = new Car();
		FireEngine f = new FireEngine();
		Car z = f;
		z.drive();
		
	}

}
