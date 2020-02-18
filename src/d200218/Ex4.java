package d200218;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Ex4 {
	public static void main(String[] args) {
		DateFormat df;
		Date date = new Date();
		String s;

		df = DateFormat.getDateInstance();//2020. 2. 18
		df = DateFormat.getDateInstance(DateFormat.LONG, Locale.KOREAN);//2020년 2월 18일(화)
		s = df.format(date);
		
		System.out.println(s);
	}
}
