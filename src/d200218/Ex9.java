package d200218;

import java.util.Arrays;

public class Ex9 {
	public static void main(String[] args) {
		int[] aa = { 10, 20, 30, 40, 50 };
		int[] bb = Arrays.copyOf(aa, aa.length);
		System.out.println(aa==bb);//내용을 복사한 것이지 절대 같은 객체가 아니다. (==같은 주솟값을 지니지 않는다)
		System.out.println(Arrays.toString(bb));
	}
}
