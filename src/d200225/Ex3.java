package d200225;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex3 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();

		// ArrayList�� LinkedList�� add�� ���, ó���ӵ��� ������.
		/// LinkedList�� ArrayList���� ó�� �ӵ��� ������.
		// �ֳ��ϸ� LinkedList�� �������� �߰� �� ���� ��, ArrayListó�� ���ʿ��� ���簡 �Ͼ�� �ʱ� �����̴�.

		long s, e;

		s = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add("�׽�Ʈ " + i);
		}

		e = System.nanoTime();
		System.out.println("ArrayList ����: " + list1.size() + "," + (e - s) + "nano");

		s = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add("�׽�Ʈ " + i);
		}

		e = System.nanoTime();
		System.out.println("LinkedList ����: " + list1.size() + "," + (e - s) + "nano");

	}
}
