package d200225;
import java.util.HashSet;
import java.util.Set;

public class Ex8 {
	public static void main(String[] args) {
		// Set: 중복 허용 안 함. 순서가 없음.(HashSet)
		Set<String> set = new HashSet<String>();

		set.add("서울");
		set.add("부산");
		set.add("대구");
		set.add("인천");
		set.add("광주");
		set.add("대전");
		set.add("울산");
		set.add("세종");
		set.add("서울");//이전 서울을 덮어쓴다.
//		list.add를 섰으면 서울이 2개가 등록되어 있을것이다
		
		System.out.println(set);
		//set은 순서에 관계없이 출력된다.
		//HashSet 자체가 Hash원리로 동작하는 거니까 그렇겠지!
		
		//전체 출력, 향상된 for문
		for(String s: set) {
			System.out.println(s+" ");
		}
		System.out.println();
	}
}
