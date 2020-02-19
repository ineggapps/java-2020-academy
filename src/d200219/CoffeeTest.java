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
		System.out.println("�Ϲ� ����");
	}
}

class ACoffeeMachine extends CoffeeMachine{
	public void make() {
		System.out.println("ī��� ����");
	}
}

class BCoffeeMachine extends CoffeeMachine{
	public void make() {
		System.out.println("�Ƹ޸�ī�� ����");
	}
}