import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex14 {
	public static void main(String[] args) {
		// Map: 키->값 구조
		// 키는 중복을 허용하지 않고 순서가 없다
		// HashMap:동기화를 지원하지 않는다.
		Map<String, Integer> map = new HashMap<String, Integer>();

		// map에 값 저장하기
		map.put("서울", 1000);
		map.put("부산", 350);
		map.put("대구", 250);
		map.put("인천", 300);
		map.put("광주", 150);
		map.put("대전", 150);
		map.put("울산", 110);
		map.put("세종", 20);
		map.put("서울", 990);// 키 값이 같으면 기존 값을 덮어 씌운다.
		System.out.println(map);
		// {울산=110, 대전=150, 서울=990, 세종=20, 부산=350, 대구=250, 인천=300, 광주=150}

		// map에서 키의 값 가져오기
		int a = map.get("서울");
		System.out.println(a);

		// 처음부터 끝까지 순회하는 방법
		// Map에는 Iterator(반복자)가 없으며 향상된 for문도 사용할 수 없다.
		// Set<String> set = map.keySet();는 키에서
		// Set 객체를 반환하므로 키의 Set객체를 이용하여 처음부터 끝까지 순회한다.

		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			Integer value = map.get(key);
			System.out.println(key + "=>" + value);
		}
		
		//Map이 중요하다. 사용법 암기 ↑
		
		System.out.println("키로 서울이 존재하는지? "+map.containsKey("서울"));
		System.out.println("키로 경기가 존재하는지? "+map.containsKey("경기"));
		System.out.println("전체 개수 "+map.size());
		map.remove("세종");
		System.out.println(map);
	}
}
