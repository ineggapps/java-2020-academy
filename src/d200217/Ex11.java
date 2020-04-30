package d200217;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex11 {
	public static void main(String[] args) {
		// java.util.Date 실습
		Date d1 = new Date();
		System.out.println(d1);

//		//deprecated된 메서드이므로 사용을 권장하지 않는 방식임.
//		int y = d1.getYear()+1900;
//		int m = d1.getMonth();
//		int d = d1.getDate();
//		System.out.printf("%d년 %d월 %d일", y, m, d);

		// 1970년 1월 1일 0시 0분 0초 기준으로 ms로 반환한다.
		long t = d1.getTime();
		System.out.println(t);

		Date d2 = new Date(1581908783300L);
		System.out.println(d2);
		System.out.println(d1.after(d2));// d1이 비교대상보다 뒤에 있는지?

		SimpleDateFormat f = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초 S");
		String s = f.format(d1);
		System.out.println(s);

		// String => Date형으로 변환하는 방법
		String s2 = "2000-01-20";
		SimpleDateFormat f2 = new SimpleDateFormat("yyyy-MM-dd");// String에 입력된 형식 그대로 입력해 주어야 함.
		Date date;
		try {
			date = f2.parse(s2);
			System.out.println(date);
			System.out.println(new SimpleDateFormat("yyyy년 MM월 dd일").format(date));
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
}
