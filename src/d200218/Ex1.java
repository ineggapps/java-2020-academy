package d200218;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Ex1 {
	public static void main(String[] args) {
		int n = 1234567;
		String s;

		System.out.println(String.format(Locale.UK, "%,d", 999999));
		s = String.format("%,d", n);
		System.out.println(s);

		NumberFormat nf = NumberFormat.getInstance();
		s = nf.format(n);// ���� format�̶�� �޼��忡 n�� ������ ���ε� ,(comma)�� ������?
		System.out.println(s);
		s = "1,234,567,890";
		try {
//			Number ob = nf.parse(s);
//			Integer ob = Integer.parseInt(nf.parse(s).toString());
			Long ob = (Long) nf.parse(s);
			long x = ob + 10;
			System.out.println(x);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		double d = 13456.262626262626;
		s = nf.format(d);// �Ҽ��� 3�ڸ������� ����. 4° �ڸ����� �ݿø�
		System.out.println(s);

		NumberFormat nf2 = NumberFormat.getCurrencyInstance();// ��ȭ ��ȣ�� ��� �ִ� Instance��ü
		s = nf2.format(n);// �ü�� ���� ������ �°� ��ȭ��ȣ�� �ڵ����� ����
		System.out.println(s);

		NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.US);// ��ȭ ��ȣ�� ��� �ִ� Instance��ü
		s = nf3.format(n);// Locale�� US�� �����Ͽ����Ƿ� ��� ���� �����̵� US ��ȭ��ȣ�� ��µȴ�.
		System.out.println(s);

	}
}
