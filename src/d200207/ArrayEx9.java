package d200207;

import java.util.Arrays;

public class ArrayEx9 {
	public static void main(String[] args) {
		//�ζǴ� 1���� 45������ ���ڸ� 5���� �߻���Ų��.
		//(int)(Math.random()*45)+1
		//�迭 �����ϱ�
		int []num = new int[6];
		for(int i=0;i<num.length;i++) {
			num[i]=(int)(Math.random()*45)+1;
		}
		////////////////////�����ϴ� �޼���
		Arrays.sort(num);
		for(int a:num) {
			System.out.println(a);
		}
	}
}
