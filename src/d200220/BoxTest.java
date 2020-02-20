package d200220;

public class BoxTest {
	public static void main(String[] args) {
		Box b = new Box();
		b.setItem(new Item("H"));
		
		BoxGeneric<Item> bb = new BoxGeneric<Item>();
		bb.setItem(new Item("H"));
//		bb.setItem(new String("a")); 이런 건 안 된단 말이지!
	}
}

class Item {
	private String name;
	
	Item(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class Box {
	Object item;

	void setItem(Object item) {
		this.item = item;
	}

	Object getItem() {
		return item;
	}
}

class BoxGeneric<WHAT> {
	WHAT item;

	void setItem(WHAT item) {
		this.item = item;
	}

	WHAT getItem() {
		return item;
	}
}