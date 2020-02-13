package r200213;

import java.util.ArrayList;

public class FruitBox<T extends Fruit> extends Box<T> {

}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();

	void add(T item) {
		list.add(item);
	}

	T get(int i) {
		return list.get(i);
	}

	ArrayList<T> getList() {
		return list;
	}

	int size() {
		return list.size();
	}

	@Override
	public String toString() {
		return list.toString();
	}
}