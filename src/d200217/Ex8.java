package d200217;

import java.util.Calendar;

public class Ex8 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.printf("%tF\n", cal);
		
		cal.set(Calendar.MONTH, 15);
		System.out.printf("%tF\n", cal);
		
		cal.add(Calendar.DATE, -50);
		System.out.printf("%tF\n",cal);
	}
}
