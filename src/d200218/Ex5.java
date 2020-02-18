package d200218;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex5 {
	public static long diffOfday(String begin, String end) {
		long diff = 0;
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			begin = begin.replaceAll("(\\-|\\.|/)", "");
			end = end.replaceAll("(\\-|\\.|/)", "");
			
			Date d1 = sdf.parse(begin);
			Date d2 = sdf.parse(end);
			
			diff = (d2.getTime()-d1.getTime())/(1000*60*60*24);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return diff;
	}

	public static void main(String[] args) {
		try {
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyҴ MM�� dd�� HH:mm:ss");
			String s = sdf.format(date);
			System.out.println(s);

			sdf = new SimpleDateFormat("yyyy-MM-dd");
			s = "2000-10-10";// SimpleDateFormat�� yyyy-MM-dd���� ������ ����� �Ѵ�.
			Date date2 = sdf.parse(s);
			System.out.println(date2);

			//��¥ ����ϱ�
			long endDay = diffOfday("2020-02-18", "2020-07-06");
			System.out.println(endDay);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
