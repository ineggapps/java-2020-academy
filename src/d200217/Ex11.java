package d200217;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex11 {
	public static void main(String[] args) {
		// java.util.Date �ǽ�
		Date d1 = new Date();
		System.out.println(d1);

//		//deprecated�� �޼����̹Ƿ� ����� �������� �ʴ� �����.
//		int y = d1.getYear()+1900;
//		int m = d1.getMonth();
//		int d = d1.getDate();
//		System.out.printf("%d�� %d�� %d��", y, m, d);

		// 1970�� 1�� 1�� 0�� 0�� 0�� �������� ms�� ��ȯ�Ѵ�.
		long t = d1.getTime();
		System.out.println(t);

		Date d2 = new Date(1581908783300L);
		System.out.println(d2);
		System.out.println(d1.after(d2));// d1�� �񱳴�󺸴� �ڿ� �ִ���?

		SimpleDateFormat f = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss�� S");
		String s = f.format(d1);
		System.out.println(s);

		// String => Date������ ��ȯ�ϴ� ���
		String s2 = "2000-01-20";
		SimpleDateFormat f2 = new SimpleDateFormat("yyyy-MM-dd");// String�� �Էµ� ���� �״�� �Է��� �־�� ��.
		Date date;
		try {
			date = f2.parse(s2);
			System.out.println(date);
			System.out.println(new SimpleDateFormat("yyyy�� MM�� dd��").format(date));
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
}
