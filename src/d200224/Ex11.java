package d200224;
import java.util.ArrayList;
import java.util.List;

public class Ex11 {
	public static void main(String[] args) {
		// ArrayList: List 인터페이스의 구현 클래스
		// Collection 중에서 배열과 가장 유사하다.
		// 메모리가 허용할 때까지 무제한으로 데이터의 삽입이 가능하다.
		String s;
		List<String> list = new ArrayList<>(); // 업캐스팅
		list.add("서울");
		list.add("부산");
		list.add("대구");
		list.add("인천");
		list.add("광주");
		list.add("대전");

		System.out.println("개수: " + list.size());
		//처음
		s = list.get(0);
		System.out.println("처음: " + s);
		//두 번째
		s = list.get(1);
		System.out.println("두 번째: " + s);
		//마지막
		s = list.get(list.size()-1);
		System.out.println("마지막: " + s);
		
		//처음에 한국을 추가 (삽입)
		list.add(0, "한국");
		s=list.get(0);
		System.out.println(list);
		
		//0번째 인덱스 변경
		list.set(0, "대한민국");
		s=list.get(0);
		System.out.println(list);
		
		//인천 인덱스★
		System.out.println("인천 인덱스: " + list.indexOf("인천"));
		
		//세종 인덱스 -1 (없으니까)
		System.out.println("세종 인덱스: "+list.indexOf("세종"));
		
		//부산 존재 여부
		System.out.println("부산 존재 여부(boolean): " + list.contains("부산"));
		
		//대한민국 지우기
		list.remove(0);
//		list.remove("대한민국"); //또는 이렇게 지우기도 가능하다. (흔하지는 않음)
		System.out.println(list);

		System.out.println("전체-1");
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i) +"\t");
		}
		System.out.println();
		System.out.println("전체 출력2");
		for(String i: list) {
			System.out.print(i+"\t");
		}
		System.out.println();
	}
}
