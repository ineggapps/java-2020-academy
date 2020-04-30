package d200220;

public class Ex6 {
	public static void packing(Fruit f) {
		System.out.println(f.getName() + ":" + f.getPrice());
	}

	public static void main(String[] args) {
		packing(new Apple());
		packing(new Orange());
		packing(new Fruit() {

			@Override
			public int getPrice() {
				return 90000;
			}

			@Override
			public String getName() {
				return "멜론";
			}
		});
	}
}

interface Fruit {
	public int getPrice();

	public String getName();
}

class Apple implements Fruit {

	@Override
	public int getPrice() {
		return 1000;
	}

	@Override
	public String getName() {
		return "사과";
	}

}

class Orange implements Fruit {

	@Override
	public int getPrice() {
		return 500;
	}

	@Override
	public String getName() {
		return "오렌지";
	}

}