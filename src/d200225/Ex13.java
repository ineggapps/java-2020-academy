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

		list.add("서울");
		list.add("부산");
		list.add("대구");
		list.add("광주");

		System.out.println("전체-1");
		for (String s : list) {
			System.out.print(s + " ");
		}
		System.out.println();

		System.out.println("전체-2");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.print(s + " ");
		}
		System.out.println();

		System.out.println("전체-3");
		// ListIterator: 역으로 출력도 가능
		ListIterator<String> it2 = list.listIterator();
		while (it2.hasNext()) {
			String s = it2.next();
			System.out.print(s + " ");
		}
		System.out.println();

		System.out.println("전체-4(역순)");
		// ListIterator 역으로 출력해 보기
		ListIterator<String> it3 = list.listIterator(list.size());
		while (it3.hasPrevious()) {
			String s = it3.previous();
			System.out.print(s + " ");
		}
		System.out.println();

		//////////////////////////////////

		Vector<String> v = new Vector<String>();
		v.add("강원");
		v.add("경기");
		v.add("경상");

		Enumeration<String> e = v.elements();
		System.out.println("벡터 전체-1");
		while (e.hasMoreElements()) {
			String s = e.nextElement();
			System.out.print(s + " ");
		}
		System.out.println();

		System.out.println("벡터 전체-2");
		Iterator<String> vi = v.iterator();
		while (vi.hasNext()) {
			String s = vi.next();
			System.out.print(s + " ");
		}
		System.out.println();

		System.out.println("벡터 전체-3");
		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();

	}
}
