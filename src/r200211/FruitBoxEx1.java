package r200211;

import java.util.ArrayList;

interface Eatable {
}

class Fruit implements Eatable {
	public String toString() {
		return "Fruit";
	}
}

class Apple extends Fruit {
	public String toString() {
		return "Apple";
	}
}

class Grape extends Fruit {
	public String toString() {
		return "Grape";
	}
}

class Toy {
	public String toString() {
		return "Toy";
	}
}

public class FruitBoxEx1 {
	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy> toyBox = new Box<Toy>();
//		Box<Grape> grapeBox = new Box<Apple>(); // ���� Ÿ�� ����ġ

		fruitBox.add(new Fruit());
		fruitBox.add(new Apple()); // ���� void add(Fruit item)
		fruitBox.add(new Grape()); // ���� void add(Fruit item)

		appleBox.add(new Apple());
		appleBox.add(new Apple());
		appleBox.add(new Apple());
//		appleBox.add(new Toy());//�Ұ���, Apple���� Apple�� ���� �� ����

		toyBox.add(new Toy());
//		toyBox.add(new Apple());//�Ұ���, Toy�ڽ����� Toy�� ��� ����

		FruitBox<Fruit> onlyFruitBox = new FruitBox<Fruit>();
		onlyFruitBox.add(new Apple());
		onlyFruitBox.add(new Fruit());
//		onlyFruitBox.add(new Toy());

		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);
		System.out.println(onlyFruitBox);
	}
}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();

	void add(T item) {
		list.add(item);
	}

	T get(int i) {
		return list.get(i);
	}

	int size() {
		return list.size();
	}

	public String toString() {
		return list.toString();
	}

	public ArrayList<T> getList() {
		return list;
	}

}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {
	// BOX�� �Ӽ��� ��� �����ް� FruitBox�� Fruit�� ��ӹ޴� ��ü���� ���� �� �ִٴ� �ǹ���.
	// Fruit ��ü�� ���������� FruitBox�� ���� �� ����.
}

class Juice{
	String s;
	Juice(String s){
		this.s = s;
	}
	@Override
	public String toString() {
		return "Juice [s=" + s + "]";
	}
}

class Juicer{
	static Juice makeJuice(FruitBox<? extends Fruit> box) {//<Fruit>���� �����Ѵ�
		String tmp="";
		for(Fruit f: box.getList()) {
			tmp += f + " ";
		}
		return new Juice(tmp);
	}
}