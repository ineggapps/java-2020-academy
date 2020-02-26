package d200226;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;

public class Ex7Load {
	public static void main(String[] args) {
		// Hashtable Ŭ������ ��� ����
		// Ű�� ���� ���ڿ��� �����ϴ�.
		// ���� ���� �� �ҷ����Ⱑ �����ؼ� ȯ�漳�� ��� ���� ���ȴ�.
		Properties p = new Properties();
		// Properties�� ���׸��� ����
		// Properties ���� put() �޼��带 ����� �� ������ �������� �ʴ´�.
		// Ű�� ���� �����Ѵ�.

		String pathname = "subject.properties";
		try (FileInputStream fis = new FileInputStream(pathname)) {
			p.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}

		p.list(System.out);
		String s = p.getProperty("�ڹ�");
		System.out.println("�ڹ�: " + s);
		System.out.println();

		System.out.println("��ü ��ȸ...");
		Iterator<Object> it = p.keySet().iterator();
		while (it.hasNext()) {
			String k = (String) it.next();
			String v = p.getProperty(k);
			System.out.println(k + "=>" + v);
		}
	}
}
