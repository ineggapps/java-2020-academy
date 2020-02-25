package d200225;

import java.util.Iterator;
import java.util.Vector;

public class Ex4 {
	public static void main(String[] args) {
//		List<String> list = new Vector<String>();
		// List���� Vector�� �޼��尡 �� ����.

		// ArrayList ����ȭ�� �������� ����
		// Vector:����ȭ�� ������ (��Ƽ������ ȯ�濡�� �����ϴ�)
		Vector<String> list = new Vector<String>();
		// Vector�� �ʱ� �뷮 Ȯ���ϱ�
		System.out.println("�ʱ� �뷮:" + list.capacity());

		for (int i = 1; i <= 21; i++) {
			list.add("a" + i);
		}

		// �뷮�� �����ϸ� 10���� �þ��
		// �ƴѵ�.. 10, 20, 40, 80, 160���� �þ�µ�..
		System.out.println("����: " + list.size());
		System.out.println("�뷮:" + list.capacity());

		list.add(0, "Korea");
		System.out.println(list);

		// ó���� ������ ����
		System.out.println("ó��: " + list.get(0));
		System.out.println("ó��: " + list.firstElement());

		// ������ ������ ����
		System.out.println("������: " + list.get(list.size() - 1));
		System.out.println("������: " + list.lastElement());

		list.set(0, "���ѹα�");
		System.out.println(list);

		// ��ü ��������
		// ���� for���� �̿��ϱ�
		System.out.println("��ü-1");
		for (String s : list) {
			System.out.print(s + " ");
		}
		System.out.println();

		// �ݺ��� for�� get()�� �̿��ؼ� ��������
		System.out.println("��ü-2");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();

		// Iterator �̿��ؼ� ��������
		System.out.println("��ü-3");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.print(s + " ");
		}
		System.out.println();

		// �������� ��������
		System.out.println("����");
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();

		// ��ġ���ϱ�
		list.remove(3);
		list.remove("a7");

		// ��ü ����
		list.clear();

		System.out.println("����: " + list.size());
		System.out.println("�뷮: " + list.capacity());

		// �뷮�� ������ ����
		list.trimToSize();
		System.out.println("�뷮: " + list.capacity());
	}
}
