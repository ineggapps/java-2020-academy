package d200218;

import java.util.Arrays;

public class Ex9 {
	public static void main(String[] args) {
		int[] aa = { 10, 20, 30, 40, 50 };
		int[] bb = Arrays.copyOf(aa, aa.length);
		System.out.println(aa==bb);//������ ������ ������ ���� ���� ��ü�� �ƴϴ�. (==���� �ּڰ��� ������ �ʴ´�)
		System.out.println(Arrays.toString(bb));
	}
}
