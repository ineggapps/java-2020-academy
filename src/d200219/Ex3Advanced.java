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
		super(3303);//����Ŭ������ �Ű������� ���� �����ڰ� ������ ��������� ������ �ʿ��ϴ�.
		this.x=x;
	}
}