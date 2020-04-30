package d200227;

import java.util.Arrays;
import java.util.Collections;

public class Ex1 {
	public static void main(String[] args) {
		//Shuffle 예제
		
		String[] ss = new String[] { "java", "css", "html", "javascript", "jsp" };
		System.out.println(Arrays.toString(ss));

		// String[] => List<String>: Arrays.asList(배열);
		Collections.shuffle(Arrays.asList(ss));// 배열을 list로 변환하여 섞기
		System.out.println(Arrays.toString(ss));

		Integer[] ii = { 10, 20, 30, 40, 50 };
		System.out.println(Arrays.toString(ii));
		Collections.shuffle(Arrays.asList(ii));//int[] 안 된다. 객체가 아니니까.
		System.out.println(Arrays.toString(ii));
		
		
	}
}
