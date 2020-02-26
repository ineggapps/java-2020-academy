package d200225;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Ex13 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("����");
		list.add("�λ�");
		list.add("�뱸");
		list.add("����");

		System.out.println("��ü-1");
		for (String s : list) {
			System.out.print(s + " ");
		}
		System.out.println();

		System.out.println("��ü-2");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.print(s + " ");
		}
		System.out.println();

		System.out.println("��ü-3");
		// ListIterator: ������ ��µ� ����
		ListIterator<String> it2 = list.listIterator();
		while (it2.hasNext()) {
			String s = it2.next();
			System.out.print(s + " ");
		}
		System.out.println();

		System.out.println("��ü-4(����)");
		// ListIterator ������ ����� ����
		ListIterator<String> it3 = list.listIterator(list.size());
		while (it3.hasPrevious()) {
			String s = it3.previous();
			System.out.print(s + " ");
		}
		System.out.println();

		//////////////////////////////////

		Vector<String> v = new Vector<String>();
		v.add("����");
		v.add("���");
		v.add("���");

		Enumeration<String> e = v.elements();
		System.out.println("���� ��ü-1");
		while (e.hasMoreElements()) {
			String s = e.nextElement();
			System.out.print(s + " ");
		}
		System.out.println();

		System.out.println("���� ��ü-2");
		Iterator<String> vi = v.iterator();
		while (vi.hasNext()) {
			String s = vi.next();
			System.out.print(s + " ");
		}
		System.out.println();

		System.out.println("���� ��ü-3");
		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();

	}
}
