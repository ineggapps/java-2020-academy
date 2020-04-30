package d200214;

import java.util.Arrays;

public class Ex8 {
	public static void print(String[] ss) {
		for(String s:ss) {
			System.out.print(s+", ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		String[] ss= {"서울","부산","대구","광주","대전"};

		System.out.print("sort 전: ");
		print(ss);
		
		Arrays.sort(ss);
		
		System.out.print("sort 후: ");
		print(ss);
	}
}