package d200228;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//Ex11 ���� �ǽ��� �ҽ����� ��û ����� �� �ִ�~
//�̷� �͵� �ֱ��� �ϰ� �Ѿ�� ��.
//��¿ �� ���� ���� ����
public class Ex11Class {
	public static void main(String[] args) {
		try {
			Class<?> cls = Class.forName("java.lang.String");
			System.out.println("===========================");
			System.out.println("���� Ŭ������ �˾ƺ���...");
			if (cls.getSuperclass() != null) {// ��� Ŭ������ super class�� Object�̴ϱ� ObjectŬ���� �ܿ� null���� ���� ���� ����
				System.out.println(cls.getSuperclass().getName());
			}
			System.out.println("===========================");
			System.out.println("�����ڸ� �˾ƺ���...");
			Constructor<?>[] cc = cls.getConstructors();
			for(Constructor<?> c: cc) {
				//�޼������ �¸��� ��µȴ�.
				System.out.println(c);
			}
			System.out.println("===========================");
			System.out.println("�ʵ� ������ ����� ��ҵ��� �˾ƺ���.");
			Field[] ff = cls.getDeclaredFields(); //private���� ���� ���
//			Field[] ff = cls.getFields();//public��
			for(Field f: ff) {
				System.out.println(f);
			}
			System.out.println("===========================");
			System.out.println("����� �޼������ �˾ƺ���.");
			Method[] mm = cls.getDeclaredMethods();//private���� ����
//			Method[] mm = cls.getMethods();//public��
			for(Method m : mm) {
				System.out.println(m);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
