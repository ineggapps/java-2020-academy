package d200218;

import java.util.Arrays;
import java.util.Collections;

public class Ex8 {
	public static void main(String[] args) {
		String[] ss= {"�ڹ�","CSS","HTML","������","AI"};

		Arrays.sort(ss);//�������� ����
		System.out.println("��������");
		print(ss);
		Arrays.sort(ss,Collections.reverseOrder());//�������� ����
		System.out.println("��������");
		print(ss);
		
		int [] nn = {10,5,80,70};
//		String s = nn.toString();//[I@�ؽð�16���� ���
		String s =Arrays.toString(nn);//[�迭�� ���빰] ���
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
