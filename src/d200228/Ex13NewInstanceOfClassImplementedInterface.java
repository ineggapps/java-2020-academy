package d200228;

public class Ex13NewInstanceOfClassImplementedInterface {
	public static void main(String[] args) {
		String className = "d200228.Test13";// ��Ű����.Ŭ������ ��ġ���Ѿ� ��! <<< ���� ��Ű����� Ŭ������ �°� �ۼ��� �� ����
		try {
			Class<?> cls = Class.forName(className);
			User13 uu = (User13) cls.newInstance();
			int s = uu.add(10, 5);
			uu.print("��", s);// Ex12������ Ŭ������ �������̾��ٸ� Ex13�� �������̽��� �������̴�.
			// �������̽��� ���� �����ϰ� �����ϴ� ���� �� �� �۾��ϴ� �� ȿ�����̴� (������ ü���� ���� ���� ����)
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

interface User13 {
	public int add(int a, int b);

	public void print(String title, int result);
}

class Test13 implements User13 {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public void print(String title, int result) {
		System.out.println(title + " => " + result);
	}

}
