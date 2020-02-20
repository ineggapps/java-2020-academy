package d200220;

public class Ex2 {
	public static void main(String[] args) {
//		SingletonEx1 ob = new SingletonEx1(); //������ ����, �����ڰ� private�̴�.
		SingletonEx1 ob = SingletonEx1.getInstance();
		SingletonEx1 ob2 = SingletonEx1.getInstance();
		System.out.println(ob.hashCode());
		System.out.println(ob2.hashCode());
		System.out.println(ob == ob2);
		ob.print();
	}
}

class SingletonEx1 {//��ü�� 1���� �����ϴ� ������ ���� (ex: DB����)
	//1) �����ڿ� �ν��Ͻ� ������ private���� �����Ѵ�
	//�ν��Ͻ� ���������� �ش� Ŭ������ ��ü �ּڰ��� ��ų� null�� ��� ���� ����.
	private static SingletonEx1 instance = null;
	private SingletonEx1() {
	}

	//2) Ŭ���� �޼���� �ش� Ŭ������ ��ü�� ��ȯ�ϴ� �޼��带 ������ �Ѵ�.
	//but, ��Ƽ ������ ȯ�濡���� ������ ���� �� �ִ�.
	public static SingletonEx1 getInstance() {
		if (instance == null) {
			instance = new SingletonEx1();
		}
		return instance;
	}
	
	public void print() {
		System.out.println("Singleton ���� ����");
	}
}