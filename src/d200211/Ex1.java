package d200211;

//���ϸ�� ���� Ŭ������ public ������ �����ϴ�
public class Ex1 {
	public static void main(String[] args) {
		//��������(Reference Type Variables)
		Rectangle r;//����
		r = new Rectangle();//�����ڸ� �̿��Ͽ� �޸𸮿� �Ҵ��Ѵ�. ������ �� �޸� �Ҵ�� �ʱ�ȭ �۾��� ����Ѵ�.
		r.width=57; r.height=128;
		int a,b;
		a=r.area();
		b=r.length();
		System.out.println("����: " + a );
		System.out.println("�ѷ�: " + b );
	}
}
//���������� private�� �ڽĵ� ��ӹ��� �� ����.
//class TestParent{
//	private int a;
//	public int b;
//}
//class TestChild extends TestParent{
//	void test() {
//		System.out.println(a); //a ��� �Ұ� (not visible)
//	}
//}
/*
- �簢��
	- �ʵ�
		- ����
		- ����
	- �޼���
		- ����
		- �ѷ�
 */
class Rectangle {
	// �ʵ�(�ν��Ͻ� ����)
	int width;
	int height;

	// �޼���(�ν��Ͻ� ����)
	// ���� �޼���
	public int area() {
		int result;
		result = width * height;
		return result;
	}

	// �ѷ� �޼���
	public int length() {
		int result;
		result = (width + height) * 2;
		return result;
	}
}
/*
 * 1. �߻�ȭ(��ü �𵨸�)
 * 2. �ڵ� 
 * 3. ��ü �����Ͽ� �̿�
 */
