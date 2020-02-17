package d200217;

import java.text.SimpleDateFormat;
import java.util.Date;

//나중에 예외처리를 추가하면 더 나은 클래스로 변환할 수 있음.
public class DateUtil {
	/**
	 * String형 날짜를 Date형으로 변환
	 * @param strDate 변환할 날짜
	 * @return 변환된 Date형
	 */
	public Date toDate(String strDate) {
		Date date = null;
		try {
			strDate.replaceAll("(\\-|\\.|/)", "");
			if(strDate.length()!=8) {
				//TODO: 예외 던진다.
				return null;
			}
			//모든 날짜형식이 변환되었으므로 형식은 다음과 같이 입력한다 yyyyMMdd
			SimpleDateFormat f = new SimpleDateFormat("yyyyMMdd");
			date = f.parse(strDate);
		} catch (Exception e) {
			// TODO: 예외 던진다
			System.out.println("예외 발생");
			e.printStackTrace();
		}
		return date;
	}
	
	public String toString(Date date) {
		String s = null;
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		s = f.format(date);
		return s;
	}
}