package d200220;

public class Ex3 {
	public static void main(String[] args) {
//		SingletonEx2 ob = new SingletonEx2();//������ ����
		SingletonEx2 ob = SingletonEx2.getInstance();
		SingletonEx2 ob2 = SingletonEx2.getInstance();
		System.out.println(ob==ob2);
		System.out.println(ob.hashCode()+"=="+ob2.hashCode());
	}
}


class SingletonEx2{//Real �̱������� ���� (���ü� ���� �ذ�)
	
	private SingletonEx2() {
	}
	
	//static ��ø Ŭ����
	//SingletonEx2�� �ε�� �� ��Ƽ������ ȯ�濡���� �� �� ���� ������ �Ǵ� �����̴�.
	private static class Holder{
		public static final SingletonEx2 INSTANCE= new SingletonEx2();
	}
	
	public static SingletonEx2 getInstance() {
		return Holder.INSTANCE;
	}
}