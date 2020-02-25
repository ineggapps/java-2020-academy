package d200225;

import java.util.Iterator;
import java.util.Vector;

public class Ex4 {
	public static void main(String[] args) {
//		List<String> list = new Vector<String>();
		// List보다 Vector의 메서드가 더 많다.

		// ArrayList 동기화를 지원하지 않음
		// Vector:동기화를 지원함 (멀티쓰레드 환경에서 안전하다)
		Vector<String> list = new Vector<String>();
		// Vector의 초기 용량 확인하기
		System.out.println("초기 용량:" + list.capacity());

		for (int i = 1; i <= 21; i++) {
			list.add("a" + i);
		}

		// 용량이 부족하면 10개씩 늘어난다
		// 아닌데.. 10, 20, 40, 80, 160개씩 늘어나는데..
		System.out.println("개수: " + list.size());
		System.out.println("용량:" + list.capacity());

		list.add(0, "Korea");
		System.out.println(list);

		// 처음인 데이터 추출
		System.out.println("처음: " + list.get(0));
		System.out.println("처음: " + list.firstElement());

		// 마지막 데이터 추출
		System.out.println("마지막: " + list.get(list.size() - 1));
		System.out.println("마지막: " + list.lastElement());

		list.set(0, "대한민국");
		System.out.println(list);

		// 전체 가져오기
		// 향상된 for문장 이용하기
		System.out.println("전체-1");
		for (String s : list) {
			System.out.print(s + " ");
		}
		System.out.println();

		// 반복문 for과 get()을 이용해서 가져오기
		System.out.println("전체-2");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();

		// Iterator 이용해서 가져오기
		System.out.println("전체-3");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.print(s + " ");
		}
		System.out.println();

		// 역순으로 가져오기
		System.out.println("역순");
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();

		// 위치구하기
		list.remove(3);
		list.remove("a7");

		// 전체 삭제
		list.clear();

		System.out.println("개수: " + list.size());
		System.out.println("용량: " + list.capacity());

		// 용량을 개수로 조정
		list.trimToSize();
		System.out.println("용량: " + list.capacity());
	}
}
