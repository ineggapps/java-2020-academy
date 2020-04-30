package d200226;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ex1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("가가가", 80);
		map.put("고고고", 90);
		map.put("히히히", 100);
		map.put("마마마", 60);
		map.put("크크크", 80);

		System.out.println(map);

		// 키를 Set으로 가져오기
		System.out.println("키를 SET으로 가져오기");
		Set<String> set = map.keySet();
		System.out.println(set);

		// map의 값을 list로 가져오기
		List<Integer> list = new LinkedList<>(map.values());
		System.out.println(list);
		list.clear();
		list.addAll(map.values());
		System.out.println(list);
		
		System.out.println("map 전체-1");
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			int score = map.get(key);
			System.out.println(key + score);
		}
		System.out.println();

		// - entry: key와 value를 묶어주기 위해 사용
		// - Map.Entry: 인터페이스 (키와 값을 하나로 보기 위해 사용하는 것이 Entry이다)
		// 키와 값을 Set 형태로 저장하기 위해 사용
		// 즉, Map의 Entry(키와 값의 한 쌍)이다.
		System.out.println("map 전체-2");
		Set<Map.Entry<String, Integer>> set2 = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it2 = set2.iterator();
		while (it2.hasNext()) {
			Map.Entry<String, Integer> e = it2.next();
			System.out.println(e.getKey() + "->" + e.getValue());
		}
		System.out.println();

		// 향상된 for문
		System.out.println("map 전체-3");
		for (String s : map.keySet()) {
			int score = map.get(s);// map에서 key에 해당하는 값 가져오기
			System.out.println(s + ": " + score);
		}
		System.out.println();
		
		//값을 컬렉션으로
		System.out.println("값을 컬렉션으로 가져오기");
		Collection<Integer> col = map.values();
		Iterator<Integer> it3 = col.iterator();
		while(it3.hasNext()) {
			int a = it3.next();
			System.out.print(a + " ");
		}
		System.out.println();
		
		System.out.println("최고 점수: "+ Collections.max(col));
		System.out.println("최저 점수: "+ Collections.min(col));
	}
}
