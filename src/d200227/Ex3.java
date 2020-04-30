package d200227;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {
	public static void main(String[] args) {
		// Shuffle 예제 3
		// ArrayList 객체를 직접 shuffle 구현하기
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("spring");
		list.add("html");
		list.add("css");
		list.add("javascript");

		System.out.println(list);

		String s;
		int n;

		// Shuffle 알고리즘 구현
		for (int i = 0; i < list.size(); i++) {
			n = (int) (Math.random() * list.size());
			if (n != i) {// 현재 배열의 인덱스i값과 이동시키려는 인덱스 n값이 같지 않으면
				s = list.get(i);
				list.set(i, list.get(n));
				list.set(n, s);
			} else {// i와 n이 같은 자리이면 의미없으니까 다시 한 번 더 실행하도록 유도하면 셔플 알고리즘이 좀 더 수행된다.
				i--;
			}
		}
		System.out.println(list);
	}
}
