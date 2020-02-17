package d200217;

import java.util.Calendar;

public class Ex6 {
	public static void main(String[] args) {
		//OO이가 2020년 2월 10일 여자친구를 처음 만났다. 100일 후는 몇 월 며칠인가?
		Calendar cal = Calendar.getInstance();
		//2020년 2월 10일로 설정하기
		cal.set(2020, 2-1, 20);//날짜를 임의로 조절해야 한다. 단, 월은 [월-1]을 지켜서 입력해야 한다.
		//현재 날짜에서 100일을 더하는 방법
		cal.add(Calendar.DATE, 100);
		//계산된 결괏값 조회
		System.out.printf("%tF %tA %tT",cal,cal,cal);
	}
}
