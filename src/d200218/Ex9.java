package d200218;

import java.util.Arrays;

public class Ex9 {
	public static void main(String[] args) {
		int[] aa = { 10, 20, 30, 40, 50 };
		int[] bb = Arrays.copyOf(aa, aa.length);
//		int[] cc = Arrays.copyOf(aa, aa.length-1);
//		int[] dd = Arrays.copyOf(aa, aa.length+10);//aa�� �迭�� ������ 5���� �����ϰ� �������� 0���� �ʱ�ȭ
		System.out.println(aa==bb);//������ ������ ������ ���� ���� ��ü�� �ƴϴ�. (==���� �ּڰ��� ������ �ʴ´�)
		System.out.println(Arrays.toString(bb));
//		System.out.println(Arrays.toString(cc));
//		System.out.println(Arrays.toString(dd));
		
		int[] cc= Arrays.copyOfRange(aa, 1, 4); //�迭�� ������ �Ϻ� ������ ������ ���� ����.
		//���, from, to-1�ε������� ���� 
		System.out.println(Arrays.toString(cc));
		
		int[] dd = new int[aa.length];
		System.arraycopy(aa, 0, dd, 0, aa.length);//�� �޼��尡 ������ �� �� ������.
		System.out.println(Arrays.toString(dd));
	}
}
