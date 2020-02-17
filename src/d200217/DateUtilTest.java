package d200217;

import java.util.Date;

public class DateUtilTest {
	public static void main(String[] args) {
		DateUtil d = new DateUtil();
		Date date = new Date();
		System.out.println(d.toString(date));
	}
}
