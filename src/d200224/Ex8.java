package d200224;

public class Ex8 {
	public static void main(String[] args) {
		User8<Integer> ob = new UserImpl8<>();
		ob.print(10);
		
		User8<String> ob2 = new UserImpl8String<>();
		ob2.print("korea");
	}
}

interface User8<T> {
	public void print(T t);
}

class UserImpl8<T> implements User8<T> {
	@Override
	public void print(T t) {
		System.out.println(t);
	}
}

class UserImpl8String<T> implements User8<String>{

	@Override
	public void print(String t) {
		System.out.println(t);
	}
	
}