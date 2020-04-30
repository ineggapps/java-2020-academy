package d200217;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex12 {
	public static void main(String[] args) {
		try {
			String s = "2000-10-10";
			SimpleDateFormat f= new SimpleDateFormat("yyyy-MM-dd");
			Date date = f.parse(s);
			
			Calendar cal = Calendar.getInstance();
			//Date->Calendar 
			cal.setTime(date);
			System.out.printf("%tF\n",cal);
			
			//Calendar -> Date
			Date date2 = cal.getTime();
			System.out.println(date2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}