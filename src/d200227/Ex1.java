package d200227;

import java.util.Arrays;
import java.util.Collections;

public class Ex1 {
	public static void main(String[] args) {
		//Shuffle ����
		
		String[] ss = new String[] { "java", "css", "html", "javascript", "jsp" };
		System.out.println(Arrays.toString(ss));

		// String[] => List<String>: Arrays.asList(�迭);
		Collections.shuffle(Arrays.asList(ss));// �迭�� list�� ��ȯ�Ͽ� ����
		System.out.println(Arrays.toString(ss));

		Integer[] ii = { 10, 20, 30, 40, 50 };
		System.out.println(Arrays.toString(ii));
		Collections.shuffle(Arrays.asList(ii));//int[] �� �ȴ�. ��ü�� �ƴϴϱ�.
		System.out.println(Arrays.toString(ii));
		
		
	}
}
