package d200224;

public class Ex3 {
	public static void main(String[] args) {
		User3<String> ob = new User3<>();//1.7부터 뒤쪽은 <>만 선언이 가능하다.
//		User3<String> ob = new User3<String>();//JDK 1.5, 1.6 버전에서는 반드시 둘 다 <> 안에 타입을 명시해야한다.
		ob.set("korea");
		System.out.println(ob.get());

//		ob.set(new Integer(20));//제네릭 타입으로 선언하였으므로 컴파일 오류가 발생한다.
		// 왜냐하면 User3을 String형으로 활용하기로 제네릭 타입으로 선언하였기 때문이다.

		User3<Integer> ob2 = new User3<>();
		ob2.set(new Integer(20));
		System.out.println(ob2.get());
		
		User3 ob3 = new User3();//제네릭 타입으로 선언하였지만 제네릭 타입을 명시하지 않으면 경고가 발생한다.
		ob3.set(new Integer(300));//내부적으로 Object로 처리하여서 문제가 발생하지는 않지만 경고를 띄운다.
		//프로그램 실행 시 잘못된 형변환으로 런타임 오류가 발생할 수 있기 때문이다.
		//ob3처럼 객체를 생성하는 것은 권장하지 않음.
		System.out.println(ob3.get());

		ob3.set(new String("seoul"));
		System.out.println(ob3.get());
	}
}

class User3<T> {//<T>: 제네릭. 실행 시에 자료형이 결정된다.
	//Type의 약자
	//내부적으로는 Object로 처리하나 좀 더 쉽게 사용하도록 처리한 것이 제네릭
	private T data;

	public void set(T t) {
		System.out.println(t.getClass().getName());
		data = t;
	}

	public T get() {
		return data;
	}

}