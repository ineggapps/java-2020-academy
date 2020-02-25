import java.util.Set;
import java.util.TreeSet;

public class Ex10 {
	public static void main(String[] args) {
		// Set: 중복을 허용하지 않는다.
		// TreeSet:정렬한다. Comparable 구현 클래스만 가능하다.
		// 정렬 속도가 매우 빠르다

		Set<String> set = new TreeSet<String>();

		set.add("서울");
		set.add("부산");
		set.add("대구");
		set.add("인천");
		set.add("광주");
		set.add("대전");
		set.add("울산");
		set.add("세종");
		set.add("서울");// 무시된다 중복을 허용하지 않으니까.

		System.out.println(set);

		for (String s : set) {
			System.out.print(s + " ");
		}
		System.out.println();

	}
}
