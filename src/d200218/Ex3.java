package d200218;

import java.text.DecimalFormat;

public class Ex3 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,##0");
		String s;

		s = df.format(123456.123);
		System.out.println(s);//123,456 ��µ�
		
	
		//#, 0 �� ��ȯ ���ڿ� ���� ������ API�� ����.
//		DecimalFormat df2 = new DecimalFormat("#,##0.#");//�Ҽ����� 1�ڸ� but ����=>���� ���
		DecimalFormat df2 = new DecimalFormat("#,##0.0");//�Ҽ����� 1�ڸ�. �������� n.0 ���
//		s=df2.format(123456.173);//���Ŀ� ���߾� �Ҽ��� n+1��° �ڸ����� �ݿø���
		s=df2.format(123456);//���Ŀ� ���߾� �Ҽ��� n+1��° �ڸ����� �ݿø���
		System.out.println(s);
	}
}
