package d200219;

public class CoffeeTest {
	public static void main(String[] args) {
		ACoffeeMachine a= new ACoffeeMachine();
		BCoffeeMachine b = new BCoffeeMachine();
		
		CoffeeMachine[] machines = new CoffeeMachine[2];
		machines[0] = a;
		machines[1] = b;
		
		for(CoffeeMachine m:machines) {
			m.make();
		}
		
	}

}


class CoffeeMachine{
	public void make() {
		System.out.println("일반 제조");
	}
}

class ACoffeeMachine extends CoffeeMachine{
	public void make() {
		System.out.println("카페라떼 제조");
	}
}

class BCoffeeMachine extends CoffeeMachine{
	public void make() {
		System.out.println("아메리카노 제조");
	}
}