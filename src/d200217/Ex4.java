package d200217;

import java.math.BigDecimal;

public class Ex4 {
	public static void main(String[] args) {
		BigDecimal a = new BigDecimal("1234512341523123123"); //�Ǽ� ó������ ����
		
		System.out.println(a.toString());
		
		BigDecimal b = a.movePointLeft(3);//�Ҽ��� �������� 3ĭ �̵�
		System.out.println(b);
		
		BigDecimal c = a.divide(b);
		System.out.println(c);

		c = a.divide(b, BigDecimal.ROUND_DOWN);
		System.out.println(c);
		
		c = a.divide(b,5, BigDecimal.ROUND_DOWN);//5�� ��ȿ�ڸ����� 5���� �ϰڴٴ� �ǹ�
		System.out.println(c);
	}
}
