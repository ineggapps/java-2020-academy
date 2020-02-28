package d200228;

import java.util.Enumeration;
import java.util.Properties;

public class Ex9System {
	public static void main(String[] args) {
		String s;
		// getProperty �� Ű���� ��ҹ��� ������.
		s = System.getProperty("os.name");
		System.out.println("OS: " + s);
		s = System.getProperty("java.version");
		System.out.println("�ڹ� ����: " + s);
		s = System.getProperty("user.dir");// �� ����ϰ� �־�� ��.
		System.out.println("���� �۾� ���: " + s);

		System.out.println("===========================");
		// getProperty�� �Է��ϴ� Key���� Key�� �����ϴ� ��(Value)�� ��� ����ϴ� ���
		// �ݺ����� ����: Iterator, ListIterator(�յ� ����� �̵��� ������), Enumeration
		Properties p = System.getProperties();
		Enumeration<?> e = p.propertyNames();
		while (e.hasMoreElements()) {// Iterator�� �޼������ �ٸ��� ������ ����ϴٰ� ��������
			String k = (String) e.nextElement();
			String v = p.getProperty(k);
			System.out.println(k + " ==> " + v);
		}
		// ���α׷� ���� ����
		System.out.println("���α׷� ���� ����");
		System.exit(0);

	}
}
