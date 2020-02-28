package d200228;

import java.lang.reflect.Method;

public class Ex14InvokeMethodWithClassClass {
	public static void main(String[] args) {
		String className = "d200228.User14";// ��Ű����.Ŭ������ <<<< ��Ȯ�ϰ� ���Ѿ� ��
		try {
			Class<?> cls = Class.forName(className);
			Object ob = cls.newInstance();
			// �޼��� ����
			Method m1 = cls.getDeclaredMethod("hap", new Class[] { Integer.class, Integer.class });
			Method m2 = cls.getDeclaredMethod("sub", new Class[] { int.class, int.class });
			Method m3 = cls.getDeclaredMethod("write", new Class[] { String.class, int.class });
			Method m4 = cls.getDeclaredMethod("print");
			
			// �޼��� ȣ�� (���� ����� �ٸ���) <= �����ӿ�ũ���� ȣ���� �� ����ϴ� ����̴�.
			Object o1 = m1.invoke(ob, new Object[] { 20, 10 });
			//invoke: (����鿡�� � �������ൿ�� �˹��ϱ� ���� ������ �̸���) �θ���
			//�޼��带 �ش� ��ü���� ȣ���Ѵ�.
			m3.invoke(ob, "��", o1);
			Object o2 = m2.invoke(ob, new Object[] { 20, 10 });
			m3.invoke(ob, "��", o2);
			m4.invoke(ob);

			//���߿� �����������ӿ�ũ�� ���� ��� ��ü�� �����ϰų� �޼��带 �����ϴ� ����� ���� ���� ����ȴ�.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class User14 {
	public Integer hap(Integer a, Integer b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public void write(String title, int s) {
		System.out.println(title + "-> " + s);
	}

	public void print() {
		System.out.println("print ...");
	}
}
