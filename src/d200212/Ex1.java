package d200212;

public class Ex1 {
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.print();
		t.add();
		t.print();
		
		t.write(1010);
	}
}

class Test1 {
	int a = 10;//�ν��Ͻ� ���� => Ŭ���� �ȿ��� �ʵ�� �������� �����̶�� �ν��ϸ� �ȴ�.

	public void add() {
		a++;
	}

	public void print() {
		System.out.println(a);
	}

	public void write(int a) {//���⼭ �Ű����� a�� ����������� �޾Ƶ鿩�� �����ϴ�.
//		int a; << ���������� �Ϻ��� �Ű����� a�� �̹� ����Ǿ����Ƿ� �Ű�������� ��ġ�� ������������ �� ������ ���� ����.
//		�ʵ�� ���������� �̸��� ������ ���� ����. ��, ������ ��쿡�� ���������� �켱������ ����.
		System.out.println(a);//�Ű����� a���� �ǹ���.
	}
}