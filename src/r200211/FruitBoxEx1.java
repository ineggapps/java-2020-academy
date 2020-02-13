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
//		Box<Grape> grapeBox = new Box<Apple>(); // 오류 타입 불일치

		fruitBox.add(new Fruit());
		fruitBox.add(new Apple()); // 가능 void add(Fruit item)
		fruitBox.add(new Grape()); // 가능 void add(Fruit item)

		appleBox.add(new Apple());
		appleBox.add(new Apple());
		appleBox.add(new Apple());
//		appleBox.add(new Toy());//불가능, Apple에는 Apple만 담을 수 있음

		toyBox.add(new Toy());
//		toyBox.add(new Apple());//불가능, Toy박스에는 Toy만 담기 가능

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
	// BOX의 속성을 모두 물려받고 FruitBox는 Fruit을 상속받는 객체만을 담을 수 있다는 의미임.
	// Fruit 객체도 마찬가지로 FruitBox에 담을 수 있음.
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
	static Juice makeJuice(FruitBox<? extends Fruit> box) {//<Fruit>으로 지정한다
		String tmp="";
		for(Fruit f: box.getList()) {
			tmp += f + " ";
		}
		return new Juice(tmp);
	}
}