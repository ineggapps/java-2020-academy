package d200218;

import java.util.Arrays;
import java.util.Collections;

public class Ex8 {
	public static void main(String[] args) {
		String[] ss= {"자바","CSS","HTML","스프링","AI"};

		Arrays.sort(ss);//오름차순 정렬
		System.out.println("오름차순");
		print(ss);
		Arrays.sort(ss,Collections.reverseOrder());//내림차순 정렬
		System.out.println("내림차순");
		print(ss);
		
		int [] nn = {10,5,80,70};
//		String s = nn.toString();//[I@해시값16진수 출력
		String s =Arrays.toString(nn);//[배열의 내용물] 출력
		System.out.println(s);
	}	
	
	public static void print(String[] ss) {
		for(String s:ss) {
			System.out.print(s+"\t");
		}
		System.out.println();
		System.out.println();
	}
}
