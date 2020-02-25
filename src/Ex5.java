import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex5 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("서울");
		list.add("부산");
		list.add("대구");
		list.add("인천");
		list.add("광주");
		list.add("대전");
		list.add("울산");
		list.add("세종");

		System.out.println(list);

		int idx;
		// 순차 검색
		idx = list.indexOf("부산");
		System.out.println("부산 위치: " + idx);

		// 크기 순으로 정렬: Comparable 인터페이스가 구현된 클래스 가능
		Collections.sort(list);
		System.out.println("정렬 후: " + list);

		// 이분 검색 정렬되어 있어야 가능하다. 없으면 -1을 반환한다.
		idx = Collections.binarySearch(list, "서울");
		System.out.println("서울 위치: " + idx);

		// 역순 정렬
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("역순 후: " + list);

		// 이분 검색이 순차검색보다 무조건 빠르진 않다.
		// 데이터 건수가 몇 십 만 건이면 이분 검색이 더 빠르다.
		// 데이터 건수가 몇 백 건이면 순차검색이 더 빠르다.
	}
}
