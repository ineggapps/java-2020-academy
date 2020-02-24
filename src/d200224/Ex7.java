package d200224;

public class Ex7 {
	public static void main(String[] args) {
		User7<Integer> ob = new User7<>();
		Integer[] a = {10,20,30};
		ob.set(a);
		
		Integer[] b = ob.get();
		for(int x: b) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
}

class User7<T> {
	private T[] data;

	@SuppressWarnings("unchecked")//경고 무시하겠다는 선언
	public User7() {
		data = (T[]) new Object[10];// 강제로 배열을 생성 (권장하지 않음)
		// Object형 배열로 선언한 뒤 캐스팅을 해주면 강제로 배열을 생성할 수 있다.
		// 하지만 new T[3]; 처럼 선언이 불가능한 이유는 아직 Type이 정해지지 않았기 때문이다.
	}

	public void set(T[] data) {
		this.data = data;
	}

	public T[] get() {
		return data;
	}
}