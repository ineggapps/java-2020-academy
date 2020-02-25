package d200225;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex1 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();

		list1.add("서울");
		list1.add("부산");
		list1.add("대구");

		List<String> list2 = new ArrayList<String>();

		list2.add("강원");
		list2.add("경기");
		list2.add("경상");

		// list2에 list1의 모든 데이터를 추가하기
		list2.addAll(list1);
		System.out.println(list2);

		// List에서 String배열로 변환하기
		String[] ss = list2.toArray(new String[list2.size()]);
		for (String s : ss) {
			System.out.print(s + " ");
		}
		System.out.println();

		//String배열에서 List로 변환하기
		List<String> list3 = Arrays.asList(ss);
		System.out.println("리스트 변환 후: " + list3);
		
		//subList(a,b): a인덱스에서 b-1부분의 List만 추출하기
		List<String> list4= list2.subList(2, 4); //2,3번째 인덱스의 자료를 추출
		System.out.println(list4);
		
		//전체 삭제
		list1.clear();
		System.out.println(list1.size());
		
		//list3의 경상, 서울, 부산 삭제
		System.out.println("삭제 전: "+list2);
		list2.subList(2, 5).clear();//인덱스 2, 3, 4 삭제
		System.out.println("삭제 후: "+list2);
	}
}
