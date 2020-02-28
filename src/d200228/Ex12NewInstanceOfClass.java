package d200228;

public class Ex12NewInstanceOfClass {
	public static void main(String[] args) {
		String clsName = "d200228.User12";//��Ű����.Ŭ���������� �� ��Ű������ ����ؾ� ��.
		try {
			Class<?> cls = Class.forName(clsName);
			//��ü ���� �� �ٸ� ��� (new ���� �ʰ�)
			Object oo = cls.newInstance();

			//�ٿ� ĳ�����Ͽ� ����ϱ�
			User12 uu = (User12)oo;
			int s= uu.add(10, 5);
			uu.print("��", s);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class User12 {
	public int add(int a, int b) {
		return a + b;
	}

	public void print(String title, int s) {
		System.out.println(title + ":" + s);
	}

}