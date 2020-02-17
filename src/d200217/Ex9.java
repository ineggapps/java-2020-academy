package d200217;

import java.util.Calendar;

public class Ex9 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		Calendar cal = Calendar.getInstance();
		//생일 대입
		cal.set(1999,10-1,9);
		
		//만 나이 계산하기
		int age = (now.get(Calendar.YEAR)-cal.get(Calendar.YEAR));
		if(cal.get(Calendar.MONTH)>now.get(Calendar.MONTH) || 
				cal.get(Calendar.DATE) > now.get(Calendar.DATE)) {
			age--;
		}
		System.out.println(age);
		//또는...
		long days = (now.getTimeInMillis() - cal.getTimeInMillis()) / (1000 * 60 * 60 * 24);
		System.out.println("나이:" + days/30/12);
	}
}
