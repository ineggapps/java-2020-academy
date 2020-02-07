package d200207;

import java.util.Arrays;

public class ArrayEx9 {
	public static void main(String[] args) {
		//로또는 1에서 45까지의 숫자를 5개를 발생시킨다.
		//(int)(Math.random()*45)+1
		//배열 정렬하기
		int []num = new int[6];
		for(int i=0;i<num.length;i++) {
			num[i]=(int)(Math.random()*45)+1;
		}
		////////////////////정렬하는 메서드
		Arrays.sort(num);
		for(int a:num) {
			System.out.println(a);
		}
	}
}
