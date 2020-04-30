package d200218;

import java.util.Arrays;

public class Ex9 {
	public static void main(String[] args) {
		int[] aa = { 10, 20, 30, 40, 50 };
		int[] bb = Arrays.copyOf(aa, aa.length);
//		int[] cc = Arrays.copyOf(aa, aa.length-1);
//		int[] dd = Arrays.copyOf(aa, aa.length+10);//aa의 배열의 길이인 5개를 복사하고 나머지는 0으로 초기화
		System.out.println(aa==bb);//내용을 복사한 것이지 절대 같은 객체가 아니다. (==같은 주솟값을 지니지 않는다)
		System.out.println(Arrays.toString(bb));
//		System.out.println(Arrays.toString(cc));
//		System.out.println(Arrays.toString(dd));
		
		int[] cc= Arrays.copyOfRange(aa, 1, 4); //배열의 복사할 일부 범위를 지정할 수도 있음.
		//대상, from, to-1인덱스까지 복사 
		System.out.println(Arrays.toString(cc));
		
		int[] dd = new int[aa.length];
		System.arraycopy(aa, 0, dd, 0, aa.length);//이 메서드가 연산이 좀 더 빠르다.
		System.out.println(Arrays.toString(dd));
	}
}
