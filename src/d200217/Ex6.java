package d200217;

import java.util.Calendar;

public class Ex6 {
	public static void main(String[] args) {
		// OO이가 2020년 2월 10일 여자친구를 처음 만났다. 100일 후는 몇 월 며칠인가?
		Calendar cal = Calendar.getInstance();
		// 2020년 2월 10일로 설정하기
		cal.set(2020, 2 - 1, 20);// 날짜를 임의로 조절해야 한다. 단, 월은 [월-1]을 지켜서 입력해야 한다.
		// 현재 날짜에서 100일을 더하는 방법
		cal.add(Calendar.DATE, 100);
		// 계산된 결괏값 조회
		System.out.printf("%tF %tA %tT", cal, cal, cal);
		System.out.println();

		// OO이는 태어나서 며칠동안 살았는지?
		Calendar now = Calendar.getInstance();// 현재를 나타내는 달력
//		System.out.println(now.getTimeInMillis());
		// 현재 날짜를 1970년 1월 1일 ms로 환산하여 나타낸 결괏값을 날짜로 출력한다.
		System.out.println(now.getTime());
		// 태어난 날짜를 구하는 방법?
		cal.set(1999, 10 - 1, 9);

		long days = (now.getTimeInMillis() - cal.getTimeInMillis()) / (1000 * 60 * 60 * 24);
		System.out.println(days);
		System.out.println("나이:" + days/30/12);
	}
}
