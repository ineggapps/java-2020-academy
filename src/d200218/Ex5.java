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
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy年 MM月 dd日 HH:mm:ss");
			String s = sdf.format(date);
			System.out.println(s);

			sdf = new SimpleDateFormat("yyyy-MM-dd");
			s = "2000-10-10";// SimpleDateFormat의 yyyy-MM-dd와의 서식을 맞춰야 한다.
			Date date2 = sdf.parse(s);
			System.out.println(date2);

			//날짜 계산하기
			long endDay = diffOfday("2020-02-18", "2020-07-06");
			System.out.println(endDay);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
