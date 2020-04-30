package d200225;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ex9 {
	public static void main(String[] args) {
		//Set: 중복 허용하지 않음. 순서 없음
		//LinkedHashSet: 순서를 유지한다.
		
		Set<String> set =new LinkedHashSet<String>();
		
		set.add("서울");
		set.add("부산");
		set.add("대구");
		set.add("인천");
		set.add("광주");
		set.add("대전");
		set.add("울산");
		set.add("세종");
		set.add("서울");//무시된다
		
		//입력한 순서 그대로 유지한다.
		System.out.println(set);
		
		//전체 출력. 향상된 for문
		for(String s: set) {
			System.out.print(s + " ");
		}
		System.out.println();
	}
}
