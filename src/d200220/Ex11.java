package d200220;

public class Ex11 {
	public static void main(String[] args) {
//		Demo11 ob = new Demo11();//������ ����
		Demo11 ob = new Demo11() {//������ �� Ex11$1.class�� ������ ������� ���� Ȯ���� �� �ִ�.
			//�͸��� ���� ��ü
			@Override
			public void print() {
				System.out.println("���...");
			}
		};
		ob.print();
	}
}


interface Demo11{
	public void print();
}

