package d200226;

import java.io.FileInputStream;
import java.io.FileOutputStream;
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
	}
}
