package d200228;

public class Ex3AnonymousClass {
	public static void main(String[] args) {
		Test3 t = new Test3();
		t.fun();
		t.sub();
	}
}

interface User3 {
	public void print();
}

class Test3 {
	//�������̽� ����
	//Comparatoró�� ���������� �׶� �׶� �޼��� ������ �޸��ϰ��� �� �� ���
	public void fun() {
		User3 uu = new User3() {
			@Override
			public void print() {
				System.out.println("�氡 �氡...");
			}
		};
		uu.print();
	}

	public void sub() {
		User3 uu = new User3() {
			@Override
			public void print() {
				System.out.println("������.");
			}
		};
		uu.print();
	}
}
