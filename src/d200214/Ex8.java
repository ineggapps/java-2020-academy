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
		String[] ss= {"����","�λ�","�뱸","����","����"};

		System.out.print("sort ��: ");
		print(ss);
		
		Arrays.sort(ss);
		
		System.out.print("sort ��: ");
		print(ss);
	}
}