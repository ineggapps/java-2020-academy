package d200219;

public class Ex3Advanced {

}

class Parent {
	int a;

	public Parent(int a) {
		this.a = a;
	}
}

class Child extends Parent {
	int x=10;
	public Child(int x){
		super(3303);//슈퍼클래스에 매개변수가 없는 생성자가 없으면 명시적으로 선언이 필요하다.
		this.x=x;
	}
}