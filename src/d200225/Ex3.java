package d200225;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex3 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();

		// ArrayList와 LinkedList을 add할 경우, 처리속도가 빠르다.
		/// LinkedList가 ArrayList보다 처리 속도가 빠르다.
		// 왜냐하면 LinkedList는 데이터의 추가 및 삭제 시, ArrayList처럼 불필요한 복사가 일어나지 않기 때문이다.

		long s, e;

		s = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add("테스트 " + i);
		}

		e = System.nanoTime();
		System.out.println("ArrayList 개수: " + list1.size() + "," + (e - s) + "nano");

		s = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add("테스트 " + i);
		}

		e = System.nanoTime();
		System.out.println("LinkedList 개수: " + list1.size() + "," + (e - s) + "nano");

	}
}
