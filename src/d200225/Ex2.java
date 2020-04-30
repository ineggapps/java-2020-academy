package d200225;

import java.util.LinkedList;
import java.util.List;

public class Ex2 {
	public static void main(String[] args) {
		// ArrayList: 추가의 삭제가 빈번한 경우 성능 저하 발생.
		// 검색 시에 속도가 빠르다. 동기화가 되지 않는다. (멀티 스레드 환경에서 안전하지 않음)
		// LinkedList: 추가와 삭제가 빈번한 경우 ArrayList보다 빠름
		// 검색이 느림. 동기화가 되지 않음(멀티 스레드 환경에서 안전하지 않음)

		List<String> list = new LinkedList<String>();
		list.add("서울");
		list.add("부산");
		list.add("대구");

		System.out.println(list.get(0));
	}
}
