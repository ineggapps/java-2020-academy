package d200226;

import java.io.FileOutputStream;
import java.util.Properties;

public class Ex7Save {
	public static void main(String[] args) {
		// Hashtable Ŭ������ ��� ����
		// Ű�� ���� ���ڿ��� �����ϴ�.
		// ���� ���� �� �ҷ����Ⱑ �����ؼ� ȯ�漳�� ��� ���� ���ȴ�.
		Properties p = new Properties();
		// Properties�� ���׸��� ����
		// Properties ���� put() �޼��带 ����� �� ������ �������� �ʴ´�.
		// Ű�� ���� �����Ѵ�.
		p.setProperty("�ڹ�", "80");
		p.setProperty("������", "90");
		p.setProperty("����", "85");
		p.setProperty("����Ŭ", "90");
		p.setProperty("HTML", "100");

		String pathname = "subject.properties";
		try (FileOutputStream fos = new FileOutputStream(pathname)) {
			p.store(fos, "���� ����");
			System.out.println("���� ���� �Ϸ�");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
